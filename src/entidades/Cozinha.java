package entidades;
import java.util.HashSet;
import java.util.Set;


public class Cozinha extends Comodo {
	
	private Set<Mobilia> lista = new HashSet<Mobilia>();
	

	public Set<Mobilia> listaMobiliaDisponivel(){
		
/*		for (Mobilia iterador : Cozinha.lista) {
			System.out.println(iterador.getDescricao());
		}
*/
		return lista;
	}
	
	//construtor
		public Cozinha(String descricao){
			this.setDescricao(descricao);
		}

}
