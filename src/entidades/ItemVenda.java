package entidades;

public class ItemVenda {

	private int quantidade, idMobilia, idAmbiente;
	
	//construtor
	public ItemVenda(int idMobilia, int idAmbiente, int quantidade){
		this.setIdMobilia(idMobilia);
		this.setQuantidade(quantidade);
		this.setIdAmbiente(idAmbiente);
	}
		
	public int getQuantidade(){
		return quantidade;
	}
	public void setQuantidade(int quantidade){
		this.quantidade = quantidade;
	}
	
	//get e set de mobilia
	public int getIdMobilia() {
		return idMobilia;
	}
	public void setIdMobilia(int idMobilia) {
		this.idMobilia = idMobilia;
	}

	public int getIdAmbiente() {
		return idAmbiente;
	}

	public void setIdAmbiente(int idAmbiente) {
		this.idAmbiente = idAmbiente;
	}
}
