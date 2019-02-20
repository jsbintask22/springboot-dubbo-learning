package cn.jsbintask.dubboconsumer.service.impl;

import cn.jsbintask.dubboapi.IUserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * @author jsbintask@gmail.com
 * @date 2019/2/20 11:07
 */
@Component
public class UserServiceConsumer {
    @Reference(url = "dubbo://127.0.0.1:20880")
    private IUserService userService;

    public void consumeHello(String name) {
        System.out.println(userService.hello(name));
    }

    public void consumeUser(int id) {
        System.out.println(userService.getById(id));
    }
}
