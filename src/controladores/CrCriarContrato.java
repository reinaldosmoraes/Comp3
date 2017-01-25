package controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistencia.ContratoDAO;
import entidades.Contrato;

/**
 * Servlet implementation class CrCriarContrato
 */
@WebServlet("/CrCriarContrato")
public class CrCriarContrato extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrCriarContrato() {
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
		
		float comissao = Float.parseFloat(request.getParameter("comissao"));
						
		Contrato contrato = new Contrato(comissao);
		System.out.println("Comissao: "+contrato.getComissao());
		
		try {
			ContratoDAO contratoDAO = new ContratoDAO();
			contratoDAO.adiciona(contrato);
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
