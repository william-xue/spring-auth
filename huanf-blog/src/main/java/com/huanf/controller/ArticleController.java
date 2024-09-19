package com.huanf.controller;

import com.huanf.annotation.mySystemlog;
import com.huanf.domain.Article;
import com.huanf.domain.ResponseResult;
import com.huanf.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 35238
 * @date 2023/7/18 0018 21:48
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    //注入公共模块的ArticleService接口
    private ArticleService articleService;

    //----------------------------------测试mybatisPlus---------------------------------

    @GetMapping("/list")
    //Article是公共模块的实体类
    public List<Article> test(){
        //查询数据库的所有数据
        return articleService.list();
    }



    //----------------------------------测试统一响应格式-----------------------------------

    @GetMapping("/hotArticleList")
    //ResponseResult是huanf-framework工程的domain目录的类
    public ResponseResult hotArticleList(){
        //查询热门文章，封装成ResponseResult返回
        ResponseResult result = articleService.hotArticleList();
        return result;
    }

    //----------------------------------分页查询文章的列表---------------------------------

    @GetMapping("/articleList")
    //ResponseResult是huanf-framework工程的domain目录的类
    public ResponseResult articleList(Integer pageNum,Integer pageSize,Long categoryId){
        return articleService.articleList(pageNum,pageSize,categoryId);
    }

    //------------------------------------查询文章详情------------------------------------

    @GetMapping("/{id}") //路径参数形式的HTTP请求，注意下面那行只有加@PathVariable注解才能接收路径参数形式的HTTP请求
    //ResponseResult是huanf-framework工程的domain目录的类
    public ResponseResult getArticleDetail(@PathVariable("id") Long id) {//注解里指定的id跟上一行保持一致

        //根据id查询文章详情
        return articleService.getArticleDetail(id);

    }

    @PutMapping("/updateViewCount/{id}")
    @mySystemlog(xxbusinessName = "根据文章id从mysql查询文章")//接口描述，用于'日志记录'功能
    public ResponseResult updateViewCount(@PathVariable("id") Long id){
        return articleService.updateViewCount(id);
    }

}