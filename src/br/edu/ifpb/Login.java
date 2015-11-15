package br.edu.ifpb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login.do")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String login = request.getParameter("nomeAdmin");
		String senha = request.getParameter("senhaAdmin");
		if ((login.equals("admin") && (senha.equals("admin")))) {
			response.sendRedirect("http://localhost:8080/BibliotecaRhavy/cadastro.html");
		} else {
			response.sendRedirect("http://localhost:8080/BibliotecaRhavy/Index.jsp");
		}
	}

}
