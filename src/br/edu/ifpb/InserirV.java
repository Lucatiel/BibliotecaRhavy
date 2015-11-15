package br.edu.ifpb;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InserirV.do")
public class InserirV extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Volume V = new Volume();

		/*V.setTitulo(request.getParameter("titulo"));
		V.setAutores(request.getParameter("autores"));
		V.setDescricao(request.getParameter("descricao"));
		V.setTipovolume(request.getParameter("tipovolume"));
		V.setNum_paginas(request.getParameter("num_paginas"));
		V.setAno(request.getParameter("ano"));
		V.setEditora(request.getParameter("editora"));*/
		
		V.setTitulo("teste");
		V.setAutores("teste");
		V.setDescricao("teste");
		V.setTipovolume("teste");
		V.setNum_paginas("teste");
		V.setAno("teste");
		V.setEditora("teste");

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		manager.persist(V);
		manager.getTransaction().commit();

		manager.close();
	}

}
