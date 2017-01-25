package controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistencia.AmbienteDAO;
import entidades.Ambiente;

/**
 * Servlet implementation class CrCriarAmbiente
 */
@WebServlet("/CrCriarAmbiente")
public class CrCriarAmbiente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrCriarAmbiente() {
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
		
		int numParedes;
		int numPortas, idContrato;
		float metragem;
		
		numParedes = Integer.parseInt(request.getParameter("numParedes"));
		numPortas = Integer.parseInt(request.getParameter("numPortas"));
		metragem = Float.parseFloat(request.getParameter("metragem"));
		idContrato = Integer.parseInt(request.getParameter("idContrato"));
		
		Ambiente ambiente = new Ambiente(numParedes, numPortas, metragem, idContrato);
		
		try {
			AmbienteDAO ambienteDAO = new AmbienteDAO();
			ambienteDAO.adiciona(ambiente);
		
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
	}
}
