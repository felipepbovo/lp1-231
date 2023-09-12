package semana22;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletarAluno {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection connection = DriverManager.getConnection(url);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ID do aluno que deseja excluir: ");
        int id = scanner.nextInt();

        String sql = "DELETE FROM alunos WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);

        int rowsAffected = statement.executeUpdate();

        if (rowsAffected > 0) {
            System.out.println("Aluno com ID " + id + " excluído com sucesso.");
        } else {
            System.out.println("Aluno com ID " + id + " não encontrado.");
        }

        statement.close();
        connection.close();
        scanner.close();
    }
}
