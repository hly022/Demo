package cn.stephen.study.demoproject.controller;

import cn.stephen.study.demoproject.entity.page.Result;
import cn.stephen.study.demoproject.service.ApplicationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 两杯水
 * @Date: 2020/06/04/14:22
 * @Description:
 */
@RestController
@RequestMapping("/study/application")
public class ApplicationController {
    private ApplicationService applicationService;
    @GetMapping("/common")
    public Result list(@RequestParam(value = "pageNumber", defaultValue = "1")Integer pageNumber,
                       @RequestParam(value = "pageSize", defaultValue = "10")Integer pageSize,
                       @RequestParam(value = "application", defaultValue = "")String application){

        return applicationService.getList(pageNumber,pageSize,application);
    }


}
