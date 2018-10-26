<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>addMember Form</h2>
	<form action="<%=request.getContextPath()%>/addMember" method="post">
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
				<td>권한</td>
				<td><select name="level">
						<option value="1">관리자</option>
						<option value="0">고객</option>
				</select></td>
			</tr>
			<tr>
				<td colspan="4"><button type="submit">가입</button></td>
			</tr>
		</table>
	</form>
</body>
</html>