<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<DOCTYPE! html>
<html>
<body>
<h2>Write name</h2>

<br>
<br>

<form:form action = "showDetails" modelAttribute = "employee">
    Name <form:input path = "name"/>
    <form:errors path = "name"/>
    <br>
    <br>
    Age <form:input path = "age"/>
    <form:errors path = "age"/>
    <br>
    <br>
    Department <form:select path = "department">
    <form:option value = "IT" label = "Info Tech"/>
    <form:option value = "HR" label = "Human Resources"/>
    <form:option value = "Sales" label = "Sales"/>
    </form:select>
    <br>
    <br>
    Which car do you want?
    <br>
    <br>
    BMW     <form:radiobutton path = "carBrand" value = "BMW"/>
    <br>
    Audi    <form:radiobutton path = "carBrand" value = "Audi"/>
    <br>
    Porsche <form:radiobutton path = "carBrand" value = "Porsche"/>
    <br>
    <br>
    Language(s):
    <br>
    EN <form:checkbox path = "languages" value = "English"/>
    FR <form:checkbox path = "languages" value = "French"/>
    RU <form:checkbox path = "languages" value = "Russian"/>
    <br>
    <br>
    Email <form:input path = "mail"/>
    <form:errors path = "mail"/>
    <br>
    <br>
    <input type = "submit" value="Okki?"/>
</form:form>
<br>
<br>
</form>
</body>
</html>