package cn.stephen.study.demoproject.controller;


import cn.stephen.study.demoproject.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService TestService;

    /**
     * 测试是否调通
     * @return
     */


    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String test(){
        return TestService.getById();
    }

    @RequestMapping("/testTime")
    public void testTimeToData(){
        TestService.testTime();
    }

}
