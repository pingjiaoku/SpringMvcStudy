package com.itheima.exception;

/**
 * 系统异常
 */
public class SystemException extends RuntimeException {
    private final Integer code;

    public Integer getCode() {
        return code;
    }

    public SystemException(Integer code) {
        this.code = code;
    }

    public SystemException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public SystemException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

}
