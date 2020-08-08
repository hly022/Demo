package cn.stephen.study.demoproject.service;

import cn.stephen.study.demoproject.entity.page.Result;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 两杯水
 * @Date: 2020/06/04/14:35
 * @Description:
 */
public interface ApplicationService {
    Result getList(Integer pageNumber, Integer pageSize, String application);
}
