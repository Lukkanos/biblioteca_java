import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco{
  public static void main(String[] args){
      try{
          Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/nomeDoBancoDeDados",
            "postgres", "senhaADefinir");
            if(conexao != null){
                System.out.println("Banco conectado com sucesso!");
            } else{
                System.out.println("Erro ao conectar com o banco de dados!");
            }
      } catch(SQLException e ){
          e.printStackTrace();
      }
    
  }
}
