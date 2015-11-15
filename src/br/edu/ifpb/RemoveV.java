package br.edu.ifpb;

import java.io.IOException;

import javax.persistence.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RemoveV.do")
public class RemoveV extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("volume");
		EntityManager manager = factory.createEntityManager();

		String id = request.getParameter("ID");

		Volume encontrada = manager.find(Volume.class, id);

		manager.getTransaction().begin();
		manager.remove(encontrada);
		manager.getTransaction().commit();
	}

}
