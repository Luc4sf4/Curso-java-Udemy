package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarPessoa {
	public static void main(String[] args) throws SQLException {
		Scanner tcd = new Scanner(System.in);
		
		System.out.println("Informe o código da pessoa");
		int codigo = tcd.nextInt();
		
		//comandos sql
		String selectSql = "SELECT codigo, nome FROM pessoas WHERE codigo = ? ";
		String updateSql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		
		//criando conexão
		Connection conexao = FabricaConexao.getConexao();
		
		//PreparedStatment para evitar invesão Injection
		PreparedStatement stmt = conexao.prepareStatement(selectSql);	
		
		//Pegando o parametro que foi passado 
		stmt.setInt(1, codigo);
		
		//Executando a query
		ResultSet r = stmt.executeQuery();
		
		//se r existir
		if(r.next()){
			//percorre pela tabela pegando a coluna 1 de código e a coluna dois de Nome
			Pessoa p = new Pessoa(r.getInt(1), r.getString(2));
			//Mostra o nome da pessoa
			System.out.println("O nome atual é " + p.getNome());
		    tcd.nextLine();
			
			
			System.out.println("Informe o novo nome: ");
			String novoNome = tcd.nextLine();
			
			
			stmt.close();
			
			stmt = conexao.prepareStatement(updateSql);
			//parametro 1 com o nome em tipo String
			stmt.setString(1, novoNome);
			//parametro 2 com o nome em tipo INT
			stmt.setInt(2, codigo);
			stmt.execute();
			
			System.out.println("Pessoa alterada com sucesso");
			
		}else {
			System.out.println("Pessoa não encontrada");
		}
		

		tcd.close();
	}
	
	
	

}
