package semana22;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BuscarAlunoPorID {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection connection = DriverManager.getConnection(url);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ID do aluno: ");
        int id = scanner.nextInt();

        String sql = "SELECT * FROM alunos WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);

        ResultSet rs = statement.executeQuery();

        if (rs.next()) {
            String nome = rs.getString("nome");
            String email = rs.getString("email");
            boolean ativo = rs.getBoolean("ativo");
            System.out.println("ID: " + id + ", Nome: " + nome + ", Email: " + email + ", Ativo: " + ativo);
        } else {
            System.out.println("Aluno com ID " + id + " não encontrado.");
        }

        statement.close();
        connection.close();
        scanner.close();
    }
}
