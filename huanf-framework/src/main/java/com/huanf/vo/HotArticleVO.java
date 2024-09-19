package com.huanf.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <code>HotArticleVO</code>
 * Description
 * <b>Creation Time:</b> 2023/10/17 17:09.
 *
 * @author xue-freeze
 * @since SpringBootBlog
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
//返回给前端特定的字段
public class HotArticleVO {

    private Long id;
    //标题
    private String title;
    //访问量
    private Long viewCount;

}
