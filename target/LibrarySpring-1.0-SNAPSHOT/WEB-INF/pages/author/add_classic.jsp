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
        
        <form action="${pageContext.request.contextPath}/author/save" method="post">
            <div> ${message} </div>
            
            
        <div> First name: 
        
            <div>
                <input type="text" name="firstName" id="firstName">
            </div>
        
        </div>
        
        <div> Last name: 
        
            <div>
                <input type="text" name="lastName" id="lastName">
            </div>
        
        </div>
        
        <p/>
        <button id="save"> Save author <button/>
            </form>
        
    </body>
</html>
