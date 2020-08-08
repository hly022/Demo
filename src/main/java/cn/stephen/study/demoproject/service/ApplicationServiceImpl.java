package cn.stephen.study.demoproject.service;

import cn.stephen.study.demoproject.dao.mapper1.ApplicationMapper;
import cn.stephen.study.demoproject.entity.User;
import cn.stephen.study.demoproject.entity.page.CommonPage;
import cn.stephen.study.demoproject.entity.page.Result;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 两杯水
 * @Date: 2020/06/04/14:36
 * @Description:
 */
@Service
public class ApplicationServiceImpl implements ApplicationService{

    /**
     * 一个不怎么懂得分页操作
     */
    @Autowired
    private ApplicationMapper applicationMapper;
    @Override
    public Result getList(Integer pageNumber, Integer pageSize, String application) {
        Page page = PageHelper.startPage(pageNumber,pageSize);
        List<User> list= applicationMapper.getList(application);
        CommonPage<User> commonPage = new CommonPage<>();
        commonPage.setContent(list);
        commonPage.setTotalPages(page.getPages());
        commonPage.setTotalElements(page.getTotal());
        commonPage.setSize(page.getPageSize());
        commonPage.setRequestPager(pageNumber);
        return new Result(0,commonPage);

    }
}
