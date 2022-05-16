<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html> 
	<head>
		
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 		<title>Product List</title>
	</head> 
	<body>
 		<h3>Product List</h3>
 		<p style="color: red;">${errorString}</p>
 		<table border="1" cellpadding="15" cellspacing="1">
 			<tr>
 				<th>Id</th>
 				<th>Name</th>
 				<th>Type</th>
 				<th>Price</th>
 				<th>Edit</th>
 				<th>Delete</th>
 			</tr>
 			
 			<c:forEach  items= "${productList}" var="product">
	 			<tr>
	 				<td>${product.getId()}</td>
	 				<td>${product.getName()}</td>
	 				<td>${product.getType()}</td>
	 				<td>${product.getPrice()}</td>
	 				<td><a href="editProduct?code=${product.getId()}">Edit</a></td>
	 				<td><a href="deleteProduct?code=${product.getId()}">Delete</a></td>
	 			</tr>
 			 </c:forEach> 
 		</table>
 		<a href="createProduct" >Create Product</a>
	</body>
</html>