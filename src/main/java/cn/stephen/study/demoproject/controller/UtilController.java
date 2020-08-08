package cn.stephen.study.demoproject.controller;

import cn.stephen.study.demoproject.entity.BaseCode;
import cn.stephen.study.demoproject.entity.page.Result;
import cn.stephen.study.demoproject.entity.util.DmAndParam;
import cn.stephen.study.demoproject.service.util.UtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 两杯水
 * @Date: 2020/06/04/20:18
 * @Description:
 */
@RestController
@RequestMapping("/util")
public class UtilController {
    @Autowired
    private UtilService utilService;

    @PostMapping("/emun")
    public Result utilMethod(){
        List<DmAndParam> params = utilService.queryParamType();
        return new Result(BaseCode.SUCCESS,params);
    }
}
