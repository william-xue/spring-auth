package com.huanf.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huanf.domain.ResponseResult;
import com.huanf.domain.Tag;
import com.huanf.dto.TagListDto;
import com.huanf.vo.PageVo;

/**
 * @author 35238
 * @date 2023/8/2 0002 21:14
 */

public interface TagService extends IService<Tag> {
    //查询标签列表
    ResponseResult<PageVo> pageTagList(Integer pageNum, Integer pageSize, TagListDto tagListDto);
}