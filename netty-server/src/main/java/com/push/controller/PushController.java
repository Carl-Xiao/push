package com.push.controller;

import com.common.model.CustomProtocol;
import com.common.model.enums.StatusEnum;
import com.common.model.res.BaseResponse;
import com.common.model.req.SendMsgReqVO;
import com.common.model.res.SendMsgResVO;
import com.push.netty.server.NettyServer;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author：carl
 * @date: 2021/12/23
 */
@RestController
@RequestMapping("/")
public class PushController {

    @Resource
    NettyServer nettyServer;

    @RequestMapping("sendMsg")
    public BaseResponse<SendMsgResVO> sendMsg(@RequestBody SendMsgReqVO sendMsgReqVO){
        BaseResponse<SendMsgResVO> res = new BaseResponse();
        nettyServer.sendMsg(new CustomProtocol(sendMsgReqVO.getId(),sendMsgReqVO.getMsg())) ;
        SendMsgResVO sendMsgResVO = new SendMsgResVO() ;
        sendMsgResVO.setMsg("OK") ;
        res.setCode(StatusEnum.SUCCESS.getCode()) ;
        res.setMessage(StatusEnum.SUCCESS.getMsg()) ;
        res.setData(sendMsgResVO); ;
        return res ;
    }

}
