package cn.stephen.study.demoproject.service;

import cn.stephen.study.demoproject.dao.mapper1.TestDao;
import cn.stephen.study.demoproject.dao.mapper2.TestDao2;
import cn.stephen.study.demoproject.entity.TestTimeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{

    @Autowired
    private TestDao2 testDao2;
    @Autowired
    private TestDao testDao;

    public String getById() {
        return testDao2.getById();
    }

    public void testTime() {
        TestTimeEntity entity = new TestTimeEntity();
        entity.setId(2);
        entity.setCreater("韩忠育");
        //entity.setCreateTime("2020-06-10 11:07:37");
        testDao.testTime(entity);

    }
}
