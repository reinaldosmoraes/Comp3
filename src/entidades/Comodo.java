package entidades;

import java.util.Set;

public abstract class Comodo {

	private String descricao;
	
	public abstract Set<Mobilia> listaMobiliaDisponivel();
	
	//get e set de descrição
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
	
}
