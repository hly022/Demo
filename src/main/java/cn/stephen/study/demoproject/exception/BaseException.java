package cn.stephen.study.demoproject.exception;

import cn.stephen.study.demoproject.entity.exception.ExceptionCode;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 两杯水
 * @Date: 2020/06/04/20:44
 * @Description:
 */
public class BaseException extends RuntimeException {
    private int code;



    public BaseException(String msg, int code) {
        super(msg);
        this.code = code;
    }

    public BaseException(String message, Throwable cause, int code) {
        super(message, cause);
        this.code = code;
    }

    public BaseException(Throwable cause, int code) {
        super(cause);
        this.code = code;
    }

    public BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int code) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
    }

    public BaseException(ExceptionCode code) {
        this(code.msg(), code.code());
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "-" + code;
    }
}
