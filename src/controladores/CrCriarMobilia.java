package controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistencia.MobiliaDAO;
import entidades.Mobilia;

/**
 * Servlet implementation class CrCriarMobilia
 */
@WebServlet("/CrCriarMobilia")
public class CrCriarMobilia extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrCriarMobilia() {
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

		float custo;
		int tempoEntrega, idComodo;
		
		custo = Float.parseFloat(request.getParameter("custo"));
		tempoEntrega = Integer.parseInt(request.getParameter("tempoEntrega"));
		idComodo = Integer.parseInt(request.getParameter("idComodo"));
		
		Mobilia mobilia = new Mobilia(idComodo, request.getParameter("descricao"), custo, tempoEntrega);
		
		System.out.println("descricao: "+mobilia.getDescricao()+"\ncusto: "+mobilia.getCusto()+"\ntempo de entrega: "+mobilia.getTempoEntrega());
		
		try {
			MobiliaDAO mobiliaDAO = new MobiliaDAO();
			mobiliaDAO.adiciona(mobilia);
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
