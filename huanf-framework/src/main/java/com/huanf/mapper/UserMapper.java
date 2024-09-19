package com.huanf.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huanf.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


/**
 * @author 35238
 * @date 2023/7/22 0022 20:47
 */

@Service
public interface UserMapper extends BaseMapper<User> {
}