package cn.jsbintask.dubboprovider.service.impl;

import cn.jsbintask.dubboapi.IUserService;
import cn.jsbintask.dubboapi.User;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author jsbintask@gmail.com
 * @date 2019/2/20 9:33
 */
@Service
@com.alibaba.dubbo.config.annotation.Service(interfaceClass = IUserService.class)
public class UserServiceImpl implements IUserService {
    @Override
    public String hello(String name) {
        return "hello " + name;
    }

    @Override
    public User getById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("jason");
        user.setBirthday(new Date());

        return user;
    }
}
