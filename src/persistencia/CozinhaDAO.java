package persistencia;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import conexao.Conexao;
import entidades.Cozinha;
public class CozinhaDAO {
	
	private Connection connection;
	
	public CozinhaDAO() throws ClassNotFoundException {
		connection = (Connection) new Conexao().getConnection();
	}
	
	//Adiciona quarto no banco
	public void adiciona(Cozinha cozinha) {
		//if(!valida(cozinha)) return;
		String sql = "insert into comodo " +
				"(descricao, tipo)" +
				" values (?,?)";
		//prepared statement para inserção
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			// seta os valores
			stmt.setString(1,cozinha.getDescricao());
			stmt.setString(2,"cozinha");			
			// executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}