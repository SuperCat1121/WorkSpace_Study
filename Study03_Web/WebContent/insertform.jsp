<%@page import="com.study.dto.StudyDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
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
	
	<form action="con.do" method="post">
		<input type="hidden" name="command" value="insertres">
		<table border="1">
			<tr>
				<th>이름</th>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<th>주소</th>
				<td><input type="text" name="loc"></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="확인">
					<input type="button" value="목록" onclick="location.href='con.do?command=list'">
				</td>
			</tr>
		
		</table>
	</form>
</body>
</html>