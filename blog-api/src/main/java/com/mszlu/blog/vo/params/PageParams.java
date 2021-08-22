package com.mszlu.blog.vo.params;

import lombok.Data;

/**
 * @ClassName PageParams
 * @Description TODO
 * @Author jiaomf
 * @Date 2021/8/15 11:45
 * @Version 1.0
 **/
@Data
public class PageParams {
    private int page = 1;
    private int pageSize = 10;

}
