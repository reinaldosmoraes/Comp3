package entidades;

public class Contrato {
	
	private float comissao;
	
	//construtor
	public Contrato(float comissao){
		this.setComissao(comissao);
	}
	
	//get e set de comissao
	public float getComissao(){
		return comissao;
	}
	public void setComissao(float comissao){
		this.comissao = comissao;
	}	
	
	public float valorContrato(){
		//(soma dos custos de ItemVenda)*(1+comissão)
		float valorContratado=0;
		
	//	valorContratado = Ambiente.getAux() * (1+(comissao/100));
		
		return valorContratado;
	}

	public int prazo(){
		//O prazo de um Contrato é a soma dos tempos de entrega de seus Ambientes associados.
		int prazo = 0;
		/*
		for (ItemVenda iterador : listaItemVenda) {
			
			aux = aux + iterador.getMobilia().getCusto()*iterador.getQuantidade();
		}
		*/
		return prazo;
	}
}
