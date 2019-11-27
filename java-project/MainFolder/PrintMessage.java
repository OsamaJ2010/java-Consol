package MainFolder;
import java.util.ArrayList;

public class PrintMessage {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";    
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public void introduction(){
        System.out.println(ANSI_YELLOW);
        System.out.println("            **************************************************************************");
        System.out.println("                     WELCOME TO Main Menu For Information  ");
        System.out.println("                             Please Chose From List  ");
        System.out.println("            **************************************************************************");
        System.out.println("            1 - Employee Information");
        System.out.println("            2 - Departments ");
        System.out.println("            3 - Salary Calculations");
        System.out.println("            4 - Clear Screen");
        System.out.println("            5 - EXIT ");
        
    }
    public void employee(){
        System.out.println(ANSI_GREEN);
        System.out.println("            **************************************************************************");
        System.out.println("                     WELCOME TO Main Menu For Employee Information  ");
        System.out.println("                             Please Chose From List  ");
        System.out.println("            **************************************************************************");
        System.out.println("            1 - All Employees Information");
        System.out.println("            2 - Search Employee by Name ");
        System.out.println("            3 - Main Menu ");
        
    }
    public void empError(){
        System.out.println(ANSI_RED + "            **************************************************************************");
        System.out.println("                        No Employee with this Name!!!!");
        System.out.println("            **************************************************************************" + ANSI_RESET);
    }
    public void empAll(){
        
    }

    public void departInfo(){
        System.out.println(ANSI_BLUE);
        System.out.println("            **************************************************************************");
        System.out.println("                     WELCOME TO Main Menu For Department Information  ");
        System.out.println("                             Please Chose From List  ");
        System.out.println("            **************************************************************************");
        System.out.println("            1 - All Department");
        System.out.println("            2 - Search Employee by Department ");
        System.out.println("            3 - Main Menu ");

    }
    public void depEmployee(){
        System.out.println(ANSI_BLUE);
        System.out.println("            **************************************************************************");
        System.out.println("                    Menu For Department Serch  ");
        System.out.println("                    Please Chose From List  ");
        System.out.println("            **************************************************************************");
       
    }
    public void SalaryList(){
        System.out.println(ANSI_CYAN);
        System.out.println("            **************************************************************************");
        System.out.println("                     WELCOME TO Main Menu For Salary  ");
        System.out.println("                     Please Chose From the Follwing  ");
        System.out.println("            **************************************************************************");
        System.out.println("            1 - For All Employee");
        System.out.println("            2 - Salary For One Employee  ");
        System.out.println("            3 - Main Menu ");

    }
    public static void Salary(){
        System.out.println(ANSI_CYAN);
        System.out.println("            **************************************************************************");
        System.out.println("                     Main Salary Calculation ");
        System.out.println("                     Please Enter the Follwing  ");
        System.out.println("            **************************************************************************");
        
    }

    public static void SalaryReport(int[] empHours, double[] empOver, double[] empBouns, 
                                    int[] empDeduct, ArrayList<Float> empSalCalcs)
    {
        System.out.println(ANSI_CYAN);
        System.out.println("            __________________________________________________________________________________________");
        System.out.format("%10s %-15s %-15s %-10s %-8s %-12s %-10S$%n","            ","Name","TOTAL HOURES","OVERTIME","BOUNS",
                            "DEDUCTION","NET SALARY ");
        System.out.println("            __________________________________________________________________________________________");
        for (int j = 0 ; j < empSalCalcs.size();j++)
        {
            System.out.format("%10s %-20s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f$ %n","            ", 
                Employee.employee[j],(float)(empHours[j]),empOver[j] ,empBouns[j],(float)empDeduct[j],empSalCalcs.get(j));
        }
        System.out.println("            __________________________________________________________________________________________");
    }
    public static void SalaryOneReport(int empNumber, Float empHour, Float empOvertime, Float certBonusExp, 
                                    Float empDeducts, Float salary)
    {
        System.out.println(ANSI_CYAN);
        System.out.println("            __________________________________________________________________________________________");
        System.out.format("%10s %-15s %-15s %-10s %-8s %-12s %-10S$%n","            ","Name","TOTAL HOURES","OVERTIME","BOUNS",
                            "DEDUCTION","NET SALARY ");
        System.out.println("            __________________________________________________________________________________________");
        
            System.out.format("%10s %-20s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f$ %n","            ", 
                Employee.employee[empNumber],(float)(empHour),empOvertime ,certBonusExp,(float)empDeducts,salary);
        
        System.out.println("            __________________________________________________________________________________________");
    }


}