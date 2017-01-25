package controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistencia.ItemVendaDAO;
import entidades.ItemVenda;

/**
 * Servlet implementation class CrItemVenda
 */
@WebServlet("/CrCriarItemVenda")
public class CrCriarItemVenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrCriarItemVenda() {
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
		int idMobilia = Integer.parseInt(request.getParameter("idMobilia"));
		int quantidade = Integer.parseInt(request.getParameter("quantidade"));
		int idAmbiente = Integer.parseInt(request.getParameter("idAmbiente"));
		
		ItemVenda itemVenda = new ItemVenda(idMobilia, idAmbiente, quantidade);
		System.out.println("ItemVenda: "+itemVenda.getQuantidade());
		
		try {
			ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
			itemVendaDAO.adiciona(itemVenda);
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
