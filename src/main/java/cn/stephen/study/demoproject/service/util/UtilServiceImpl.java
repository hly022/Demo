package cn.stephen.study.demoproject.service.util;

import cn.stephen.study.demoproject.entity.ParamType;
import cn.stephen.study.demoproject.entity.util.DmAndParam;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 两杯水
 * @Date: 2020/06/04/20:26
 * @Description:
 */
@Service
public class UtilServiceImpl implements UtilService{

    /**
     * 去枚举中取数
     * @return
     */
    @Override
    public List<DmAndParam> queryParamType() {
        List<DmAndParam> paramTypeList = new ArrayList<>();
        for (ParamType paramType:ParamType.values()) {
            DmAndParam dmAndParam = new DmAndParam();
            dmAndParam.setId(paramType.getRateId());
            dmAndParam.setName(paramType.getRateName());
            paramTypeList.add(dmAndParam);
        }
        return paramTypeList;
    }
}
