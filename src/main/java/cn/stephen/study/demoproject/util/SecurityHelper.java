package cn.stephen.study.demoproject.util;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 两杯水
 * @Date: 2020/06/04/19:54
 * @Description:用户信息存储，获取工具类
 */
public class SecurityHelper {
    /**
     * 定义session
     * @return
     */
    public static Session shiroSesssion(){
        return SecurityUtils.getSubject().getSession();
    }

    /**
     * 向session中存放内容
     */
    public static void currentUser(Object obj){
        Session session = shiroSesssion();
        session.setAttribute("定义的名字",obj);
    }

    /**
     * 取session中存放的内容
     */
    public static <T> T currentUser(){
        Session session = shiroSesssion();
        Object obj = session.getAttribute("想要获取的信息");
        if(obj != null){
            return (T)obj;
        }
        return null;
    }
}
