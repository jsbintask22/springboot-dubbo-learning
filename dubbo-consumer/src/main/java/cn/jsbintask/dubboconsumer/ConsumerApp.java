package cn.jsbintask.dubboconsumer;

import cn.jsbintask.dubboconsumer.service.impl.UserServiceConsumer;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author jsbintask@gmail.com
 * @date 2019/2/20 10:58
 */
@SpringBootApplication
@EnableDubboConfiguration
public class ConsumerApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ConsumerApp.class, args);

        UserServiceConsumer userServiceConsumer = context.getBean(UserServiceConsumer.class);
        userServiceConsumer.consumeHello("jason");
        userServiceConsumer.consumeUser(1);
    }
}
