<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 폼</h1>
	<form action="<%=request.getContextPath()%>/login" method="post">
		<table border="1">
			<tr>

				<td>아이디</td>
				<td><input type="text" name="id" size="20"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pw" size="20"></td>
			</tr>
			<tr>
				<td><button type="submit">login</button></td>
			</tr>
		</table>
	</form>
</body>
</html>