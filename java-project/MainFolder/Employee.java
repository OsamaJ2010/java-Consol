package MainFolder;

import java.util.Scanner;
import java.util.ArrayList;



public class Employee {

    public static String[] employee = {"Michael Bolton ","Osama","Sam Lee","MC Hamer","Vanile Ice"};  
    public static String[] empDepart = {"A","A","S","W","W"};
    public static String[] empAddress = {"575 Sunder st","585 Welington rd","333 King st"," 666 Saiten Hell"," 520 first st"};
    public static String[] empTel = {"222-323-4456","234-432-4231","123-321-4321","564=567=8765","555-445-3424"};
    public static ArrayList<Integer> houres = new ArrayList<Integer>();
    public static ArrayList<Integer> overtime = new ArrayList<Integer>();
    public static ArrayList<Integer> deduct = new ArrayList<Integer>();
    private static Scanner scanner = new Scanner(System.in);

    public String empInfo(){
        boolean valide = false;       
        String choice ="";

        while(!valide) {
            System.out.print("            >> "); 
            choice = scanner.nextLine();
            
            switch(choice) {
            case "1":// all employee
                valide = true;
                break;
            case "2": // search employee name               
                valide = true;
                break;
            case "3"://Back
                valide = true;
                break;
            default:
                System.out.println(" ** Please Enter Choice From The List **");
                break;
            }            
        }        
        return choice;       
    }
    // Employee search by name**********************************8
    public String empSearch(){
        String empName = "";
        String ret = "";
            System.out.print("            Plaes enter the name of employee : ");             
            empName = scanner.nextLine();
            for (int i = 0 ; i < employee.length; i++){
                if(empName.equals(employee[i])){
                    ret = Integer.toString(i);
                    break;
                }
                else
                {
                   ret = "null";
                }
             }
        return ret;        
    }
    
}
    
    
