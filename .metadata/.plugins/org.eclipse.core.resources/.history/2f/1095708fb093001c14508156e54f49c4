package com.mycompany;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: employee.proto")
public final class employeeGrpc {

  private employeeGrpc() {}

  public static final String SERVICE_NAME = "employee";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.mycompany.Employee.EmployeePrimarySkillRequest,
      com.mycompany.Employee.APIResponse> getGetEmployeePrimarySkillMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getEmployeePrimarySkill",
      requestType = com.mycompany.Employee.EmployeePrimarySkillRequest.class,
      responseType = com.mycompany.Employee.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mycompany.Employee.EmployeePrimarySkillRequest,
      com.mycompany.Employee.APIResponse> getGetEmployeePrimarySkillMethod() {
    io.grpc.MethodDescriptor<com.mycompany.Employee.EmployeePrimarySkillRequest, com.mycompany.Employee.APIResponse> getGetEmployeePrimarySkillMethod;
    if ((getGetEmployeePrimarySkillMethod = employeeGrpc.getGetEmployeePrimarySkillMethod) == null) {
      synchronized (employeeGrpc.class) {
        if ((getGetEmployeePrimarySkillMethod = employeeGrpc.getGetEmployeePrimarySkillMethod) == null) {
          employeeGrpc.getGetEmployeePrimarySkillMethod = getGetEmployeePrimarySkillMethod = 
              io.grpc.MethodDescriptor.<com.mycompany.Employee.EmployeePrimarySkillRequest, com.mycompany.Employee.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "employee", "getEmployeePrimarySkill"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mycompany.Employee.EmployeePrimarySkillRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mycompany.Employee.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new employeeMethodDescriptorSupplier("getEmployeePrimarySkill"))
                  .build();
          }
        }
     }
     return getGetEmployeePrimarySkillMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static employeeStub newStub(io.grpc.Channel channel) {
    return new employeeStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static employeeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new employeeBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static employeeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new employeeFutureStub(channel);
  }

  /**
   */
  public static abstract class employeeImplBase implements io.grpc.BindableService {

    /**
     */
    public void getEmployeePrimarySkill(com.mycompany.Employee.EmployeePrimarySkillRequest request,
        io.grpc.stub.StreamObserver<com.mycompany.Employee.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEmployeePrimarySkillMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetEmployeePrimarySkillMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.mycompany.Employee.EmployeePrimarySkillRequest,
                com.mycompany.Employee.APIResponse>(
                  this, METHODID_GET_EMPLOYEE_PRIMARY_SKILL)))
          .build();
    }
  }

  /**
   */
  public static final class employeeStub extends io.grpc.stub.AbstractStub<employeeStub> {
    private employeeStub(io.grpc.Channel channel) {
      super(channel);
    }

    private employeeStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected employeeStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new employeeStub(channel, callOptions);
    }

    /**
     */
    public void getEmployeePrimarySkill(com.mycompany.Employee.EmployeePrimarySkillRequest request,
        io.grpc.stub.StreamObserver<com.mycompany.Employee.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEmployeePrimarySkillMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class employeeBlockingStub extends io.grpc.stub.AbstractStub<employeeBlockingStub> {
    private employeeBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private employeeBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected employeeBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new employeeBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.mycompany.Employee.APIResponse getEmployeePrimarySkill(com.mycompany.Employee.EmployeePrimarySkillRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEmployeePrimarySkillMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class employeeFutureStub extends io.grpc.stub.AbstractStub<employeeFutureStub> {
    private employeeFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private employeeFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected employeeFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new employeeFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mycompany.Employee.APIResponse> getEmployeePrimarySkill(
        com.mycompany.Employee.EmployeePrimarySkillRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEmployeePrimarySkillMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_EMPLOYEE_PRIMARY_SKILL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final employeeImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(employeeImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_EMPLOYEE_PRIMARY_SKILL:
          serviceImpl.getEmployeePrimarySkill((com.mycompany.Employee.EmployeePrimarySkillRequest) request,
              (io.grpc.stub.StreamObserver<com.mycompany.Employee.APIResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class employeeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    employeeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.mycompany.Employee.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("employee");
    }
  }

  private static final class employeeFileDescriptorSupplier
      extends employeeBaseDescriptorSupplier {
    employeeFileDescriptorSupplier() {}
  }

  private static final class employeeMethodDescriptorSupplier
      extends employeeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    employeeMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (employeeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new employeeFileDescriptorSupplier())
              .addMethod(getGetEmployeePrimarySkillMethod())
              .build();
        }
      }
    }
    return result;
  }
}
