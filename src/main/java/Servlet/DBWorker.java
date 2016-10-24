package Servlet;

import java.sql.*;
import java.util.Properties;

/**
 * Created by iikhsn on 17.10.16.
 */
public class DBWorker {
    private static final String URL = "jdbc:mysql://localhost:3306/WorkTime";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "djkjulf-1";


    //Проверка соответствия данных пользователя
    public static boolean assertUser(String login, String password) {
        Boolean correct = false;
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(
                    "SELECT login, password FROM dataLogin");
            System.out.println("Login and password connection");
            while (rs.next()) {

                if (login.equals(rs.getString("login"))) {
                    System.out.println("Login pass");
                    if (password.equals(rs.getString("password"))) {
                        correct = true;
                        System.out.println("password pass");
                    }
                    connection.close();

                }

            }
        } catch (SQLException selectException) {
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return correct;
    }
}
