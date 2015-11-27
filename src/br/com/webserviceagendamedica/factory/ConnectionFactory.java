package br.com.webserviceagendamedica.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Classe responsável por criar a conexão com banco de dados.
 * @author Renan
 *
 */
public class ConnectionFactory {
	private static final String DRIVER="org.postgresql.Driver";
	private static final String URL="jdbc:postgresql://localhost:5432/AgendaMedica";
	private static final String USER="postgres";
	private static final String PASSWORD="1234";
	
	@SuppressWarnings("finally")
	public static Connection criaConexao() {
		Connection conn = null;
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL,USER,PASSWORD);
			
		} catch (Exception e) {
			System.out.println("Erro na conexão com o banco de dados" + e);
			e.printStackTrace();
		} finally{
			return conn;
		}
	}
	
	public static void fechaConexao(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			if(conn != null) {
				conn.close();
			}
			if(pstmt != null){
				pstmt.close();
			}
			if(rs != null) {
				rs.close();
			}
		} catch (Exception e) {
			System.out.println("Erro no encerramento da conexão " + e);
			e.printStackTrace();
		}
	}
}
