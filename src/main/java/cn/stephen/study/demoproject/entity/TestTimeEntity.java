package cn.stephen.study.demoproject.entity;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 两杯水
 * @Date: 2020/06/10/11:01
 * @Description:
 */

public class TestTimeEntity {
    private int id;
    private String creater;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }
}
