package persistencia;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import conexao.Conexao;
import entidades.ComodoMobilia;
import entidades.Mobilia;
public class MobiliaDAO {
private Connection connection;
	
	public MobiliaDAO() throws ClassNotFoundException {
		connection = (Connection) new Conexao().getConnection();
	}
	public void adiciona(Mobilia mobilia) {
		//if(!valida(mobilia)) return;
		
		String sql = "insert into mobilia " +
				"(descricao, custo, tempoEntrega, comodo)" +
				" values (?,?,?,?)";
		
		//prepared statement para inserção
		PreparedStatement stmt;
		
		
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			//stmt2 = (PreparedStatement) connection.prepareStatement(sql2);
			// seta os valores
			stmt.setString(1,mobilia.getDescricao());
			stmt.setFloat(2,mobilia.getCusto());	
			stmt.setInt(3,mobilia.getTempoEntrega());
			stmt.setInt(4,mobilia.getIdComodo());
			/*stmt2.setInt(1,comodoMobilia.getIdComodo());
			stmt2.setInt(2, comodoMobilia.getIdMobilia());*/
			// executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
		
		ComodoMobilia comodoMobilia = new ComodoMobilia(mobilia.getIdComodo(), 6);
		
		String sql2 = "insert into comodomobilia " +
				"(comodo, mobilia)" +
				" values (?,?)";
		
		PreparedStatement stmt2;
	
		try {
			stmt2 = (PreparedStatement) connection.prepareStatement(sql2);
			// seta os valores
			stmt2.setInt(1,comodoMobilia.getIdComodo());
			stmt2.setInt(2, comodoMobilia.getIdMobilia());
			// executa
			stmt2.execute();
			stmt2.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
