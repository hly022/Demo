package cn.stephen.study.demoproject.util;

import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 两杯水
 * @Date: 2020/06/08/19:26
 * @Description:
 */
public class CommonUtil {
    /**
     * 获取32位UUID值
     * @return
     */
    public static String getRandomUUID(){
        String value = UUID.randomUUID().toString().replace("-","");
        return value;
    }

    /**
     * 字符串判空
     * @param str
     * @return
     */
    public static boolean isEmpty(String str){
        if(str  == null || "".equals(str)){
            return true;
        }
        return false;
    }

}
