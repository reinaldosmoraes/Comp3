package entidades;
public class ComodoMobilia {
	
	private int idComodo;
	private int idMobilia;
	
	public ComodoMobilia(int idComodo, int idMobilia){
		this.setIdComodo(idComodo);
		this.setIdMobilia(idMobilia);
	}
	
	//get e set de idComodo
	public int getIdComodo() {
		return idComodo;
	}
	public void setIdComodo(int idComodo) {
		this.idComodo = idComodo;
	}
	
	//get e set de idMobilia
	public int getIdMobilia() {
		return idMobilia;
	}
	public void setIdMobilia(int idMobilia) {
		this.idMobilia = idMobilia;
	}
}