package cn.stephen.study.demoproject.entity.exception;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 两杯水
 * @Date: 2020/06/05/9:00
 * @Description:
 */
public class ExceptionCode {
    private int code;
    private String msg;

    public ExceptionCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }

    public ExceptionCode(int code, String msg,String ...args) {
        this.code = code;
        this.msg = msg;
        args(args);
    }

    private ExceptionCode args(String... args) {
        if ((msg != null ) && (!"".equals(msg)) && (args != null) && (args.length > 0)){
            msg = msg.replace("\\{\\}","%s");
            msg = String.format(msg,args);
        }
        return this;
    }

    public int code() {

        return code;
    }

    public String msg() {
        return msg;
    }
}
