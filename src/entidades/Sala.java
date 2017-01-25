package entidades;
import java.util.HashSet;
import java.util.Set;

public class Sala extends Comodo {
	
	private Set<Mobilia> lista = new HashSet<Mobilia>();
	

	public Set<Mobilia> listaMobiliaDisponivel(){
		return lista;
	}
	
	//construtor
	public Sala(String descricao){
		this.setDescricao(descricao);
	}
}
