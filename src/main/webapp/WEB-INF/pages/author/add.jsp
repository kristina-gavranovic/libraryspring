<%-- 
    Document   : add
    Created on : Jul 8, 2020, 6:00:53 PM
    Author     : Kristina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add author!</h1>

        <form:form action="${pageContext.request.contextPath}/author/save" method="post" modelAttribute="authorDto">

            <c:if test="${not empty message}">
                <div> ${message} </div>
            </c:if>


            <c:if test="${not empty invalid}">
                <div> Error message: ${invalid}</div>
            </c:if>

            <div> First name: 

                <div>
                    <form:input type="text" path="firstName" id="firstName"/>
                </div>

                <div>  <form:errors path="firstName">   </form:errors></div>

                </div>

                <div> Last name: 

                    <div>
                    <form:input type="text" path="lastName" id="lastName"/>
                </div>
                <div>  <form:errors path="lastName">   </form:errors></div>


                </div>

                <p/>
                <button id="save"> Save author <button/>
            </form:form>

    </body>
</html>
