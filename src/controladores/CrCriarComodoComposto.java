package controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistencia.ComodoCompostoDAO;
import entidades.ComodoComposto;

/**
 * Servlet implementation class CrCriarComodoComposto
 */
@WebServlet("/CrCriarComodoComposto")
public class CrCriarComodoComposto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrCriarComodoComposto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int idComodo = Integer.parseInt(request.getParameter("idComodo"));
		
		ComodoComposto comodoComposto = new ComodoComposto(request.getParameter("descricao"), idComodo);
		try {
			ComodoCompostoDAO comodoCompostoDAO = new ComodoCompostoDAO();
			comodoCompostoDAO.adiciona(comodoComposto);
		
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
	}
}
