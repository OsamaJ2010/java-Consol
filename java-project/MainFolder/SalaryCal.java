package MainFolder;

import java.util.ArrayList;
import java.util.Scanner;

public class SalaryCal{
    PrintMessage print = new PrintMessage();
    ArrayList<Float> empSalCalcs = new ArrayList<Float>();
    int[] empHours = new int[Employee.employee.length] ;
    double[] empOver = new double[Employee.employee.length] ;
    int[] empDeduct = new int[Employee.employee.length] ; 
    int[] empRate = new int[Employee.employee.length] ; 
    int hourRate;
    String choiceSal;
    String[][] empCert;
    double[] certBonus = new double[Employee.employee.length] ;

   Scanner scanner = new Scanner(System.in);
   // Salary Minmue**************************************************************
   public String salaryMinue(){
        String choiceSal = "";
        print.SalaryList();
        System.out.print("            >> ");
        choiceSal = scanner.nextLine();
        return choiceSal;
   }
   //Calculate Salary For One Employee ******************************************
   public void salEmp(){
        empCert = EmployeeCert.getCert();
        for(int i = 0 ; i < Employee.employee.length; i++){  
            System.out.println("            " + (i+1) + " ) " + Employee.employee[i] ); 
        }    
        System.out.print("            Enter The Employee Number: " );
        int empNumber =  scanner.nextInt() - 1;
        if( Employee.empDepart[empNumber].equals("A")){
            hourRate = 40;
            } else if ( Employee.empDepart[empNumber].equals("S")){
                hourRate = 30;
                }else if ( Employee.empDepart[empNumber].equals("W")){
                    hourRate = 20;
                }
        Float certBonusExp = (float) (empCert[empNumber].length * 0.5);
        System.out.print("            Enter the Total number of Hours For " + Employee.employee[empNumber] + " : ");
        int hour = scanner.nextInt();
        Float empHour = (float) (hour * hourRate);
        System.out.print("            Enter the Total number of Overt Time Hours For " + Employee.employee[empNumber] + " : ");
        int over = scanner.nextInt();
        Float empOvertime = (float) (over * hourRate * 1.5);
        System.out.print("            Enter The Deducted Amount If Applicable For " + Employee.employee[empNumber] + " : ");
        int ded = scanner.nextInt();
        Float empDeducts = (float) ded;
        Float salary = (float) ((empHour + empOvertime + certBonusExp) - empDeducts);
        PrintMessage.SalaryOneReport(empNumber,empHour,empOvertime,certBonusExp,empDeducts, salary);       
    }
   
    //Main salary calculation function************************************************* 
    public ArrayList<Float> salCalc(){
        PrintMessage.Salary();
        empCert = EmployeeCert.getCert();
        for(int i = 0 ; i < Employee.employee.length; i++){   
            if( Employee.empDepart[i].equals("A")){
                hourRate = 40;
                } else if ( Employee.empDepart[i].equals("S")){
                    hourRate = 30;
                    }else if ( Employee.empDepart[i].equals("W")){
                        hourRate = 20;
                    }
            certBonus[i] = empCert[i].length * 0.5;
            System.out.print("            Enter the Total number of Hours For " + Employee.employee[i] + " : ");
            int hour = scanner.nextInt();
            empHours[i] = hour * hourRate ;
            System.out.print("            Enter the Total number of Overt Time Hours For " + Employee.employee[i] + " : ");
            int over = scanner.nextInt();
            empOver[i] = over * hourRate * 1.5;
            System.out.print("            Enter The Deducted Amount If Applicable For " + Employee.employee[i] + " : ");
            int ded = scanner.nextInt();
            empDeduct[i] = ded;  
            Float salary = (float) ((empHours[i]+ empOver[i] + certBonus[i]) - empDeduct[i]);
            empSalCalcs.add(salary);                       

        }
        PrintMessage.SalaryReport(empHours,empOver,certBonus,empDeduct, empSalCalcs);
        return empSalCalcs;
    }

}
