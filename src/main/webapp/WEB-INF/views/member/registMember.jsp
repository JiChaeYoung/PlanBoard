<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ taglib prefix="form"
uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>회원가입 페이지</title>
    <link rel="stylesheet" type="text/css" href="/css/common.css" />
    <script type="text/javascript" src="/js/jquery-3.7.1.min.js"></script>
    <script type="text/javascript" src="/js/member/memberregist.js"></script>
  </head>
  <body>
    <form:form modelAttribute="registMemberVO" method="post">
      <h1>회원가입</h1>
      <div class="grid">
        <label for="email">이메일</label>
        <div>
          <form:errors path="email" element="div" cssClass="error" />
          <input
            id="email"
            name="email"
            type="email"
            value="${registMemberVO.email}"
          />
        </div>

        <label for="name ">이름</label>
        <div>
          <form:errors path="name" element="div" cssClass="error" />
          <input
            id="name"
            name="name"
            type="text"
            value="${registMemberVO.name }"
          />
        </div>

        <label for="password">비밀번호</label>
        <div>
          <form:errors path="password" element="div" cssClass="error" />
          <input
            id="password"
            name="password"
            type="password"
            value="${registMemberVO.password}"
          />
        </div>

        <label for="passwordConfirm">비밀번호 확인</label>
        <div>
          <form:errors path="passwordConfirm" element="div" cssClass="error" />
          <input id="passwordConfirm" name="passwordConfirm" type="password" />
          <div class="error">${error_string}</div>
        </div>

        <div class="btn-group">
          <div class="right-align">
            <input type="submit" value="저장" />
          </div>
        </div>
      </div>
    </form:form>
  </body>
</html>
