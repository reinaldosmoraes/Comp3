package persistencia;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import conexao.Conexao;
import entidades.ComodoComposto;
import entidades.ComodoCompostoAux;

public class ComodoCompostoDAO {
private Connection connection;
	
	public ComodoCompostoDAO() throws ClassNotFoundException {
		connection = (Connection) new Conexao().getConnection();
	}
	
	//Adiciona quarto no banco
	public void adiciona(ComodoComposto comodoComposto) {
		//if(!valida(quarto)) return;
		String sql = "insert into comodo" +
				"(descricao, tipo)" +
				" values (?,?)";
		//prepared statement para inserção
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			// seta os valores
			stmt.setString(1,comodoComposto.getDescricao());
			stmt.setString(2,"comodoComposto");			
			// executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
		ComodoCompostoAux comodoCompostoAux = new ComodoCompostoAux(10, comodoComposto.getIdComodo());
		System.out.println("Criei um comodoCompostoAux!!!\nidComodoComposto: "+comodoCompostoAux.getIdComodoComposto()+"\nidComodo: "+comodoCompostoAux.getIdComodo());
		
		String sql2 = "insert into comodocomposto " +
				"(comodocomposto, comodo)" +
				" values (?,?)";
		
		PreparedStatement stmt2;
	
		try {
			stmt2 = (PreparedStatement) connection.prepareStatement(sql2);
			// seta os valores
			stmt2.setInt(1,comodoCompostoAux.getIdComodoComposto());
			stmt2.setInt(2, comodoCompostoAux.getIdComodo());
			// executa
			stmt2.execute();
			stmt2.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}		
	}
}