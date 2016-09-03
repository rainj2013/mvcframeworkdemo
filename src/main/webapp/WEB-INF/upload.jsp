<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>上传</title>
</head>
<body>
<form method="POST" enctype="multipart/form-data" action="uploadFile">
文件一： <input type="file" name="file1"><br/><br/>
文件二：<input type="file" name="file2"><br/><br/>
文件描述：<input name="description"><br/>
<input type="submit" value="提交"> 
</form>
</body>
</html>