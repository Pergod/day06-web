<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/day06/form" method="post">
		用户名:<input type="text" name="username"/><br>
		密码:<input type="text" name="password"/><br>
		性别:
			<input type="radio" name="gender" value="male"/>男
			<input type="radio" name="gender" value="female"/>女<br>
		地址:
			<select name="city">
				<option value="Beijing">北京</option>
				<option value="Shanghai">上海</option>
				<option value="Shenzhen">深圳</option>
			</select>
			<br>
		爱好:
			<input type="checkbox" name="hobby" value="basketball"/>篮球<br>
			<input type="checkbox" name="hobby" value="games"/>游戏<br>
			<input type="checkbox" name="hobby" value="swimming"/>游泳<br>
			<input type="checkbox" name="hobby" value="exercise"/>健身<br>
		介绍:
			<textarea rows="6" cols="60" name="description"></textarea><br/>
		照片:
			<input type="file" name="image"/><br/>
		<input type="hidden" name="id" value="12345"/>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>