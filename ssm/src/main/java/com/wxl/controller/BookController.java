package com.wxl.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wxl.controller.util.R;
import com.wxl.domian.Book;
import com.wxl.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController//注释为表现层
@RequestMapping("/books")//公共请求路径
public class BookController {
    @Autowired
    private IBookService bookService;

    @GetMapping//查询全部
    public R getAll(){
        R r = new R(true,bookService.getAll());
        return r;
    }

    @PostMapping//添加
    public R save(@RequestBody Book book) throws IOException {//请求体参数
        if(book.getName().equals("123")) throw new IOException();
        R r = new R(bookService.save(book));
        return r;
    }

    @PutMapping//修改
    public R update(@RequestBody Book book){
        R r = new R(bookService.update(book));
        return r;
    }

    @DeleteMapping("{id}")//删除,("{id}")路径参数
    public R delete(@PathVariable Integer id){//路径参数
        R r = new R(bookService.delete(id));
        return r;
    }

    @GetMapping("{id}")//通过id查询,("{id}")路径参数
    public R getById(@PathVariable Integer id){//路径参数
        R r = new R(true,bookService.getById(id));
        return r;
    }

//    @GetMapping("{currentPage}/{pageSize}")
//    public R getPage(@PathVariable int currentPage,@PathVariable int pageSize){
//        IPage<Book> page = bookService.getPage(currentPage, pageSize);
//        //如果当前页码值大于总页码值,跳转到最大页码页,解决删除bug
//        if(currentPage > page.getPages()){//当前页码值大于总页码值
//            page = bookService.getPage((int)page.getPages(), pageSize);
//        }
//        return new R(true,page);
//    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage,@PathVariable int pageSize,Book book){//前两个是从url获取
        IPage<Book> page = bookService.getPage(currentPage, pageSize,book);
        //如果当前页码值大于总页码值,跳转到最大页码页,解决删除bug
        if(currentPage > page.getPages()){//当前页码值大于总页码值
            page = bookService.getPage((int)page.getPages(), pageSize,book);
        }
        return new R(true,page);
    }
}
