import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Connection;

public class orderdao {
    Connection con;

    public orderdao() {

    }

    public void createorder(order o) {
        this.con = DBconnection.createDBConnetion();
        String query = "insert into Order_Header values (?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pstm = this.con.prepareStatement(query);
            pstm.setString(1,null);
            pstm.setString(2,o.getOrderName());
            pstm.setString(6,o.getCurrencyUomId());
            pstm.setString(8,o.getSalesChannelEnumId());
            pstm.setString(5,o.getStatusId());
            pstm.setString(7,o.getProductStoreId());
            pstm.setDate(3, (Date) o.getPlacedDate());
            pstm.setDate(4, (Date) o.getApprovedDate());
            pstm.setDouble(9,1000);
            pstm.setDate(10,null);
            int cnt = pstm.executeUpdate();
            if (cnt != 0) {
                System.out.println("person inserted successfully");
            }

        }catch (Exception var5) {
            var5.printStackTrace();
        }
    }
}
