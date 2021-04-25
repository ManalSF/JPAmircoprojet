<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:setLocale value="${langue}" scope="session" />
<fmt:setBundle basename="messages.messages" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manal Soufi</title>
</head>
<body>
    <form method="post" action="language">
       <select style"padding: 6px" name="langue">
          <option value="fr_FR">Français</option>
          <option value="en_US">English</option>
       </select>
       <input style="background-color:silver; padding:6px; border-radius: 14px" type="submit" value="<fmt:message key="langue" />">
    </form>
  	<header><h2><fmt:message key="bienvenue" /></h2></header>
    <a href="IntInconnu?var=Identifier"><fmt:message key="identi" /></a><br>
    <a href="IntInconnu?var=Inscrire"> <fmt:message key="inscrit" /></a>   
</body>
</html>

   