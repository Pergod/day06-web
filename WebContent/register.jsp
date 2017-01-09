<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function refreshImage(img){
		//否则会取缓存，后面加变化的时间参数
		img.src=img.src+"?"+new Date().getTime();
	}
</script>
</head>
<body>
	<form action="">
		用户名:<input type="text" name="username"/><br/>
		密码:<input type="password" name="password"/><br/>
		认证码:<input type="text" name="checkcode"/><img src="/day06/verify" onclick="refreshImage(this)" alt="换一张图片"><br/>
		<input type="submit" value="注册">
	</form>
</body>
</html>