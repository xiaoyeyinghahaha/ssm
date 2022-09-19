package com.wxl.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wxl.domian.Book;

import java.util.List;
//业务层接口
public interface IBookService {
    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);
    Book getById(Integer id);
    List<Book> getAll();
    IPage<Book> getPage(int currentPage, int pageSize, Book book);
    IPage<Book> getPage(int currentPage, int pageSize);
}
