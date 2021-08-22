package com.mszlu.blog.service;

import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.params.PageParams;

/**
 * @ClassName ArticleService
 * @Description TODO
 * @Author jiaomf
 * @Date 2021/8/15 11:59
 * @Version 1.0
 **/
public interface ArticleService {

    Result listArticle(PageParams pageParams);
}
