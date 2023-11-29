package com.vti.lesson10;

import java.sql.*;

/**
 * @created: 28/11/2023 - 7:45 PM
 * @author: dungna
 */
public class TestMySql {
    public static void main(String[] args) throws SQLException {
        String dbUrl = "jdbc:mysql://127.0.0.1:3306/brse2304";
        String user = "root";
        String password = "";

        Connection myConn = DriverManager.getConnection(dbUrl, user, password);

        if (myConn != null) {
            System.out.println("Kết nối thành công");

            // Sử dụng đối tượng Statement
            Statement myStmt = myConn.createStatement();
            ResultSet result = myStmt.executeQuery("SELECT * FROM account where id = 1");
            while (result.next()) {
                System.out.println(result.getString("username"));
                System.out.println(result.getString("email"));

                System.out.println(result.getString(2));
            }

            String sqlInsert = "INSERT INTO account (email, username, fullname, department_id, position_id, create_date) " +
                    "VALUES ('minhkhang123@gmail.com', 'khangnm', 'Nguyễn minh khang', 2, 3, sysdate())";
            int newRecord = myStmt.executeUpdate(sqlInsert);

            System.out.println("Giá trị của newRecord: " + newRecord);

            // Sử dụng đối tượng PrepareStatement
            String sql = "INSERT INTO account (email, username, fullname, department_id, position_id, create_date) VALUES (?, ?, ?, ?, ?, sysdate())";
            PreparedStatement preparedStatement = myConn.prepareStatement(sql);
            preparedStatement.setString(1, "dungna41@gmail.com");
            preparedStatement.setString(2, "dungna4");
            preparedStatement.setString(3, "Nguyễn Văn Minh");
            preparedStatement.setInt(4, 3);
            preparedStatement.setInt(5, 2);

            int newRecordByPrepare = preparedStatement.executeUpdate();
            System.out.println("newRecordByPrepare: " + newRecordByPrepare);

        } else {
            System.out.println("Kết nối thất bại");
        }


        System.out.println("Kết thúc chương trình.");
        myConn.close();

    }
}
