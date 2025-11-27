    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;

    import static java.lang.Class.forName;

    public class DatabaseConnection {
        private static String URL="jdbc:mysql://localhost:3306/cenima";
        private static String user="root";
        private static String password="";

        public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
          return  DriverManager.getConnection(URL, user, password);

        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
            return null;
        }
        }

    }
