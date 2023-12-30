package org.example;
import org.example.person;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        persondao dao = new persondao();
        System.out.println("Welcome to MYapp");
        Scanner sc = new Scanner(System.in);
while (true){
while (true){
    System.out.println("1. Add person");
    int ch = sc.nextInt();
    int PARTY_ID;
//    String FIRST_NAME;
//    String MIDDLE_NAME;
    switch (ch){
        case 1:
            person emp = new person();
            System.out.println("Enter PARTY_ID : ");
            PARTY_ID = sc.nextInt();
            System.out.println("Enter  FIRST_NAME ");
            String FIRST_NAME = sc.nextLine();
            System.out.println("Enter MIDDLE_NAME ");
            String MIDDLE_NAME = sc.nextLine();
            System.out.println("Enter LAST_NAME");
            String LAST_NAME = sc.nextLine();
            System.out.println("Enter Gender");
            String GENDER = sc.nextLine();
            System.out.println("Enter Marital status");
            String MARITIAL_STATUS = sc.nextLine();
            System.out.println("Enter enum_id");
            int ENUM_ID =sc.nextInt();
            emp.setPARTY_ID( PARTY_ID);
            emp.setFIRST_NAME(FIRST_NAME);
            emp.setMIDDLE_NAME(MIDDLE_NAME);
            emp.setLAST_NAME(LAST_NAME);
            emp.setGENDER(GENDER);
            emp.setMARITIAL_STATUS(MARITIAL_STATUS);
            emp.setENUM_ID(ENUM_ID);
            dao.createEmployee(emp);
    }
}
}

    }
}