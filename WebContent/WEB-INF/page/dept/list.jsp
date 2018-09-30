<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String contextPath = request.getContextPath(); // /hibernate01_lx
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + contextPath + "/";
%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>部门列表页面</title>
</head>
<body>
<table>
	<thead>
		<tr>
			<th>编号</th>
			<th>部门名称</th>
			<th>地址</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${list }" var="dept" varStatus="status">
			<tr>
				<td>${status.count }</td>
				<td>${dept.dname }</td>
				<td>${dept.loc }</td>
				<td>删除|修改</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>