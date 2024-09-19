package com.huanf.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huanf.domain.Article;
import com.huanf.domain.ResponseResult;


public interface ArticleService extends IService<Article> {
    ResponseResult hotArticleList();
    //分类查询文章列表
    ResponseResult articleList(Integer pageNum, Integer pageSize, Long categoryId);
    //根据id查询文章详情
    ResponseResult getArticleDetail(Long id);
    //根据文章id从mysql查询文章
    ResponseResult updateViewCount(Long id);

}