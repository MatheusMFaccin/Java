
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Mysql {

    private static String host = "localhost";
    private static String user = "root";
    private static String password = "laboratorio";
    private static String database = "empresa";

    public String getHost() {
        return host;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getDatabase() {
        return database;
    }

    public Mysql() {
    } //Possibilita instancias
    public static Connection con = null;

    public static void Conectar() {
        System.out.println("Conectando ao banco...");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://"+Mysql.host+"/"
                    +Mysql.database, Mysql.user, Mysql.password);
            System.out.println("Conectado.");
        } catch (ClassNotFoundException ex) {
            System.out.println("Classe não encontrada, adicione o driver nas bibliotecas.");
            Logger.getLogger(Mysql.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }

    }
    public String insertTable(String nome,String senha,String email){
        String query = "INSET INTO funcionarios col(nome,email,senha) values(null,?,?)";
        
        return query;
    }
}    
