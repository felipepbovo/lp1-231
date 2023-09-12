package semana22;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BuscarAlunoPorNome {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection connection = DriverManager.getConnection(url);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        String sql = "SELECT * FROM alunos WHERE nome LIKE ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, "%" + nome + "%");

        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            int id = rs.getInt("id");
            String alunoNome = rs.getString("nome");
            String email = rs.getString("email");
            boolean ativo = rs.getBoolean("ativo");
            System.out.println("ID: " + id + ", Nome: " + alunoNome + ", Email: " + email + ", Ativo: " + ativo);
        }

        statement.close();
        connection.close();
        scanner.close();
    }
}
