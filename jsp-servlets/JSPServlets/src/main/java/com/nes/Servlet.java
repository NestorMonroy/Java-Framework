package com.nes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet
 */
public class Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private String rutaJsp;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		rutaJsp = config.getInitParameter("rutaJsp");
		System.out.println(rutaJsp);
		/*
		 * super.init(config); System.out.println("rutaJsp");
		 */
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();

		/*
		 * out.println("<html>");
		 * out.println("<h1>Mensaje desde mi primer Servlet</h1>");
		 * out.println("</html>");
		 */

		String accion = request.getParameter("accion");

		if (accion != null) {
			if (accion.equals("login")) {
				getServletContext().getRequestDispatcher(rutaJsp + "login.jsp").forward(request, response);

			} else if (accion.equals("inicio")) {
				{
					getServletContext().getRequestDispatcher(rutaJsp + "index.jsp").forward(request, response);
				}
			} else if (accion.equals("iniciarSesion")) {
				getServletContext().getRequestDispatcher(rutaJsp + "postLogin.jsp").forward(request, response);
			}

		} else {
			// getRequestDispatcher la vista que se requiere
			getServletContext().getRequestDispatcher(rutaJsp + "index.jsp").forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String accion = request.getParameter("accion");

		if (accion != null) {
			if (accion.equals("iniciarSesion")) {
//				System.out.println("Usuario: " + request.getParameter("usuario") + ", Contraseña: "
//						+ request.getParameter("contrasena"));

				String usuario = request.getParameter("usuario");
				String contrasena = request.getParameter("contrasena");

				// Ámbito Request MAP(Clave-Valor)
				// Solo existe por UNA sola vez o peticion
				request.setAttribute("usuario", usuario);
				request.setAttribute("contrasena", contrasena);

				// Ámbito Sesión
				// Coloca el objecto mientras la navegacion este abierta ** o la ventana del
				// navegador este abierta ** Si se cierra la venta, el objecto es destruido
				HttpSession sesion = request.getSession();
				sesion.setAttribute("usuario", usuario);
				sesion.setAttribute("contrasena", contrasena);

				// Ámbito Contexto
				// Contexto del servlet ** existe mientras el Servelet no ejecute un metodo
				// destroy()
				ServletContext contexto = getServletContext();
				contexto.setAttribute("usuario", usuario);
				contexto.setAttribute("contrasena", contrasena);

				getServletContext().getRequestDispatcher("/jsp/postLogin.jsp").forward(request, response);

			}

		} else {
			// getRequestDispatcher la vista que se requiere
			getServletContext().getRequestDispatcher("/jsp/index.jsp").forward(request, response);
		}

	}

}
