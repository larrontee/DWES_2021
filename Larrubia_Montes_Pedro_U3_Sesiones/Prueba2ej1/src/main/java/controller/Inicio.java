package controller;

import java.io.IOException;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class Inicio extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*" + "@"
			+ "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

	private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

	private static final String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,16}$";

	private static final Pattern PASSWORD_PATTERN = Pattern.compile(PASSWORD_REGEX);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Inicio() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("login.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("pass");
		String confirmpassword = request.getParameter("confirmpass");
		String mail = request.getParameter("mail");

		if (request.getParameter("registro") != null || password.equals(confirmpassword) && EMAIL_PATTERN.matcher(mail).matches()
				&& PASSWORD_PATTERN.matcher(password).matches()) {
		
			request.setCharacterEncoding("UTF-8");

			sesion.setAttribute("usuario", usuario);
			sesion.setAttribute("contraseña", password);
			sesion.setAttribute("mail", usuario);

			response.sendRedirect(request.getContextPath() + "/Reservar");
			return;
		}
		response.sendRedirect(request.getContextPath());
	}

}
