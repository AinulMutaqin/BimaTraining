<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Halaman Keluarga</title>
</head>
<body bgcolor="#FFFFF">
	<h1>Bapak dan Anak</h1>
	Nama: ${person.nama} <br />
	Alamat: ${person.alamat} 
	<p>

		<b>Anakanak</b>:
	<p>
	<table border=1 cellpadding=3 cellspacing=0>
		<tr bgcolor="#C0C0C0">
			<td>Nama</td>
			<td>Alamat</td>
		</tr>
		<c:forEach var="p" items="${children}">
			<tr>
				<td>${p.nama }</td>
				<td>${p.alamat }</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>