<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
	</head>
	<body>
		<c:if test="${boardList == null }">
			<p class="makeBoard">ボードを作成してみよう</p>
		</c:if>

  		<c:if test="${boardList != null }">
			<p class="makeBoard">新規ボード作成</p>

			<c:forEach items="${boardList }" var="board">
				<p class="board_name">${board.board_name }</p>
			</c:forEach>
		</c:if>
		</body>
	</html>
