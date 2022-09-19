package com.wxl.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wxl.domian.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

//数据层
@Mapper
public interface BookDao extends BaseMapper<Book> {

}
