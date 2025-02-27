import java.awt.image.RescaleOp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TransactionDemo {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/mydb";
        String name = "root";
        String password = "Imprincess@1996";
        Connection con = DriverManager.getConnection(url,name,password);
        Statement st = con.createStatement();
        System.out.println("Data before transaction");
        System.out.println("---------------------------");
        ResultSet rs = st.executeQuery("select * from accounts");
        while (rs.next()){
            System.out.println(rs.getString(1)+"..."+rs.getString(2));
        }
        System.out.println("Transaction begins");
        con.setAutoCommit(false);
        st.executeUpdate("update accounts set balance=balance-2000 where user='Anushka'");
        st.executeUpdate("update accounts set balance=balance+2000 where user='Milan'");
        System.out.println("Can you please confirm this transaction of 2000...[Yes|No]");
        Scanner sc = new Scanner(System.in);
        String option = sc.next();
        if(option.equalsIgnoreCase("yes")){
            con.commit();
            System.out.println("Transaction commited");
        }
        else {
            con.rollback();
            System.out.println("Transaction Rolled Back");
        }
        System.out.println("Data after transaction");
        System.out.println("---------------------------");
        ResultSet rs1 = st.executeQuery("select * from accounts");
        while (rs1.next())
        {
            System.out.println(rs1.getString(1)+"----"+rs1.getString(2));
        }
        con.close();

    }
}
