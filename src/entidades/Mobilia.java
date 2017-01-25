package entidades;

public class Mobilia {
	
	private int idComodo;
	private String descricao;
	private float custo;
	private int tempoEntrega;//tempoEntrega é dado em semanas
	
	//construtor
	public Mobilia(int idComodo, String descricao, float custo, int tempoEntrega) {
		this.setIdComodo(idComodo); 
		this.descricao = descricao;
		this.custo = custo;
		this.tempoEntrega = tempoEntrega;
	}
	
	//get e set de descricao
	public String getDescricao(){
		return descricao;
	}
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	
	//get e set de custo
	public float getCusto(){
		return custo;
	}
	public void setCusto(float custo){
		this.custo = custo;
	}
	
	//get e set de tempoEntrega
	public int getTempoEntrega(){
		return tempoEntrega;
	}
	public void setTempoEntrega(int tempoEntrega){
		this.tempoEntrega = tempoEntrega;
	}

	//get e set de comodo
	public int getIdComodo() {
		return idComodo;
	}
	public void setIdComodo(int idComodo) {
		this.idComodo = idComodo;
	}
}
