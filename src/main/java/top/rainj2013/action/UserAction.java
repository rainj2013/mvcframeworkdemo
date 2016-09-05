package top.rainj2013.action;

import org.mvc.annotation.*;
import org.mvc.upload.TempFile;
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

    @GET
    @Ok("->:|jsp|login.jsp")
    public void login() {}

    @POST
    @Json
    public Object login(@Param("username")String username, @Param("password")int password) {
        String result = String.format("用户名：%s,密码：%d", username, password);
        System.out.printf(result);
        return result;
    }

    @Action
    @Upload("/config.js")
    @Ok("->:/index.jsp")
    public String upload(@Param("file1") TempFile tf1, @Param("file2") TempFile tf2, @Param("description") String description) {
        return tf1.getPath() + "<br>" + tf2.getPath() + "<br>" + description;
    }

}
