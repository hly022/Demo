package cn.stephen.study.demoproject.service;

import cn.stephen.study.demoproject.entity.Qcmz;

import java.util.List;

public interface Qcmzservice {
    String getname();

    String getTellByName(String name);

    int queryAgeById(Integer id);

    Qcmz queryInfoById(Integer id);

    List<Qcmz> queryQcmzInfosById(String name);
}
