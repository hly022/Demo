package cn.stephen.study.demoproject.service;


import cn.stephen.study.demoproject.dao.mapper1.QcmzDao;
import cn.stephen.study.demoproject.entity.Qcmz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Qcmzserviceimpl implements Qcmzservice{

    @Autowired
    private QcmzDao qcmzDao;

    public String getname(){
        return qcmzDao.getname();
    }

    @Override
    public String getTellByName(String name) {
        return qcmzDao.getTellByName(name);
    }

    @Override
    public int queryAgeById(Integer id) {

        return qcmzDao.getAgeById(id);
    }

    @Override
    public Qcmz queryInfoById(Integer id) {
        return qcmzDao.queryInfoById(id);
    }

    @Override
    public List<Qcmz> queryQcmzInfosById(String name) {
        List<Qcmz> infoList = qcmzDao.queryQcmzInfosById(name);

        return infoList;
    }


}
