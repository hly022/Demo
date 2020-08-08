package cn.stephen.study.demoproject.entity.page;

import lombok.Data;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 两杯水
 * @Date: 2020/06/04/14:19
 * @Description:
 */
@Data
public class CommonPage<T> {

    private List<T> content;
    private Integer totalPages;
    private Long totalElements;
    private Integer size;
    private Integer requestPager;
}
