import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        persondao dao = new persondao();
        orderdao odao = new orderdao();
        System.out.println("Welcome to MYapp");
        Scanner sc = new Scanner(System.in);
        while (true){
            while (true){
                System.out.println("1. Add person");
                System.out.println(("2.add order"));
                int ch = sc.nextInt();
                String PARTY_ID;
//    String FIRST_NAME;
//    String MIDDLE_NAME;
                switch (ch) {
                    case 1:
                        person emp = new person();
                        System.out.println("Enter PARTY_ID : ");
                        PARTY_ID = sc.next();
                        System.out.println("Enter  FIRST_NAME ");
                        String FIRST_NAME = sc.next();
                        System.out.println("Enter MIDDLE_NAME ");
                        String MIDDLE_NAME = sc.next();
                        System.out.println("Enter LAST_NAME");
                        String LAST_NAME = sc.next();
                        System.out.println("Enter Gender");
                        String GENDER = sc.next();
                        System.out.println("Enter Marital status");
                        String MARITIAL_STATUS = sc.next();
                        System.out.println("Enter enum_id");
                        int ENUM_ID = sc.nextInt();
                        emp.setPARTY_ID(PARTY_ID);
                        emp.setFIRST_NAME(FIRST_NAME);
                        emp.setMIDDLE_NAME(MIDDLE_NAME);
                        emp.setLAST_NAME(LAST_NAME);
                        emp.setGENDER(GENDER);
                        emp.setMARITIAL_STATUS(MARITIAL_STATUS);
                        emp.setENUM_ID(ENUM_ID);
                        dao.createEmployee(emp);
                    case 2:
                        order o = new order();
                        System.out.println("Enter ordername");
                        String orderName = sc.next();
                        System.out.println("Enter CurrencyUomID");
                        String currencyUomId = sc.next();
                        System.out.println(" Enter SalesChannelEnumid");
                        String salesChannelEnumId = sc.next();
                        System.out.println("Enter statusID");
                        String statusId = sc.next();
                        System.out.println("productstoreId");
                        String productStoreId = sc.next();
                        System.out.println("Enter placedate");
                        String placedDate = sc.next();
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        Date date = null;
                        try {
                            date = dateFormat.parse(placedDate);
                        } catch (Exception e) {
                            System.out.println("error");
                        }
                        System.out.println("Enter approvedDate");
                        String approvedDate = sc.next();

                        Date date1 = null;
                        try {
                            date1 = dateFormat.parse(placedDate);
                        } catch (Exception e) {
                            System.out.println("error");
                        }
                        o.setOrderName(orderName);
                        o.setPlacedDate(date);
                        o.setApprovedDate(date1);
                        o.setCurrencyUomId(currencyUomId);
                        o.setProductStoreId(productStoreId);
                        o.setSalesChannelEnumId(salesChannelEnumId);
                        o.setStatusId(statusId);
                        odao.createorder(o);
                }
            }
        }

    }
}