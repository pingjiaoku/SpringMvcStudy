package com.itheima.exception;


/**
 * 业务异常
 */
public class BusinessException extends RuntimeException {
    private final Integer code;

    public Integer getCode() {
        return code;
    }

    public BusinessException(Integer code) {
        this.code = code;
    }

    public BusinessException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

}
