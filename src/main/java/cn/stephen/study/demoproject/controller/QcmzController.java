package cn.stephen.study.demoproject.controller;

import cn.stephen.study.demoproject.entity.Qcmz;
import cn.stephen.study.demoproject.service.Qcmzservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 测试用的类
 */
@RestController
public class QcmzController {
    @Autowired
    private Qcmzservice qcmzservice;

    /**
     * 一个请求方法,没有传入值
     * @return
     */
    @RequestMapping("/qcmz")
    public String qcmz (){
        //把查询到的值赋予变量a
        String a =qcmzservice.getname();
        //返回页面
        return  a;
    }
    /**
     * 一个请求方法,有传入值
     * @return
     */
    @RequestMapping("/queryTellByName")
    public String queryTellByName (String name){
        //把查询到的电话值赋予变量a
        String tell =qcmzservice.getTellByName(name);
        //返回页面
        return  tell;
    }
    @RequestMapping("/queryAgeById")
    public Integer queryAgeById (Integer id) {

        int age = qcmzservice.queryAgeById(id);

        return age;
    }

    @RequestMapping("/queryInfoById")
    public Qcmz queryInfoById (Integer id) {

        Qcmz info = qcmzservice.queryInfoById(id);

        return info;
    }

    @RequestMapping("/queryQcmzInfosById")
    public List<Qcmz> queryQcmzInfosById (String name) {




      List<Qcmz> infolist =       qcmzservice.queryQcmzInfosById(name);

        return infolist;
    }
}
