package br.silveiraalexand.bsi.model;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.stereotype.Component;

@Component
public class ConexaoBD {

	private final static String CONNECTION_STRING = "jdbc:mysql://localhost/lojadbc_alex?user=root&password=root";
	
	static{
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();			
		} catch (InstantiationException |
				 IllegalAccessException |
				 ClassNotFoundException e) {
			throw new RuntimeException("Não foi possivel carregar o driver do MySql" + e.getMessage());
		}
	}
	
	public Connection obterConexao(){
		try{
			return DriverManager.getConnection(CONNECTION_STRING);
			} catch (Exception e) {
				throw new RuntimeException("Não foi possivel obter uma conexão com MySQL" + e.getMessage());
			}
	}
}
