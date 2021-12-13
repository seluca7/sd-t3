package com.ps.assignment3.user;

import com.ps.assignment3.User;
import com.ps.assignment3.userGrpc;
import io.grpc.stub.StreamObserver;

public class UserService extends userGrpc.userImplBase {
    @Override
    public void login(User.LoginRequest request, StreamObserver<User.APIResponse> responseObserver) {
        System.out.println("this is the login method");
        String username = request.getUsername();
        String password = request.getPassword();
        User.APIResponse.Builder response = User.APIResponse.newBuilder();
        if (username.equals(password)){
            response.setResponseCode(0).setResponseMessage("SUCCESS");
        }
        else {
            response.setResponseCode(100).setResponseMessage("INVALID CREDENTIALS");
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void logout(User.Empty request, StreamObserver<User.APIResponse> responseObserver) {
        super.logout(request, responseObserver);
    }
}
