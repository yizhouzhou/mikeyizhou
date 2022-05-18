/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypt_fun;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author zhouyizhou
 */
public class connection {
    
    static public Connection c;

    public static Connection getCon() throws Exception {
        // information
        if (c == null) {
            
            String username = loginform.usernameenter.getText();
            char [] password = loginform.password.getPassword();
            String passwordtrue = new String(password);
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/", username,
                    passwordtrue);
            System.out.println("Successfully connect to database");

        }

        return c;
    }

    public static Statement getstate() throws Exception {
        // information

        Statement myStmt = connection.getCon().createStatement();
        return myStmt;
    }

    
    
}
