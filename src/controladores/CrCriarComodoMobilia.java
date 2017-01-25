package controladores;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entidades.ComodoMobilia;
import persistencia.ComodoMobiliaDAO;
/**
 * Servlet implementation class CrCriarComodoMobilia
 */
@WebServlet("/CrCriarComodoMobilia")
public class CrCriarComodoMobilia extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrCriarComodoMobilia() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idComodo, idMobilia;
		
		
		idComodo = Integer.parseInt(request.getParameter("idComodo"));
		idMobilia = Integer.parseInt(request.getParameter("idMobilia"));
		
		ComodoMobilia comodoMobilia = new ComodoMobilia(idComodo, idMobilia);
		
		try {
			ComodoMobiliaDAO comodoMobiliaDAO = new ComodoMobiliaDAO();
			comodoMobiliaDAO.adiciona(comodoMobilia);
		
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
	}
}