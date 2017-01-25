package persistencia;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import conexao.Conexao;
import entidades.Quarto;

public class QuartoDAO {
	
	private Connection connection;
	
	public QuartoDAO() throws ClassNotFoundException {
		connection = (Connection) new Conexao().getConnection();
	}
	
	//Adiciona quarto no banco
	public void adiciona(Quarto quarto) {

		//if(!valida(quarto)) return;

		String sql = "insert into comodo " +
				"(descricao, tipo)" +
				" values (?,?)";

		//prepared statement para inserção
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			// seta os valores
			stmt.setString(1,quarto.getDescricao());
			stmt.setString(2,"quarto");			

			// executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {

			throw new RuntimeException(e);
		}
	}
	
}
