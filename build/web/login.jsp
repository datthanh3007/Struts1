<%-- 
    Document   : login
    Created on : Mar 5, 2021, 10:35:30 AM
    Author     : Dell7450
--%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="/Login" method="POST" >
            UserName :<input type="text" name="userName" /> <br>
            PassWord  :<input type="text" name="passWord" /> <br>
        <html:submit value="Login" />
       </form>
    </body>
</html>
