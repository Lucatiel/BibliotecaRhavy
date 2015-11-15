package br.edu.ifpb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Cadastro.do")
public class Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Volume volume = new Volume();
		volume.setAno(request.getParameter("ano"));
		volume.setDescricao(request.getParameter("descricao"));
		volume.setEditora(request.getParameter("editora"));
		volume.setTipovolume(request.getParameter(null));
		volume.setTitulo(request.getParameter("titulo"));
		
	}

}
