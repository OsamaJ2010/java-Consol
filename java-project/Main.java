import java.io.IOException;
import java.util.Scanner;
import MainFolder.Employee;
import MainFolder.EmployeeCert;
import MainFolder.SalaryCal;
import MainFolder.PrintMessage;
import MainFolder.Department;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static PrintMessage scPrint = new PrintMessage();
    static Employee employee = new Employee();
    static Department department = new Department();
    static SalaryCal salary = new SalaryCal();
    static String empChois;
    static String[][] empCer = EmployeeCert.getCert();
    

    public static void main(final String[] args) throws InterruptedException, IOException {
        cls();
        mainMenu();
    }
    // Main Menu **********************************************************************
    public static void mainMenu() throws InterruptedException, IOException {
        boolean valide = false;
        // Main  Menu  ********************************************************************       
        scPrint.introduction();
        while (!valide) {
            System.out.print("            >> ");    
            String choice = scanner.nextLine();
            switch (choice) {
            case "1"://Employee
                empInformation();
                valide = true;
                break;
            case "2"://Department
                departInfo();
                valide = true;
                break;
            case "3"://Salary Calculation
                salaryInfo();
                valide = true;
                break;
            case "4":// Clear the Screen
                cls();
                mainMenu();
                valide = true;
                break;
            case "5":// Clear the Screen
                System.exit(0);
                valide = true;
                break;
            default:
                System.out.println(" ** Please Enter Choice From The List **");
                break;
            }
        }
    }

    // Main Employee *******************************************************************
    public static void empInformation() throws InterruptedException, IOException {
        scPrint.employee();
        empChois = employee.empInfo();
        empl(empChois);
        empInformation();
    }

    // Employee Choice *******************************************************************
    public static void empl(final String empChois) throws InterruptedException, IOException {
        // Printing ALL Employee Information
        if (empChois.equals("1")) {
            for (int i = 0; i < Employee.employee.length; i++) {

                System.out.print("            Employee Name : " + Employee.employee[i]);
                System.out.println(" / Address " + Employee.empAddress[i] + " / Tel : " + Employee.empTel[i] );
                System.out.print("            Certifications :");
                for (int j = 0; j < empCer[i].length; j++) {
                    System.out.print(" " + empCer[i][j] + " ");
                }
                System.out.println("\n");
            }
            // Shearch for Employee by Name
        } else if (empChois.equals("2")) {
            Employee employee = new Employee();
            String ret = employee.empSearch();
            if (ret.equals("null")) {
                scPrint.empError();
                empInformation();
            } else {
                final int i = Integer.parseInt(ret);
                System.out.print("            Employee Name : " + Employee.employee[i]);
                System.out.println(" / Address " + Employee.empAddress[i] + " / Tel : " + Employee.empTel[i] );
                System.out.print("            Certifications :");
                for (int j = 0; j < empCer[i].length; j++) {
                    System.out.print(" " + empCer[i][j] + " ");
                }
                System.out.println("\n");
            }
        } else if (empChois.equals("3")) {
            mainMenu();
        }
    }

    // Departmaents Information **************************************************************
    public static void departInfo() throws InterruptedException, IOException {
        scPrint.departInfo();
        String ret = department.depInfo();
        if (ret.equals("3")) {
            mainMenu();
        }
        departInfo();
    }
   // Salary Calculation ********************************************************************
    public static void salaryInfo() throws InterruptedException, IOException {
        String choiseS = salary.salaryMinue();
        if(choiseS.equals("1")){
            salary.salCalc();
            
        }else if(choiseS.equals("2")){
            salary.salEmp();
           
        }if(choiseS.equals("3")){ 
            mainMenu();
        }
        salaryInfo();
    }
     // Clear The Screen********************************************************************

    public static void cls() throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();// clear the screen
    }
    
}