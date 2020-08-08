package cn.stephen.study.demoproject.dao.mapper1;

import cn.stephen.study.demoproject.entity.TestTimeEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDao {

    String getById();

    void testTime(TestTimeEntity entity);
}
