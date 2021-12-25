// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BaseRequest.proto

package com.common.model.protobuf;

public final class BaseRequestProto {
  private BaseRequestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Request)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string reqId = 1;</code>
     * @return The reqId.
     */
    java.lang.String getReqId();
    /**
     * <code>string reqId = 1;</code>
     * @return The bytes for reqId.
     */
    com.google.protobuf.ByteString
        getReqIdBytes();

    /**
     * <code>string reqMsg = 2;</code>
     * @return The reqMsg.
     */
    java.lang.String getReqMsg();
    /**
     * <code>string reqMsg = 2;</code>
     * @return The bytes for reqMsg.
     */
    com.google.protobuf.ByteString
        getReqMsgBytes();
  }
  /**
   * <pre>
   *请求体
   * </pre>
   *
   * Protobuf type {@code Request}
   */
  public static final class Request extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Request)
      RequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Request.newBuilder() to construct.
    private Request(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Request() {
      reqId_ = "";
      reqMsg_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Request();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Request(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              reqId_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              reqMsg_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.common.model.protobuf.BaseRequestProto.internal_static_Request_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.common.model.protobuf.BaseRequestProto.internal_static_Request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.common.model.protobuf.BaseRequestProto.Request.class, com.common.model.protobuf.BaseRequestProto.Request.Builder.class);
    }

    public static final int REQID_FIELD_NUMBER = 1;
    private volatile java.lang.Object reqId_;
    /**
     * <code>string reqId = 1;</code>
     * @return The reqId.
     */
    @java.lang.Override
    public java.lang.String getReqId() {
      java.lang.Object ref = reqId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        reqId_ = s;
        return s;
      }
    }
    /**
     * <code>string reqId = 1;</code>
     * @return The bytes for reqId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getReqIdBytes() {
      java.lang.Object ref = reqId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reqId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int REQMSG_FIELD_NUMBER = 2;
    private volatile java.lang.Object reqMsg_;
    /**
     * <code>string reqMsg = 2;</code>
     * @return The reqMsg.
     */
    @java.lang.Override
    public java.lang.String getReqMsg() {
      java.lang.Object ref = reqMsg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        reqMsg_ = s;
        return s;
      }
    }
    /**
     * <code>string reqMsg = 2;</code>
     * @return The bytes for reqMsg.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getReqMsgBytes() {
      java.lang.Object ref = reqMsg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reqMsg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reqId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, reqId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reqMsg_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, reqMsg_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reqId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, reqId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reqMsg_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, reqMsg_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.common.model.protobuf.BaseRequestProto.Request)) {
        return super.equals(obj);
      }
      com.common.model.protobuf.BaseRequestProto.Request other = (com.common.model.protobuf.BaseRequestProto.Request) obj;

      if (!getReqId()
          .equals(other.getReqId())) return false;
      if (!getReqMsg()
          .equals(other.getReqMsg())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + REQID_FIELD_NUMBER;
      hash = (53 * hash) + getReqId().hashCode();
      hash = (37 * hash) + REQMSG_FIELD_NUMBER;
      hash = (53 * hash) + getReqMsg().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.common.model.protobuf.BaseRequestProto.Request parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.common.model.protobuf.BaseRequestProto.Request parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.common.model.protobuf.BaseRequestProto.Request parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.common.model.protobuf.BaseRequestProto.Request parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.common.model.protobuf.BaseRequestProto.Request parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.common.model.protobuf.BaseRequestProto.Request parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.common.model.protobuf.BaseRequestProto.Request parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.common.model.protobuf.BaseRequestProto.Request parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.common.model.protobuf.BaseRequestProto.Request parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.common.model.protobuf.BaseRequestProto.Request parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.common.model.protobuf.BaseRequestProto.Request parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.common.model.protobuf.BaseRequestProto.Request parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.common.model.protobuf.BaseRequestProto.Request prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *请求体
     * </pre>
     *
     * Protobuf type {@code Request}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Request)
        com.common.model.protobuf.BaseRequestProto.RequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.common.model.protobuf.BaseRequestProto.internal_static_Request_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.common.model.protobuf.BaseRequestProto.internal_static_Request_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.common.model.protobuf.BaseRequestProto.Request.class, com.common.model.protobuf.BaseRequestProto.Request.Builder.class);
      }

      // Construct using com.common.model.protobuf.BaseRequestProto.Request.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        reqId_ = "";

        reqMsg_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.common.model.protobuf.BaseRequestProto.internal_static_Request_descriptor;
      }

      @java.lang.Override
      public com.common.model.protobuf.BaseRequestProto.Request getDefaultInstanceForType() {
        return com.common.model.protobuf.BaseRequestProto.Request.getDefaultInstance();
      }

      @java.lang.Override
      public com.common.model.protobuf.BaseRequestProto.Request build() {
        com.common.model.protobuf.BaseRequestProto.Request result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.common.model.protobuf.BaseRequestProto.Request buildPartial() {
        com.common.model.protobuf.BaseRequestProto.Request result = new com.common.model.protobuf.BaseRequestProto.Request(this);
        result.reqId_ = reqId_;
        result.reqMsg_ = reqMsg_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.common.model.protobuf.BaseRequestProto.Request) {
          return mergeFrom((com.common.model.protobuf.BaseRequestProto.Request)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.common.model.protobuf.BaseRequestProto.Request other) {
        if (other == com.common.model.protobuf.BaseRequestProto.Request.getDefaultInstance()) return this;
        if (!other.getReqId().isEmpty()) {
          reqId_ = other.reqId_;
          onChanged();
        }
        if (!other.getReqMsg().isEmpty()) {
          reqMsg_ = other.reqMsg_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.common.model.protobuf.BaseRequestProto.Request parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.common.model.protobuf.BaseRequestProto.Request) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object reqId_ = "";
      /**
       * <code>string reqId = 1;</code>
       * @return The reqId.
       */
      public java.lang.String getReqId() {
        java.lang.Object ref = reqId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          reqId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string reqId = 1;</code>
       * @return The bytes for reqId.
       */
      public com.google.protobuf.ByteString
          getReqIdBytes() {
        java.lang.Object ref = reqId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          reqId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string reqId = 1;</code>
       * @param value The reqId to set.
       * @return This builder for chaining.
       */
      public Builder setReqId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        reqId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string reqId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearReqId() {
        
        reqId_ = getDefaultInstance().getReqId();
        onChanged();
        return this;
      }
      /**
       * <code>string reqId = 1;</code>
       * @param value The bytes for reqId to set.
       * @return This builder for chaining.
       */
      public Builder setReqIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        reqId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object reqMsg_ = "";
      /**
       * <code>string reqMsg = 2;</code>
       * @return The reqMsg.
       */
      public java.lang.String getReqMsg() {
        java.lang.Object ref = reqMsg_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          reqMsg_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string reqMsg = 2;</code>
       * @return The bytes for reqMsg.
       */
      public com.google.protobuf.ByteString
          getReqMsgBytes() {
        java.lang.Object ref = reqMsg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          reqMsg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string reqMsg = 2;</code>
       * @param value The reqMsg to set.
       * @return This builder for chaining.
       */
      public Builder setReqMsg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        reqMsg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string reqMsg = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearReqMsg() {
        
        reqMsg_ = getDefaultInstance().getReqMsg();
        onChanged();
        return this;
      }
      /**
       * <code>string reqMsg = 2;</code>
       * @param value The bytes for reqMsg to set.
       * @return This builder for chaining.
       */
      public Builder setReqMsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        reqMsg_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Request)
    }

    // @@protoc_insertion_point(class_scope:Request)
    private static final com.common.model.protobuf.BaseRequestProto.Request DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.common.model.protobuf.BaseRequestProto.Request();
    }

    public static com.common.model.protobuf.BaseRequestProto.Request getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Request>
        PARSER = new com.google.protobuf.AbstractParser<Request>() {
      @java.lang.Override
      public Request parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Request(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Request> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Request> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.common.model.protobuf.BaseRequestProto.Request getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Request_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Request_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021BaseRequest.proto\"(\n\007Request\022\r\n\005reqId\030" +
      "\001 \001(\t\022\016\n\006reqMsg\030\002 \001(\tB-\n\031com.common.mode" +
      "l.protobufB\020BaseRequestProtob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Request_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Request_descriptor,
        new java.lang.String[] { "ReqId", "ReqMsg", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
