package persistencia;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import conexao.Conexao;
import entidades.ComodoMobilia;
public class ComodoMobiliaDAO {
	
private Connection connection;
	
	public ComodoMobiliaDAO() throws ClassNotFoundException {
		connection = (Connection) new Conexao().getConnection();
	}
	
	//Adiciona no banco
	public void adiciona(ComodoMobilia comodoMobilia) {
		//if(!valida(comodoMobilia)) return;
		String sql = "insert into comodomobilia " +
				"(Comodo, Mobilia)" +
				" values (?,?)";
		//prepared statement para inserção
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			// seta os valores
			stmt.setInt(1,comodoMobilia.getIdComodo());
			stmt.setInt(2,comodoMobilia.getIdMobilia());
			
			// executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}