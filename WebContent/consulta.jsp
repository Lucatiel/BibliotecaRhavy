<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*,
        br.edu.ifpb.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<%
      VolumeDao dao = new VolumeDao();
      List<Volume> volumes = dao.listaTudo();
      
      if(volumes==null)
    	  
      %>
		<h1>Não há nenhum volume a ser listado</h1>
		<%
      else
      for (Volume volume : volumes ) {
      %>
		<tr>
			<td><%=volume.getTitulo() %></td>
			<td><%=volume.getAutores() %></td>
			<td><%=volume.getDescricao() %></td>
			<td><%=volume.getNum_paginas() %></td>
			<td><%=volume.getAno() %></td>
			<td><%=volume.getEditora() %></td>
		</tr>
		<%
      }
      %>
	</table>

</body>
</html>