package newemploymentproggram;

public class Main {

    public static boolean loop = true;

    public static void main(String[] args) {

        EmployeeList.dBLoad();

        while (loop) {
            EmploymentMenu.mainMenu();
            EmploymentMenu.employeeManagement();
            EmploymentMenu.employeeStatistics();
            EmploymentMenu.displayAllMenu();
            EmploymentMenu.displayAllIdMenu();
            
            
           
        }

    }

}
