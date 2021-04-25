<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
<%@ page import="model.Articles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Catalogue</title>
<style>
		table{
			margin:auto;
		}
		table,tr,td{
			border:solid 2px pink;
		}
		td{
			padding:15px;
		}
	</style>
</head>
<body>
    <h1>Catalogue</h1>
	
	<table>
		<tr>
			<td>Référence</td>
			<td>Titre</td>
			<td>Prix</td>
			<td>Panier</td>
		</tr>
		<% List<Articles> articles=(ArrayList<Articles>)request.getAttribute("articles");
			for(Articles a:articles){
		%>
		<tr>
			<td><a href="Description?var=<%= a.getCodeArticle() %>"><%= a.getCodeArticle() %></a></td>
			<td><%= a.getDesignation() %></td>
			<td><%= a.getPrix() %></td>
			<td><a href="Panier">Ajouter au panier</a></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>