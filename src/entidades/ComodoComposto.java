package entidades;
import java.util.Set;
public class ComodoComposto extends Comodo {
	
	//private Set<Integer> idComodo = new HashSet<Integer>();
	private int idComodo;
	
	//construtor
	public ComodoComposto(String descricao, int idComodo){
		this.setDescricao(descricao);
		this.setIdComodo(idComodo);
	}
	
	//Set<Comodo> listaComodo = new HashSet<Comodo>();
	
	
	@Override
	public Set<Mobilia> listaMobiliaDisponivel(){
		return null;
	}
	public int getIdComodo() {
		return idComodo;
	}
	public void setIdComodo(int idComodo) {
		this.idComodo = idComodo;
	}
	/*public Set<Integer> getIdComodo() {
		return idComodo;
	}
	public void setIdComodo(Set<Integer> idComodo) {
		this.idComodo = idComodo;
	}*/
}