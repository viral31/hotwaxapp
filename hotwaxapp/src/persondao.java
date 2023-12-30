import java.sql.Connection;
import java.sql.PreparedStatement;

public class persondao {
    Connection con;

    public persondao(){

    }
    public void createEmployee(person emp) {
        this.con = DBconnection.createDBConnetion();
        String query1 = "insert into party values(?,?)";
        String query = "insert into person values(?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = this.con.prepareStatement(query1);
            ps.setString(1, emp.getPARTY_ID());
            ps.setString(2,null);
            int x = ps.executeUpdate();
            PreparedStatement pstm = this.con.prepareStatement(query);
            pstm.setString(1, emp.getPARTY_ID());
            pstm.setString(2, "null");
            pstm.setString(3, emp.getFIRST_NAME());
            pstm.setString(4, emp. getMIDDLE_NAME());
            pstm.setString(5, emp.getLAST_NAME());
            pstm.setString(6,emp.getGENDER());
            pstm.setDate(7,null);
            pstm.setString(8, emp.getMARITIAL_STATUS());
            pstm.setInt(9,emp.getENUM_ID());
            pstm.setString(10,null);
            int cnt = pstm.executeUpdate();
            if (cnt != 0) {
                System.out.println("person inserted successfully");
            }
        } catch (Exception var5) {
            var5.printStackTrace();
        }

    }

}
