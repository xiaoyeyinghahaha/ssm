package com.wxl.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wxl.domian.Book;
import com.wxl.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController//注释为表现层
@RequestMapping("/books")//公共请求路径
public class BookController2 {
    @Autowired
    private IBookService bookService;

    @GetMapping//查询全部
    public List<Book> getAll(){
        return bookService.getAll();
    }

    @PostMapping//添加
    public Boolean save(@RequestBody Book book){//请求体参数
        return bookService.save(book);
    }

    @PutMapping//修改
    public Boolean update(@RequestBody Book book){
        return bookService.update(book);
    }

    @DeleteMapping("{id}")//删除,("{id}")路径参数
    public Boolean delete(@PathVariable Integer id){//路径参数
        return bookService.delete(id);
    }

    @GetMapping("{id}")//通过id查询,("{id}")路径参数
    public Book getById(@PathVariable Integer id){//路径参数
        return bookService.getById(id);
    }

    @GetMapping("{currentPage}/{pageSize}")
    public IPage<Book> getPage(@PathVariable int currentPage,@PathVariable int pageSize){
        return bookService.getPage(currentPage,pageSize,null);
    }
}
