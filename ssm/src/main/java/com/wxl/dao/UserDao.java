package com.wxl.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wxl.domian.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {
}
