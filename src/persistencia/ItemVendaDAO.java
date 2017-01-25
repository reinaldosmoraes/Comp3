package persistencia;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import conexao.Conexao;
import entidades.ItemVenda;

public class ItemVendaDAO {
	
private Connection connection;
	
	public ItemVendaDAO() throws ClassNotFoundException {
		connection = (Connection) new Conexao().getConnection();
	}
	
	//Adiciona quarto no banco
	public void adiciona(ItemVenda itemVenda) {
		//if(!valida(itemVenda)) return;
		String sql = "insert into itemVenda " +
				"(quantidade, mobilia, ambiente)" +
				" values (?,?,?)";
		//prepared statement para inserção
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			// seta os valores
			stmt.setInt(1,itemVenda.getQuantidade());
			stmt.setInt(2,itemVenda.getIdMobilia());
			stmt.setInt(3,itemVenda.getIdAmbiente());
			// executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
