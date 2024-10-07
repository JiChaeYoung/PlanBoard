<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!-- JSTL -->
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>PlanBoard TODO LIST</title>
    <link rel="stylesheet" type="text/css" href="/css/list.css" />
  </head>
  <body>
    <div class="grid">
      <div class="right-align">
        총 ${planboardlist.size()}건의 계획이 검색되었습니다.
      </div>
      <table class="table">
        <thead>
          <tr>
            <th>번호</th>
            <th>완료?</th>
            <th>TODO Subject</th>
            <th>기한</th>
            <th>완료</th>
            <th>삭제</th>
          </tr>
        </thead>
        <tbody>
        <c:choose>
        <c:when test="${not empty planboardlist}">
          <c:forEach items="${planboardlist}" var="board">
            <tr>
              <td>${board.id}</td>
              <td>
                <c:choose>
                  <c:when test="${board.isdone == 1}">DONE</c:when>
                  <c:otherwise>-</c:otherwise>
                </c:choose>
              </td>
              <td>${board.subject}</td>
              <td>${board.deadLine}</td>
              <td>
                <c:choose>
                  <c:when test="${board.isdone == 0}">
                    <a href="/planboard/isdone/${board.id}">완료</a>
                  </c:when>
                  <c:otherwise>-</c:otherwise>
                </c:choose>
              </td>
              <td><a href="/planboard/delete/${board.id}">삭제</a></td>
            </tr>
          </c:forEach>
          </c:when>
          <c:otherwise>
          <tr>
          <td colspan="6">등록된 계획이 없습니다.</td>
          </tr>
          </c:otherwise>
          </c:choose>
        </tbody>
      </table>
      <div class="right-align">
        <a href="/planboard/write">새 아이템 추가</a>
      </div>
    </div>
  </body>
</html>
