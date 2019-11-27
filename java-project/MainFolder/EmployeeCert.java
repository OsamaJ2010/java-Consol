package MainFolder;

public class EmployeeCert extends Employee {
   
    static String[][] certification = { { "JAVA", "HR SP" }, { "BHD", "CPC", ".NET" }, { "POWER", "ELECTRIC" },
            { "FORCK" }, { "WELDING", "PLUMPING", "Full G" } };

    public static String[][] getCert() {
        return certification;
    }
}