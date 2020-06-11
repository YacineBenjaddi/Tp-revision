<%@page import="java.util.ArrayList"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@page import="service.Service"%>
<%@page import="action.Action"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

        <%@ page import="bean.Conge" %>
          <%@ page import="bean.Salarie" %>
        <%@ page import="java.util.LinkedList" %>
   
<%@ page import="service.*"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste conge</title>
</head>
<body>
<br><br>
<center>
<h1 style="color:green ;text-decoration: underline;">Ajouter un conge</h1><br>


<form action="getAllSalarie" method="get">
<label for="pet-select">Choisir un salarie:</label>

<select name="id_salarie" id="id_salarie">
    <option >--Please choose an option--</option>
    <option value="id_salarie">
     <c:forEach var="salarie" items="${l}" varStatus="i" >
    <c:out value="${salarie.getNom()}" />
</c:forEach>
</option>
   
</select>

</form>
<form action="AddConge" method="get"><br>
<strong style="color:black;">Entrer la date debut:</strong>
<input type="text" id="date_debut" name ="date_debut" /><br><br>
<strong style="color:black;">Entrer la date fin:</strong>
<input type="text" id="date_fin" name ="date_fin" /><br><br>

<input type="submit" value="Ajouter"><br>
</form>
<br>

</body>
</html>