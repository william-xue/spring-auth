package com.huanf.domain;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @author 35238
 * @date 2023/7/18 0018 21:11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("sg_article")
public class Article {
    //把redis的浏览量数据更新到mysql数据库
    public Article(Long id, long viewCount) {
        this.id = id;
        this.viewCount=viewCount;
    }

    @TableId
    private Long id;
    //标题
    private String title;
    //文章内容
    private String content;
    //文章摘要
    private String summary;
    //所属分类id
    private Long categoryId;
    @TableField(exist = false)//代表这个字段在数据库中不存在，避免MyBatisPlus在查询时报错
    private String categoryName;
    //缩略图
    private String thumbnail;
    //是否置顶（0否，1是）
    private String isTop;
    //状态（0已发布，1草稿）
    private String status;
    //访问量
    private Long viewCount;
    //是否允许评论 1是，0否
    private String isComment;

    private Long createBy;

    private Date createTime;

    private Long updateBy;

    private Date updateTime;
    //删除标志（0代表未删除，1代表已删除）
    private Integer delFlag;

}