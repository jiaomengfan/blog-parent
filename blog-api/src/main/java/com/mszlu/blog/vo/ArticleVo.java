package com.mszlu.blog.vo;

import lombok.Data;

import java.util.List;

/**
 * @ClassName ArticleVo
 * @Description TODO
 * @Author jiaomf
 * @Date 2021/8/15 12:24
 * @Version 1.0
 **/
@Data
public class ArticleVo {

    private Long id;

    private String title;

    private String summary;

    private int commentCounts;

    private int viewCounts;

    private int weight;
    /**
     * 创建时间
     */
    private String createDate;

    private String author;

//    private ArticleBodyVo body;

    private List<TagVo> tags;

//    private List<CategoryVo> categorys;

}
