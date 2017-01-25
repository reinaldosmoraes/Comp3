package entidades;
public class ComodoCompostoAux {
	
	private int idComodoComposto;
	private int idComodo;
	
	public ComodoCompostoAux(int idComodoComposto, int idComodo){
		this.setIdComodoComposto(idComodoComposto);
		this.setIdComodo(idComodo);
	}
	public int getIdComodo() {
		return idComodo;
	}
	public void setIdComodo(int idComodo) {
		this.idComodo = idComodo;
	}
	public int getIdComodoComposto() {
		return idComodoComposto;
	}
	public void setIdComodoComposto(int idComodoComposto) {
		this.idComodoComposto = idComodoComposto;
	}
}