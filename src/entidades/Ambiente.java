package entidades;

public class Ambiente {
	private int numParedes;
	private int numPortas;
	private float metragem;
	private int idContrato;
	
	//contrutor de Ambiente
	public Ambiente(int numParedes, int numPortas, float metragem, int idContrato){
		this.setNumParedes(numParedes);
		this.setNumPortas(numPortas);
		this.setMetragem(metragem);
		this.setidContrato(idContrato);
	}
	
	//get e set de numParedes
	public int getNumParedes(){
		return numParedes;
	}
	public void setNumParedes(int numParedes){
		this.numParedes = numParedes;
	}
	
	//get e set de numPortas
	public int getNumPortas(){
		return numPortas;
	}
	public void setNumPortas(int numPortas){
		this.numPortas = numPortas;
	}
	
	//get e set de metragem
	public float getMetragem(){
		return metragem;
	}
	public void setMetragem(float metragem){
		this.metragem = metragem;
	}
	
	//Calculo do custo do Ambiente
	/*	public float custo(int idAmbiente){
		
		//soma dos custos das instancias ItemVenda + 10*numParedes + 5*numPortas + 2.5*metragem.
		float custo = 0;
		
		for(ItemVenda iterador1: listaItemVenda){
			custo = custo + iterador1.getMobilia().getCusto()*iterador1.getQuantidade();
			
		}
		custo = (float) (custo + (10*numParedes + 5*numPortas + 2.5*metragem));
		
		return custo;
	}
	
	public void custoAuxiliar(){
		
		for(ItemVenda iterador1: listaItemVenda){
			aux = aux + iterador1.getMobilia().getCusto()*iterador1.getQuantidade();
			
		}
	}
*/	

	public int getidContrato() {
		return idContrato;
	}
	public void setidContrato(int idContrato) {
		this.idContrato = idContrato;
	}
	//Calculo do tempo de entrega em semanas
	/*public int tempoEntrega(){
		//(Maior tempo de entrega de mobília associada) + 2*numParedes + numPortas/2
		int tempoEntrega=0;
		
		for (ItemVenda iterador : listaItemVenda) {
			
			if(tempoEntrega < iterador.getMobilia().getTempoEntrega()){
				tempoEntrega = iterador.getMobilia().getTempoEntrega();
			}
		}
		tempoEntrega = tempoEntrega + 2*numParedes + numPortas/2;
		
		System.out.println(tempoEntrega);
		
		return tempoEntrega;
	}*/
	
	
}