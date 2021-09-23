<%@ page contentType="text/html;charset=UTF-8" language="java" import="DataAccessLayer.StudentDAO, Entities.Student" %>
<html>
<head>
    <title>ServletsApp</title>
</head>
<body>
    <table border="1">
   <caption>Список студентов</caption>
   <tr>
    <th>Имя</th>
    <th>Средний бал</th>
    <th>Знает blockchain</th>
   </tr>
   <%
        StudentDAO studentDAO = new StudentDAO();
        for(Student s : studentDAO.getAll()){
    %>
    <tr>
        <td><%=s.getName()%></td>
        <td><%=s.getAverage()%></td>
        <td><%=s.getIsKnownBlockchain()%></td>
    </tr>
    <% }%>
  </table>
  <form action="main" method="get">
        <p><input type="radio" name="exellect" value="true">Отличник<Br>
        <input type="radio" name="blockchain" value="true">Знает blockchain</p>
        <p><input type="submit"></p>
    </form>
</body>
</html>