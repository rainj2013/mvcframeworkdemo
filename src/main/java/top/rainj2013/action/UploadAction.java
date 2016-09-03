package top.rainj2013.action;

import org.mvc.annotation.Action;
import org.mvc.annotation.Ok;
import org.mvc.annotation.Param;
import org.mvc.annotation.Upload;
import org.mvc.upload.TempFile;

/**
 * Created by rainj2013 on 16-9-3.
 */
@Action("/file")
public class UploadAction {

    @Action
    @Ok("->:|upload.jsp")
    public void upload(){}

    @Action("/uploadFile")
    @Upload("/config.js")
    @Ok("->:/index.jsp")
    public String upload(@Param("file1") TempFile tf1, @Param("file2") TempFile tf2, @Param("description") String description){
        String result = String.format("上传了文件:<br> %s,<br>%s<br>文件描述：%s",tf1.getFileName(),tf2.getFileName(),description);
        System.out.printf(result);
        return result;
    }
}
