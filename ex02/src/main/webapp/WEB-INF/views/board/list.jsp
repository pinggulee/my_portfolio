<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- 자바문법을 사용하기 위해 추가 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>NO.</td><td>제목</td><td>작성자</td><td>작성일</td>
		</tr>
		<!--              변수명                           배열명       -->
		<c:forEach var="boardlist" items="${list}" >
			<tr>
				<td>${boardlist.bno}</td>
				<td><a href="/board/read?bno=${boardlist.bno}">${boardlist.title}</a></td>
				<td>${boardlist.writer}</td>
				<td>${boardlist.regdate}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>