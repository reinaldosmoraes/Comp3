package persistencia;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import conexao.Conexao;
import entidades.Contrato;

public class ContratoDAO {

private Connection connection;
	
	public ContratoDAO() throws ClassNotFoundException {
		connection = (Connection) new Conexao().getConnection();
	}
	
	//Adiciona contrato no banco
	public void adiciona(Contrato contrato) {
		//if(!valida(contrato)) return;
		String sql = "insert into contrato " +
				"(comissao)" +
				" values (?)";
		//prepared statement para inserção
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			// seta os valores
			stmt.setFloat(1, contrato.getComissao());
			// executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
