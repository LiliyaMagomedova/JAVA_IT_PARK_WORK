import java.sql.*;
import java.util.Scanner;

public class Main {
    static String name;
  //  private static final String COUNT_AUTOES =
 //           "SELECT COUNT(*) FROM auto a WHERE a.owner_id =(SELECT (id) FROM it_park_user u WHERE u.name ='" + name + "')";


    public static void main(String[] args) {
        try {

            Connection connection = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/MAGOMEDOVA_BD",
                            "postgres",
                            "Zaq12wsx");

            Statement selectStatement
                    = connection.createStatement();
            Scanner scanner = new Scanner(System.in);
            name = scanner.nextLine();
            ResultSet resultSet =
                    selectStatement.executeQuery("SELECT COUNT(*) FROM auto a WHERE a.owner_id =(SELECT (id) FROM it_park_user u WHERE u.name ='" + name + "')");
            resultSet.next();
            System.out.println(resultSet.getInt("count"));

           /* while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " " +
                        resultSet.getString("name") + " " +
                        resultSet.getInt("age"));
            }*/
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }
}
