package com.vti.lesson11;

import java.sql.*;
import java.util.ArrayList;

/**
 * @created: 30/11/2023 - 9:13 PM
 * @author: dungna
 */
public class MainAccount {
    public static void main(String[] args) throws SQLException {

        String dbUrl = "jdbc:mysql://127.0.0.1:3306/brse2304";
        String user = "root";
        String password = "";

        Connection myConn = DriverManager.getConnection(dbUrl, user, password);

        if (myConn != null) {
            Statement myStmt = myConn.createStatement();
            ResultSet result = myStmt.executeQuery("SELECT * FROM account");

            ArrayList<Account> listAccount = new ArrayList<>();
            while (result.next()) {
                Account accObject = new Account();

                accObject.setId(result.getInt("id"));
                accObject.setEmail(result.getString("email"));
                accObject.setUserName(result.getString("username"));
                accObject.setFullName(result.getString("fullname"));
                accObject.setDepartmentId(result.getInt("department_id"));
                accObject.setPositionId(result.getInt("position_id"));

                listAccount.add(accObject);
            }
            result.close();
            myStmt.close();

            System.out.println("In ra danh sách account trong database.");
            System.out.println("Tổng số account là: " + listAccount.size());
            for (Account item : listAccount) {
                System.out.println(item.getId() + ": " + item.getEmail() + " - "
                + item.getUserName() + " - " + item.getFullName() + " - " + item.getDepartmentId() + " - " + item.getPositionId());
            }

        } else {
            System.out.println("Kết nối thất bại.");
        }

        myConn.close();
        System.out.println("Kết thúc chương trình.");

    }
}
