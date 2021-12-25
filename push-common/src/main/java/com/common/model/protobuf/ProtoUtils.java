package com.common.model.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;

/**
 * @description: pb文件测试demo
 * @author：carl
 * @date: 2021/12/25
 */
public class ProtoUtils {
    public static void main(String[] args) {
        BaseRequestProto.Request protocol = BaseRequestProto.Request.newBuilder()
                .setReqId("123")
                .setReqMsg("你好啊")
                .build();

        byte[] encode = encode(protocol);

        BaseRequestProto.Request parseFrom = null;
        try {
            parseFrom = decode(encode);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
        System.out.println(protocol.toString());
        System.out.println(protocol.toString().equals(parseFrom.toString()));
    }
    /**
     * 编码
     *
     * @param protocol
     * @return
     */
    public static byte[] encode(BaseRequestProto.Request protocol) {
        return protocol.toByteArray();
    }

    /**
     * 解码
     *
     * @param bytes
     * @return
     * @throws InvalidProtocolBufferException
     */
    public static BaseRequestProto.Request decode(byte[] bytes) throws InvalidProtocolBufferException {
        return BaseRequestProto.Request.parseFrom(bytes);
    }

}
