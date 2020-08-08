package cn.stephen.study.demoproject.dao.mapper2;

import cn.stephen.study.demoproject.entity.TestTimeEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDao2 {

    String getById();

    void testTime(TestTimeEntity entity);
}
