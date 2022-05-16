package Servlets;
import static Servlets.DBUtils.insertUserAccount;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/LogInServlet")
public class LogInServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	public LogInServlet()
	{
		super();
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.getWriter().append("Server at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		Connection conn;
		try
		{
			conn = MySQLConntUtils.getMySQLConnection();
			//xử lý tham số từ form
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			UserAccount usr = new UserAccount(username,password);
			UserAccount u= DBUtils.findUser(conn,usr.getUserName(),usr.getPassword());
			if (u != null)
			{
				UserAccount user = new UserAccount(u);
				request.setAttribute("username","Chào bạn: "+ user.getUserName());
				request.getRequestDispatcher("/Index.jsp").forward(request, response);
			}
			else
			{
				response.setContentType("text/html;charset=UTF-8");
				try(PrintWriter out = response.getWriter())
				{
					out.println("<!DOCTYPE html>"); 
					out.println("<html>");
					out.println("<head>");
					out.println( "<title> Thông báo </title>)" );
					out.println("</head>"); 
					out.println("<body>");
					out.println("<h1>Thông tin đăng nhập không chính xác <a href='DangNhap.jsp'>Nhập lại</a></h1>");
					out.println("</body>");
					out.println("</html>");
				}
			}
		}
		catch (ClassNotFoundException ex)
		{
			Logger.getLogger(SignInServlet.class.getName()).log(Level.SEVERE, null, ex);
			
		}
		catch (SQLException ex)
		{
			Logger.getLogger(SignInServlet.class.getName()).log(Level.SEVERE, null, ex);
			ádfádfádf
			
		}
	}
}
