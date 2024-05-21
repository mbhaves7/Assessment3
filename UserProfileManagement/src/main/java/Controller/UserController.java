package Controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.userDAO;
import Model.user;
import service_for_OTP.Servicesss;

@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("register")) {
			user u = new user();
			u.setFirst_name(request.getParameter("first_name"));
			u.setLast_name(request.getParameter("last_name"));
			u.setEmail(request.getParameter("email"));
			u.setContact(Long.parseLong(request.getParameter("contact")));
			u.setAddress(request.getParameter("address"));
			u.setGender(request.getParameter("gender"));
			u.setStatus("pending");
			u.setPassword(request.getParameter("newp"));
			System.out.println(u);
			String email = request.getParameter("email");
			boolean flag = userDAO.checkEmail(email);

			String np = request.getParameter("newp");
			String cnp = request.getParameter("confirmnp");
			if (flag == false) {
				if (np.equals(cnp)) {
					request.setAttribute("msg", "suss");
					userDAO.userInsert(u);
					Random r = new Random();
					int num = r.nextInt(9999);
					Servicesss s = new Servicesss();
					s.sendMail(email, num);
					request.setAttribute("email", email);
					request.setAttribute("otp", num);
					request.getRequestDispatcher("otp_page.jsp").forward(request, response);
				} else {
					request.setAttribute("msg1", "password are not same");
					request.getRequestDispatcher("user-Registration.jsp").forward(request, response);
				}

			} else {
				request.setAttribute("msg2", "Email already Register");
				request.getRequestDispatcher("user-Registration.jsp").forward(request, response);
			}
		} else if (action.equalsIgnoreCase("verifyotp")) {
			String email = request.getParameter("email");
			int otp1 = Integer.parseInt(request.getParameter("otp1"));
			int otp2 = Integer.parseInt(request.getParameter("otp2"));
			if (otp1 == otp2) {
				user u1 = new user();
				u1.setEmail(request.getParameter("email"));
				u1.setStatus("complete");

				userDAO.updateStatus(email,u1);
				response.sendRedirect("user-login.jsp");
			} else {
				request.setAttribute("email", email);
				request.setAttribute("otp", otp1);
				request.setAttribute("msg1", "OTP NOT MATCH");
				request.getRequestDispatcher("otp_page.jsp").forward(request, response);
			}

		} else if (action.equalsIgnoreCase("login")) {

			user u = new user();
			u.setEmail(request.getParameter("email"));
			u.setPassword(request.getParameter("password"));
			String email = request.getParameter("email");
			boolean flag = userDAO.checkEmail(email);
			if (flag == true) {
				user u1 = userDAO.userLogin(u);
				if (u1 == null) {
					request.setAttribute("msg1", "Error: Password is invalid");
					request.getRequestDispatcher("user-login.jsp").forward(request, response);
				} else {
					HttpSession session = request.getSession();
					session.setAttribute("data", u1);
					request.getRequestDispatcher("user-index.jsp").forward(request, response);
				}

			} else {
				request.setAttribute("msg", "email is not correct");
				request.getRequestDispatcher("user-login.jsp").forward(request, response);
			}
		} else if (action.equalsIgnoreCase("cp")) {
			try {

				int id = Integer.parseInt(request.getParameter("id"));
				String op = request.getParameter("op");
				String np = request.getParameter("np");
				String cnp = request.getParameter("cnp");
				boolean flag = userDAO.checkPassword(id, op);
				if (flag == true) {
					if (np.equals(cnp)) {
						request.setAttribute("msg", "suss");
						userDAO.updatePassword(id, cnp);
						response.sendRedirect("user-index.jsp");
					} else {
						request.setAttribute("msg1", "password are not same");
						request.getRequestDispatcher("user-change-password.jsp").forward(request, response);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		else if (action.equalsIgnoreCase("get otp")) {
			String email = request.getParameter("email");
			boolean flag = userDAO.checkEmail(email);
			if (flag == true) {
				Random r = new Random();
				int num = r.nextInt(9999);
				Servicesss s = new Servicesss();
				s.sendMail(email, num);
				request.setAttribute("email", email);
				request.setAttribute("otp", num);
				request.getRequestDispatcher("verify-otp.jsp").forward(request, response);
			} else {
				request.setAttribute("msg", "account not registered");
				request.getRequestDispatcher("forgot-password.jsp").forward(request, response);
			}
		} else if (action.equalsIgnoreCase("verify")) {

			String email = request.getParameter("email");

			int otp1 = Integer.parseInt(request.getParameter("otp1"));
			int otp2 = Integer.parseInt(request.getParameter("otp2"));
			if (otp1 == otp2) {
				request.setAttribute("email", email);
				request.setAttribute("otp", otp1);
				request.getRequestDispatcher("new-password.jsp").forward(request, response);
			} else {
				request.setAttribute("email", email);
				request.setAttribute("otp", otp1);
				request.setAttribute("msg1", "invalid try again");
				request.getRequestDispatcher("forgot-password.jsp").forward(request, response);

			}

		} else if (action.equalsIgnoreCase("new_p")) {
			String email = request.getParameter("email");
			String np = request.getParameter("np");
			String cnp = request.getParameter("cnp");
			if (np.equals(cnp)) {
				userDAO.newPassword(email, np);
				response.sendRedirect("user-login.jsp");
			}

		}
	}

}
