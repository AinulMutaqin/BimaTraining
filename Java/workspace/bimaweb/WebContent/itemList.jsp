<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	${send }
	<p>
	Jumlah angka yang dikirim: ${hasil}
	Barang-barang yang dibeli:
	<P>
	<table border=1 cellpadding=3 cellspacing=0>
		<tr bgcolor="#C0C0C0">
			<td>Nama Item</td>
			<td>Harga</td>
			<td>Quantity</td>
		</tr>
		<c:forEach items="${barang }" var="item">
			<tr>
				<td>${item.itemName }</td>
				<td>${item.price }</td>
				<td>${item.quantity }</td>
			</tr>
	</c:forEach>
	</table>
</body>
</html>