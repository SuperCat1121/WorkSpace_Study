<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	request.setCharacterEncoding("UTF-8");
	response.setContentType("text/html; charset=UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>글 목록</h1>
	
	<table border="1">
		<col width="500">
		<col width="500">
		<col width="500">
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>지역</th>
		</tr>
		<c:choose>
			<c:when test="${empty list }">
				<tr>
					<td colspan="3"> ------인원이 없습니다-----</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach items="${list }" var="dto">
					<tr>
						<td>${dto.no }</td>
						<td><a href="con.do?command=one&no=${dto.no }">${dto.name }</a></td>
						<td>${dto.loc }</td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
		<tr>
			<td colspan="3">
				<input type="button" value="글쓰기" onclick="location.href='con.do?command=insertform'">
			</td>
		</tr>
	
	</table>
	
</body>
</html>