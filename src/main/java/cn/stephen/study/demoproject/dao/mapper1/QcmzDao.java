package cn.stephen.study.demoproject.dao.mapper1;

import cn.stephen.study.demoproject.entity.Qcmz;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface QcmzDao {
    String getname();

    String getTellByName(String name);

    int getAgeById(Integer id);

    Qcmz queryInfoById(Integer id);

    List<Qcmz> queryQcmzInfosById(String name);
}
