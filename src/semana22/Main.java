package semana22;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;


//jdbc - Java Database Connection
// - conjunto de interface e classe para acesso a SGDBs
// java App --> JDBC --> Driver ( biblioteca que implementa JDBC) --> SGBD
// App Desktop -->  JDBC --> Driver MySQL --> MySQL

public class Main{

public static void main(String[] args) throws SQLException {
    // 1. abrir a conexão

    String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSl=true";
    Connection connection = DriverManager.getConnection(url);

    // 2. Executar a consulta e usar os resultados
    String sql = "CREATE TABLE alunos(id INT PRIMARY KEY, nome VARCHAR(100), email VARCHAR(255), ativo BOOL);";
    Statement statement = connection.createStatement();
    statement.execute(sql);

    // 3. Fechar conexão
    statement.close();
    connection.close();
    
    }  
}