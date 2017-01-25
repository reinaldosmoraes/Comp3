package controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistencia.CozinhaDAO;
import entidades.Cozinha;

/**
 * Servlet implementation class CrCriarCozinha
 */
@WebServlet("/CrCriarCozinha")
public class CrCriarCozinha extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrCriarCozinha() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Cozinha cozinha = new Cozinha(request.getParameter("descricao"));
		//System.out.println(cozinha.getDescricao());
		try {
			CozinhaDAO cozinhaDAO = new CozinhaDAO();
			cozinhaDAO.adiciona(cozinha);
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
