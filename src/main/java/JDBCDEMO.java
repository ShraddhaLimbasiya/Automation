import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JDBCDEMO {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/sara";
        String name = "root";
        String password = "Imprincess@1996";
        ResultSet resultSet= null;
        Connection con = null;
        String query = "select * from student";
        String insertQuery = "Insert into student values('Shraddha','java')";
        try {
            con = DriverManager.getConnection(url, name, password);
            Statement st = con.createStatement();
            boolean execute = st.execute(query);
            if(execute){
                ResultSet resultSet1 = st.getResultSet();
                resultSet1.next();
                System.out.println(resultSet1.getString(1));
            }


        }
        finally {
            if(resultSet != null)
                resultSet.close();
            if (con !=null)
                con.close();
        }

    }
}
 