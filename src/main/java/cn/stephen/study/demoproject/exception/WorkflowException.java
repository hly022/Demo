package cn.stephen.study.demoproject.exception;

import cn.stephen.study.demoproject.entity.exception.ExceptionCode;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 两杯水
 * @Date: 2020/06/05/9:13
 * @Description:
 */
public class WorkflowException extends BaseException {
    public WorkflowException( ExceptionCode code) {
        super(code);
    }

    public WorkflowException(Throwable e, int code) {
        super(e, code);
    }

}
