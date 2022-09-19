package com.wxl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wxl.domian.Book;
import com.wxl.service.IBookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {
    @Autowired
    private IBookService bookService;

    @Test
    void testGetById(){
        System.out.println(bookService.getById(10));
    }

    @Test
    void testSave(){
        Book book = new Book();
        book.setName("卧槽111");
        book.setType("沙雕文学");
        book.setDescription("闻名世界的沙雕文学");
        bookService.save(book);
    }
    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(12);
        book.setName("卧槽");
        book.setType("沙雕文学");
        book.setDescription("闻名世界的沙雕文学");
        bookService.update(book);
    }
    @Test
    void testDelete(){
        bookService.delete(16);
    }

    @Test
    void testGetAll(){
        System.out.println(bookService.getAll());
    }

    @Test
    void testGetPage(){
        IPage<Book> page = bookService.getPage(2, 5);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.getRecords());

    }
}
