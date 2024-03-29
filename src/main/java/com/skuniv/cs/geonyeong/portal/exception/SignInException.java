package com.skuniv.cs.geonyeong.portal.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class SignInException extends RuntimeException{

    public SignInException(String message) {
        super(message);
    }

    public SignInException(String message, Throwable cause) {
        super(message, cause);
    }

    public SignInException(Throwable cause) {
        super(cause);
    }
}
