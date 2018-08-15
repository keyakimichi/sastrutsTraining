<%@page pageEncoding="UTF-8"%>
<html>
  <body>
    Strutsのタグ : <bean:write name="empId" /><br>
    JSTLのタグ : <c:out value="${empId}" /><br>
    EL : ${f:h(empId)}<br>
    Hello, Employee!
  </body>
</html>
