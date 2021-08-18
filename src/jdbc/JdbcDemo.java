package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
    public static void main(String[] args) throws SQLException {
        //Creating the connection
        String url = "jdbc:mysql://localhost:3306/test";
        Connection connection = null;

        int rollno =12;
        String name = "Kailash";
        int age = 24;
        String sql = "insert into student(rollno, name, age)" + "values(" + rollno + ",'" +name+ "'," +age+ ")";

        try {
            connection = DriverManager.getConnection(url,"root", "root");
            Statement statement = connection.createStatement();
            int m  = statement.executeUpdate(sql);

            if(m==1){
                System.out.println("inserted successfully : "+sql);
            } else {
                System.out.println("insertion failed");
            }
        }catch (Exception ex){
            System.err.println(ex);
        } finally {
            connection.close();
        }
    }
}
