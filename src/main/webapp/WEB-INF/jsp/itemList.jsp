<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상품 목록</h1>
	<table border="1">
		<tr>
			<th>no</th>
			<th>name</th>
			<th>price</th>
			<th>주문</th>
		</tr>
		<c:forEach var="item" items="${list}">
			<tr>
				<td>${item.no}</td>
				<!-- item.getNo -->
				<td>${item.no}</td>
				<!-- item.getNo -->
				<td>${item.no}</td>
				<!-- item.getNo -->
				<td><a href="${pageContext.request.contextPath}/Order">주문</a></td>
			</tr>
		</c:forEach>
	</table>
	<div>
		<%-- 페이징 링크 ${pageContext.request.contextPath}/itemList.jsp?currentPage= --%>
	</div>
</body>
</html>