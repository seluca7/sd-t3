package com.ps.assignment3;

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
    comments = "Source: medication.proto")
public final class medicationGrpc {

  private medicationGrpc() {}

  public static final String SERVICE_NAME = "medication";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ps.assignment3.MedicationOuterClass.Empty,
      com.ps.assignment3.MedicationOuterClass.MedicationList> getGetAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAll",
      requestType = com.ps.assignment3.MedicationOuterClass.Empty.class,
      responseType = com.ps.assignment3.MedicationOuterClass.MedicationList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ps.assignment3.MedicationOuterClass.Empty,
      com.ps.assignment3.MedicationOuterClass.MedicationList> getGetAllMethod() {
    io.grpc.MethodDescriptor<com.ps.assignment3.MedicationOuterClass.Empty, com.ps.assignment3.MedicationOuterClass.MedicationList> getGetAllMethod;
    if ((getGetAllMethod = medicationGrpc.getGetAllMethod) == null) {
      synchronized (medicationGrpc.class) {
        if ((getGetAllMethod = medicationGrpc.getGetAllMethod) == null) {
          medicationGrpc.getGetAllMethod = getGetAllMethod = 
              io.grpc.MethodDescriptor.<com.ps.assignment3.MedicationOuterClass.Empty, com.ps.assignment3.MedicationOuterClass.MedicationList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "medication", "getAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ps.assignment3.MedicationOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ps.assignment3.MedicationOuterClass.MedicationList.getDefaultInstance()))
                  .setSchemaDescriptor(new medicationMethodDescriptorSupplier("getAll"))
                  .build();
          }
        }
     }
     return getGetAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ps.assignment3.MedicationOuterClass.IdMessage,
      com.ps.assignment3.MedicationOuterClass.Medication> getGetByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getById",
      requestType = com.ps.assignment3.MedicationOuterClass.IdMessage.class,
      responseType = com.ps.assignment3.MedicationOuterClass.Medication.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ps.assignment3.MedicationOuterClass.IdMessage,
      com.ps.assignment3.MedicationOuterClass.Medication> getGetByIdMethod() {
    io.grpc.MethodDescriptor<com.ps.assignment3.MedicationOuterClass.IdMessage, com.ps.assignment3.MedicationOuterClass.Medication> getGetByIdMethod;
    if ((getGetByIdMethod = medicationGrpc.getGetByIdMethod) == null) {
      synchronized (medicationGrpc.class) {
        if ((getGetByIdMethod = medicationGrpc.getGetByIdMethod) == null) {
          medicationGrpc.getGetByIdMethod = getGetByIdMethod = 
              io.grpc.MethodDescriptor.<com.ps.assignment3.MedicationOuterClass.IdMessage, com.ps.assignment3.MedicationOuterClass.Medication>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "medication", "getById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ps.assignment3.MedicationOuterClass.IdMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ps.assignment3.MedicationOuterClass.Medication.getDefaultInstance()))
                  .setSchemaDescriptor(new medicationMethodDescriptorSupplier("getById"))
                  .build();
          }
        }
     }
     return getGetByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ps.assignment3.MedicationOuterClass.IdMessage,
      com.ps.assignment3.MedicationOuterClass.Empty> getDeleteByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteById",
      requestType = com.ps.assignment3.MedicationOuterClass.IdMessage.class,
      responseType = com.ps.assignment3.MedicationOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ps.assignment3.MedicationOuterClass.IdMessage,
      com.ps.assignment3.MedicationOuterClass.Empty> getDeleteByIdMethod() {
    io.grpc.MethodDescriptor<com.ps.assignment3.MedicationOuterClass.IdMessage, com.ps.assignment3.MedicationOuterClass.Empty> getDeleteByIdMethod;
    if ((getDeleteByIdMethod = medicationGrpc.getDeleteByIdMethod) == null) {
      synchronized (medicationGrpc.class) {
        if ((getDeleteByIdMethod = medicationGrpc.getDeleteByIdMethod) == null) {
          medicationGrpc.getDeleteByIdMethod = getDeleteByIdMethod = 
              io.grpc.MethodDescriptor.<com.ps.assignment3.MedicationOuterClass.IdMessage, com.ps.assignment3.MedicationOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "medication", "deleteById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ps.assignment3.MedicationOuterClass.IdMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ps.assignment3.MedicationOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new medicationMethodDescriptorSupplier("deleteById"))
                  .build();
          }
        }
     }
     return getDeleteByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static medicationStub newStub(io.grpc.Channel channel) {
    return new medicationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static medicationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new medicationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static medicationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new medicationFutureStub(channel);
  }

  /**
   */
  public static abstract class medicationImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAll(com.ps.assignment3.MedicationOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.ps.assignment3.MedicationOuterClass.MedicationList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllMethod(), responseObserver);
    }

    /**
     */
    public void getById(com.ps.assignment3.MedicationOuterClass.IdMessage request,
        io.grpc.stub.StreamObserver<com.ps.assignment3.MedicationOuterClass.Medication> responseObserver) {
      asyncUnimplementedUnaryCall(getGetByIdMethod(), responseObserver);
    }

    /**
     */
    public void deleteById(com.ps.assignment3.MedicationOuterClass.IdMessage request,
        io.grpc.stub.StreamObserver<com.ps.assignment3.MedicationOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.ps.assignment3.MedicationOuterClass.Empty,
                com.ps.assignment3.MedicationOuterClass.MedicationList>(
                  this, METHODID_GET_ALL)))
          .addMethod(
            getGetByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.ps.assignment3.MedicationOuterClass.IdMessage,
                com.ps.assignment3.MedicationOuterClass.Medication>(
                  this, METHODID_GET_BY_ID)))
          .addMethod(
            getDeleteByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.ps.assignment3.MedicationOuterClass.IdMessage,
                com.ps.assignment3.MedicationOuterClass.Empty>(
                  this, METHODID_DELETE_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class medicationStub extends io.grpc.stub.AbstractStub<medicationStub> {
    private medicationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private medicationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected medicationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new medicationStub(channel, callOptions);
    }

    /**
     */
    public void getAll(com.ps.assignment3.MedicationOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.ps.assignment3.MedicationOuterClass.MedicationList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getById(com.ps.assignment3.MedicationOuterClass.IdMessage request,
        io.grpc.stub.StreamObserver<com.ps.assignment3.MedicationOuterClass.Medication> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteById(com.ps.assignment3.MedicationOuterClass.IdMessage request,
        io.grpc.stub.StreamObserver<com.ps.assignment3.MedicationOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class medicationBlockingStub extends io.grpc.stub.AbstractStub<medicationBlockingStub> {
    private medicationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private medicationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected medicationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new medicationBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ps.assignment3.MedicationOuterClass.MedicationList getAll(com.ps.assignment3.MedicationOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ps.assignment3.MedicationOuterClass.Medication getById(com.ps.assignment3.MedicationOuterClass.IdMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ps.assignment3.MedicationOuterClass.Empty deleteById(com.ps.assignment3.MedicationOuterClass.IdMessage request) {
      return blockingUnaryCall(
          getChannel(), getDeleteByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class medicationFutureStub extends io.grpc.stub.AbstractStub<medicationFutureStub> {
    private medicationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private medicationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected medicationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new medicationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ps.assignment3.MedicationOuterClass.MedicationList> getAll(
        com.ps.assignment3.MedicationOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ps.assignment3.MedicationOuterClass.Medication> getById(
        com.ps.assignment3.MedicationOuterClass.IdMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ps.assignment3.MedicationOuterClass.Empty> deleteById(
        com.ps.assignment3.MedicationOuterClass.IdMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL = 0;
  private static final int METHODID_GET_BY_ID = 1;
  private static final int METHODID_DELETE_BY_ID = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final medicationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(medicationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL:
          serviceImpl.getAll((com.ps.assignment3.MedicationOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<com.ps.assignment3.MedicationOuterClass.MedicationList>) responseObserver);
          break;
        case METHODID_GET_BY_ID:
          serviceImpl.getById((com.ps.assignment3.MedicationOuterClass.IdMessage) request,
              (io.grpc.stub.StreamObserver<com.ps.assignment3.MedicationOuterClass.Medication>) responseObserver);
          break;
        case METHODID_DELETE_BY_ID:
          serviceImpl.deleteById((com.ps.assignment3.MedicationOuterClass.IdMessage) request,
              (io.grpc.stub.StreamObserver<com.ps.assignment3.MedicationOuterClass.Empty>) responseObserver);
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

  private static abstract class medicationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    medicationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ps.assignment3.MedicationOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("medication");
    }
  }

  private static final class medicationFileDescriptorSupplier
      extends medicationBaseDescriptorSupplier {
    medicationFileDescriptorSupplier() {}
  }

  private static final class medicationMethodDescriptorSupplier
      extends medicationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    medicationMethodDescriptorSupplier(String methodName) {
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
      synchronized (medicationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new medicationFileDescriptorSupplier())
              .addMethod(getGetAllMethod())
              .addMethod(getGetByIdMethod())
              .addMethod(getDeleteByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
