<%--
  Created by IntelliJ IDEA.
  User: hieun
  Date: 9/19/2024
  Time: 9:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><html>
<head>
    <title>Survey Results</title>
</head>
<body>
<h1>Thanks for taking our survey!</h1>
<p>Here is the information that you entered:</p>
<ul>
    <li>Email: ${user.email}</li>
    <li>First Name: ${user.firstName}</li>
    <li>Last Name: ${user.lastName}</li>
    <li>Heard From: ${user.hearFrom}</li>
    <li>Updates: ${user.wantsUpdates ? 'Yes' : 'No'}</li>

    <c:if test="${user.wantsUpdates}">
        <li>Contact Via: ${user.contact}</li>
    </c:if>
</ul>
</body>
</html>
