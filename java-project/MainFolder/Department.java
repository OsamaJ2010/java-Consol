package MainFolder;

import java.util.Scanner;
import MainFolder.PrintMessage;

public class Department {
    static PrintMessage scPrint = new PrintMessage();
    static String[][] departments = {{"A","Admistration"},{"S","Service"},{"W","Line Worker"}};    
    static Scanner scanner = new Scanner(System.in); 

    public String[][] getDep(){
        return departments;
    }
    
    public String depInfo(){
        boolean valide = false;        
        String choice ="";
        while(!valide) {
            System.out.print("            >> "); 
            choice = scanner.nextLine();            
            switch(choice) {
            case "1":// all departments info
                depPrint();
                valide = true;
                break;
            case "2": // search employee by departments 
                depEmployee();
                valide = true;
                break;                
            case "3": // Back to Main Menue
                valide = true;
                break;
            default:
                System.out.println("            ** Please Enter Choice From The List **");
                break;
            }            
        }        
        return choice;       
    }
    // All Departments
    public static void depPrint(){
        for(int i = 0 ; i< departments.length ; i++){
            System.out.print("            ");
            for (int j = 0 ; j < departments[i].length ; j++){
                System.out.print(departments[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    // Emplyee By Departments
    public static void depEmployee(){
        String departmentName = "";
        boolean depChoice = false;
        scPrint.depEmployee();
        String choice  ="";  
        depPrint(); 

        while(!depChoice) {
            System.out.print("            >> "); 
            choice = scanner.nextLine();            
            switch(choice) {
                case "A":// Administarion
                case "a":
                    depChoice = true;
                    break;
                case "S": // Service
                case "s":    
                    depChoice = true;
                    break;
                case "W": // Line Worker
                case "w":
                depChoice = true;
                break;
                default:
                    System.out.println("            ** Please Enter Choice From The List **");
                    break;
            }
        }
        choice = choice.toUpperCase();
        for(int j = 0; j < departments.length;j++){
            if (departments[j][0].equals(choice)){
                departmentName = departments[j][1];
                break;
            }
        }

        System.out.println("            All Employees In : " + departmentName);
        for (int i = 0; i < Employee.empDepart.length;i++){
            if(Employee.empDepart[i].equals(choice)){
                System.out.println("            " + Employee.employee[i]);
            }
        }  
    }

}