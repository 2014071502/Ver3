

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class thrift
 */
@WebServlet("/thrift")
public class thrift extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Applicant person;
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		createApplicant(request,response);
		out.println("<html>");
		out.println("<head><title>");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.print("<form method = 'post' action = 'menu'>");
		out.println("<h1>Hello " + person.getFname() +" "+ person.getLname() + "</h1>" + ", "
				+ "Where would you want to eat?<br>");
		out.println("<select name='restaurant'");
		out.println("<option value='Dimsum Treats'> Dimsum Treats </option>");
		out.println("<option value='Tori Box'> Tori Box </option>");
		out.println("<option value='Pasta boy'> Pasta Boy </option>");
		out.println("<option value='Dimsum Treats'> Dimsum Treats </option><br>");
		out.println("<li><input type='submit' value='proceed'");
		out.print("</body>");
		out.print("</html>");
	}
	private void createApplicant(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		person = new Applicant();
		person.setFname(request.getParameter("fname"));
		person.setLname(request.getParameter("lname"));
	}
}