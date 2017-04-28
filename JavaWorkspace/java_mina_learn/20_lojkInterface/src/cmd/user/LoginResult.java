// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message/user.proto

package cmd.user;

/**
 * Protobuf type {@code cmd.user.LoginResult}
 *
 * <pre>
 *服务器端发送
 * </pre>
 */
public  final class LoginResult extends
    com.google.protobuf.GeneratedMessage
    implements LoginResultOrBuilder {
  // Use LoginResult.newBuilder() to construct.
  private LoginResult(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private LoginResult(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final LoginResult defaultInstance;
  public static LoginResult getDefaultInstance() {
    return defaultInstance;
  }

  public LoginResult getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private LoginResult(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    initFields();
    int mutable_bitField0_ = 0;
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
          default: {
            if (!parseUnknownField(input, unknownFields,
                                   extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();
            cmd.user.LoginResult.Result value = cmd.user.LoginResult.Result.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(1, rawValue);
            } else {
              bitField0_ |= 0x00000001;
              result_ = value;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cmd.user.User.internal_static_cmd_user_LoginResult_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cmd.user.User.internal_static_cmd_user_LoginResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cmd.user.LoginResult.class, cmd.user.LoginResult.Builder.class);
  }

  public static com.google.protobuf.Parser<LoginResult> PARSER =
      new com.google.protobuf.AbstractParser<LoginResult>() {
    public LoginResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LoginResult(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<LoginResult> getParserForType() {
    return PARSER;
  }

  /**
   * Protobuf enum {@code cmd.user.LoginResult.Result}
   */
  public enum Result
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>SUCCESS = 0;</code>
     */
    SUCCESS(0, 0),
    /**
     * <code>FAILURE = 1;</code>
     */
    FAILURE(1, 1),
    ;

    /**
     * <code>SUCCESS = 0;</code>
     */
    public static final int SUCCESS_VALUE = 0;
    /**
     * <code>FAILURE = 1;</code>
     */
    public static final int FAILURE_VALUE = 1;


    public final int getNumber() { return value; }

    public static Result valueOf(int value) {
      switch (value) {
        case 0: return SUCCESS;
        case 1: return FAILURE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Result>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<Result>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Result>() {
            public Result findValueByNumber(int number) {
              return Result.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return cmd.user.LoginResult.getDescriptor().getEnumTypes().get(0);
    }

    private static final Result[] VALUES = values();

    public static Result valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private Result(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:cmd.user.LoginResult.Result)
  }

  private int bitField0_;
  // required .cmd.user.LoginResult.Result result = 1;
  public static final int RESULT_FIELD_NUMBER = 1;
  private cmd.user.LoginResult.Result result_;
  /**
   * <code>required .cmd.user.LoginResult.Result result = 1;</code>
   */
  public boolean hasResult() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>required .cmd.user.LoginResult.Result result = 1;</code>
   */
  public cmd.user.LoginResult.Result getResult() {
    return result_;
  }

  private void initFields() {
    result_ = cmd.user.LoginResult.Result.SUCCESS;
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized != -1) return isInitialized == 1;

    if (!hasResult()) {
      memoizedIsInitialized = 0;
      return false;
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeEnum(1, result_.getNumber());
    }
    getUnknownFields().writeTo(output);
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_.getNumber());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  protected java.lang.Object writeReplace()
      throws java.io.ObjectStreamException {
    return super.writeReplace();
  }

  public static cmd.user.LoginResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cmd.user.LoginResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cmd.user.LoginResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cmd.user.LoginResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cmd.user.LoginResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static cmd.user.LoginResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static cmd.user.LoginResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static cmd.user.LoginResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static cmd.user.LoginResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static cmd.user.LoginResult parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(cmd.user.LoginResult prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code cmd.user.LoginResult}
   *
   * <pre>
   *服务器端发送
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
     implements cmd.user.LoginResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cmd.user.User.internal_static_cmd_user_LoginResult_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cmd.user.User.internal_static_cmd_user_LoginResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cmd.user.LoginResult.class, cmd.user.LoginResult.Builder.class);
    }

    // Construct using cmd.user.LoginResult.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      result_ = cmd.user.LoginResult.Result.SUCCESS;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cmd.user.User.internal_static_cmd_user_LoginResult_descriptor;
    }

    public cmd.user.LoginResult getDefaultInstanceForType() {
      return cmd.user.LoginResult.getDefaultInstance();
    }

    public cmd.user.LoginResult build() {
      cmd.user.LoginResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public cmd.user.LoginResult buildPartial() {
      cmd.user.LoginResult result = new cmd.user.LoginResult(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.result_ = result_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof cmd.user.LoginResult) {
        return mergeFrom((cmd.user.LoginResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cmd.user.LoginResult other) {
      if (other == cmd.user.LoginResult.getDefaultInstance()) return this;
      if (other.hasResult()) {
        setResult(other.getResult());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      return this;
    }

    public final boolean isInitialized() {
      if (!hasResult()) {
        
        return false;
      }
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      cmd.user.LoginResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cmd.user.LoginResult) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    // required .cmd.user.LoginResult.Result result = 1;
    private cmd.user.LoginResult.Result result_ = cmd.user.LoginResult.Result.SUCCESS;
    /**
     * <code>required .cmd.user.LoginResult.Result result = 1;</code>
     */
    public boolean hasResult() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .cmd.user.LoginResult.Result result = 1;</code>
     */
    public cmd.user.LoginResult.Result getResult() {
      return result_;
    }
    /**
     * <code>required .cmd.user.LoginResult.Result result = 1;</code>
     */
    public Builder setResult(cmd.user.LoginResult.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required .cmd.user.LoginResult.Result result = 1;</code>
     */
    public Builder clearResult() {
      bitField0_ = (bitField0_ & ~0x00000001);
      result_ = cmd.user.LoginResult.Result.SUCCESS;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:cmd.user.LoginResult)
  }

  static {
    defaultInstance = new LoginResult(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:cmd.user.LoginResult)
}
