package cn.jsbintask.dubboapi;

/**
 * @author jsbintask@gmail.com
 * @date 2019/2/20 9:29
 */
public interface IUserService {
    String hello(String name);

    User getById(Integer id);
}
