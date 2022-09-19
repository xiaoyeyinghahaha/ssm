package com.wxl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.dao.UserDao;
import com.wxl.domian.User;
import com.wxl.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao,User> implements IUserService {//extends ServiceImpl<UserDao,User>可以自动重写全部方法，实现接口
}
