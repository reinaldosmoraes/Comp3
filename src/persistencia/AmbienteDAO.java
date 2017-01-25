package persistencia;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import conexao.Conexao;
import entidades.Ambiente;
public class AmbienteDAO {
	
private Connection connection;
	
	public AmbienteDAO() throws ClassNotFoundException {
		connection = (Connection) new Conexao().getConnection();
	}
	
	//Adiciona quarto no banco
	public void adiciona(Ambiente ambiente) {
		//if(!valida(itemVenda)) return;
		String sql = "insert into ambiente " +
				"(numParedes, numPortas, metragem, contrato)" +
				" values (?,?,?,?)";
		//prepared statement para inserção
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			// seta os valores
			stmt.setInt(1,ambiente.getNumParedes());
			stmt.setInt(2,ambiente.getNumPortas());
			stmt.setFloat(3,ambiente.getMetragem());
			stmt.setInt(4,ambiente.getidContrato());
			// executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}