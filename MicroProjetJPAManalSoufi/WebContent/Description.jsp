<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
<%@ page import="model.Articles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Description</title>
</head>
<body>
    <h3> Détail de l'article </h3>
    <% List<Articles> ar=(ArrayList<Articles>)request.getAttribute("ar");
		%>
    <label>Référence</label><input type="text" value="${ar.getCodeArticle()}" ReadOnly /><br />
	<label>Quantité en Stock</label><input type="text" value="${ar.getStock()}" ReadOnly /><br />
	<label>Titre</label><input type="text" value="${ar.getDesignation()}" ReadOnly /><br />
	<label>Prix</label><input type="text" value="${ar.getPrix()}" ReadOnly /><br />
	<a href="Catalogue"> Retour </a><br>
    <a href="Panier"> Ajouter au panier </a><br>
</body>
</html>