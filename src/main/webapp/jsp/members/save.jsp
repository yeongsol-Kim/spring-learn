<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Member

    String username = req.getParameter("username");
    int age = Integer.parseInt(req.getParameter("age"));

    Member member = new Member(username, age);
    memberRepository.save(member);

    resp.setContentType("text/html");
    resp.setCharacterEncoding("utf-8");

    PrintWriter w = resp.getWriter();
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/jsp/members/save.jsp" method="post">
    username: <input type="text" name="username" />
    age: <input type="text" name="age" />
    <button type="submit">전송</button>
</form>
</body>
</html>