package persistencia;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import conexao.Conexao;
import entidades.Sala;

public class SalaDAO {

	private Connection connection;
	
	public SalaDAO() throws ClassNotFoundException {
		connection = (Connection) new Conexao().getConnection();
	}
	
	//Adiciona Sala no banco
	public void adiciona(Sala sala) {

		//if(!valida(Sala)) return;
			String sql = "insert into comodo " +
			"(descricao, tipo)" +
			" values (?,?)";

		//prepared statement para inserção
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			// seta os valores
			stmt.setString(1,sala.getDescricao());
			stmt.setString(2,"sala");			

			// executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {

			throw new RuntimeException(e);
		}
	}
}