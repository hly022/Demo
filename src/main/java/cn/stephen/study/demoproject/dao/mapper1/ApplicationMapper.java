package cn.stephen.study.demoproject.dao.mapper1;

import cn.stephen.study.demoproject.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 两杯水
 * @Date: 2020/06/04/14:46
 * @Description:
 */
@Mapper
public interface ApplicationMapper {
    List<User> getList(String application);
}
