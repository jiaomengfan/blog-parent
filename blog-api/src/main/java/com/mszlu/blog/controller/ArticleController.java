package com.mszlu.blog.controller;

import com.mszlu.blog.service.ArticleService;
import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.params.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ArticleController
 * @Description TODO
 * @Author jiaomf
 * @Date 2021/8/15 11:41
 * @Version 1.0
 **/
@RestController
@RequestMapping("/articles")
public class ArticleController {


    @Autowired(required = false)
    private ArticleService articleService;

    /**
     * 首页 文章列表
     * @Author jiaomf
     * @Description //TODO
     * @Date  2021/8/15 11:55
     * @Param [pageParams]
     * @return com.mszlu.blog.vo.Result
     **/
    @PostMapping
    public Result listArchives(@RequestBody PageParams pageParams){

        return articleService.listArticle(pageParams);
    }

}
