package com.snow.phoenix.blog.app.api.exception;

/* 				    
 **********************************************
 *      DATE           PERSON       REASON
 *    2017/10/9          FXY        Created
 **********************************************
 */

/**
 * 博客异常
 */
public class BlogException extends Exception {

    private String code;

    private String message;

    private Exception exception;

    public BlogException(String code, String message, Exception exception) {
        this.code = code;
        this.message = message;
        this.exception = exception;
    }

    @Override
    public String toString() {
        return "code :" + code + " message :" + message + " detail :" + exception.getMessage();
    }
}
