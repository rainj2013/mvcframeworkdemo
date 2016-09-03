package top.rainj2013.action;

import org.mvc.annotation.Action;
import org.mvc.annotation.Json;
import org.mvc.annotation.Ok;
import org.mvc.annotation.Param;
import top.rainj2013.bean.User;

/**
 * Created by rainj2013 on 16-9-2.
 */
@Action("/user")
public class UserAction {

    @Action("/addUser")
    @Json
    public Object addUser(@Param("..") User user){
        System.out.println("add a user :" + user.getName());
        return user;
    }

    @Action
    @Ok("->:/index.jsp")
    public String login(@Param("name")String name, @Param("password")int password){
        String result = String.format("用户名：%s,密码：%d", name, password);
        System.out.printf(result);
        return result;
    }

}
