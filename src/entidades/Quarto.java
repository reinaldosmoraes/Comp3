package entidades;
import java.util.HashSet;
import java.util.Set;

public class Quarto extends Comodo {
	
	private Set<Mobilia> lista = new HashSet<Mobilia>();
	
	public Set<Mobilia> listaMobiliaDisponivel(){
		
/*		for (Mobilia iterador : Quarto.lista) {
			System.out.println(iterador.getDescricao());
		}
*/
		return lista;
	}
	
	//construtor
	public Quarto(String descricao){
		this.setDescricao(descricao);
	}
	
	
}
