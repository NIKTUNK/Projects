<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>Hi</h2>
Your name: ${employee.name}
<br>
Your age: ${employee.age}
<br>
Your department: ${employee.department}
<br>
Your car: ${employee.carBrand}
<br>
Language(s):
<ul>
    <c:forEach var = "lang" items = "${employee.languages}">
        <li> ${lang} </li>
    </c:forEach>
</ul>

Your email: ${employee.mail}
<br>
<a href = "askDetails">Write info again</a>

</body>
</html>