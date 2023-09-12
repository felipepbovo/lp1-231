package semana22;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarAluno {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection connection = DriverManager.getConnection(url);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ID do aluno que deseja atualizar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("Novo nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Novo email do aluno: ");
        String email = scanner.nextLine();

        System.out.print("O aluno está ativo? (true/false): ");
        boolean ativo = scanner.nextBoolean();

        String sql = "UPDATE alunos SET nome = ?, email = ?, ativo = ? WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, nome);
        statement.setString(2, email);
        statement.setBoolean(3, ativo);
        statement.setInt(4, id);

        int rowsAffected = statement.executeUpdate();

        if (rowsAffected > 0) {
            System.out.println("Aluno com ID " + id + " atualizado com sucesso.");
        } else {
            System.out.println("Aluno com ID " + id + " não encontrado.");
        }

        statement.close();
        connection.close();
        scanner.close();
    }
}
