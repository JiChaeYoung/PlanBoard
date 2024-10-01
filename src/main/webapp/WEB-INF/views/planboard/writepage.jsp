<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Write Your TODOList!</title>
<link rel="stylesheet" type="text/css" href="/css/writepage.css" />
</head>
<body>
<form method="post">
  <div class="grid">
      <h1>아이템 등록</h1>
      <div class="titlebox">
        <label for="subject" class="title">제목</label>
        <input id="subject" name="subject" type="text" placeholder="제목입력" class="titleinput" />
      </div>
      <div class="deadlinebox">
        <label for="deadLine" class="deadline">기한</label>
        <input id="deadLine" name="deadLine" type="date" placeholder="기한 날짜 입력" class="deadlineinput" />
      </div>
      <div class="right-align">
        <input type="submit" value="저장">
     </div>
  </div>
</form>
</body>
</html>