package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class persondao {
    Connection con;

    public persondao(){

    }
    public void createEmployee(person emp) {
        this.con = DBconnection.createDBConnetion();
        String query = "insert into employee values(?,?,?,?,?,?,?)";

        try {
            PreparedStatement pstm = this.con.prepareStatement(query);
            pstm.setInt(1, emp.getPARTY_ID());
            pstm.setString(2, emp.getFIRST_NAME());
            pstm.setString(3, emp. getMIDDLE_NAME());
            pstm.setString(4, emp.getLAST_NAME());
            pstm.setString(5,emp.getGENDER());
            pstm.setString(6,emp.getMARITIAL_STATUS());
            pstm.setInt(7,emp.getENUM_ID());
            int cnt = pstm.executeUpdate();
            if (cnt != 0) {
                System.out.println("person inserted succesfully");
            }
        } catch (Exception var5) {
            var5.printStackTrace();
        }

    }

}
