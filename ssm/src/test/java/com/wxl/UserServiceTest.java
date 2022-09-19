package com.wxl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wxl.domian.Book;
import com.wxl.domian.User;
import com.wxl.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {
    @Autowired
    private IUserService userService;

    @Test
    void testGetById(){
        System.out.println(userService.getById(1));
    }

    @Test
    void testSave(){
        User user = new User();
        user.setUsername("!!!555");
        user.setEmail("867760392@qq.com");
        user.setPassword("123456");
        user.setPhone("18278645341");
        userService.save(user);
    }
    @Test
    void testUpdate(){
        User user = new User();
        user.setId(3);
        user.setUsername("???222");
        user.setEmail("867760392@qq.com");
        user.setPassword("123456");
        user.setPhone("18278645341");
        userService.updateById(user);
    }
    @Test
    void testDelete(){
        userService.removeById(4);
    }

    @Test
    void testGetAll(){
        System.out.println(userService.list());
    }

    @Test
    void testGetPage(){
        IPage<User> page = new Page<>(1,3);
        userService.page(page);
        //IPage<user> page = userService.getPage(2, 5);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.getRecords());

    }
}
