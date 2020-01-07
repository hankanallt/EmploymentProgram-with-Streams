package newemploymentproggram;

import static java.nio.file.Files.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import static newemploymentproggram.Employee.list;

public class EmploymentMenu {

    static Scanner sc = new Scanner(System.in);
    static boolean loop = true;
    static boolean loopA = true;
    static boolean loopB = true;
    static boolean loopC = true;
    static boolean loopD = true;

    public static void EmploymentMenu(ArrayList<? extends Employee> myList) {
        for (Employee employee : myList) {

        }
    }

    private static void addEmployee() {
        System.out.println("Add First name employee= ");
        String firstName = sc.nextLine();

        System.out.println("Add Last name employee= ");
        String lastname = sc.nextLine();

        System.out.println("Add Date of birth of employee= ");
        String dateofbirth = sc.nextLine();

        System.out.println("Add employee name of division");
        System.out.println("Technician, Developer, Webdesigner, Marketing");
        System.out.println("Ceo, Administrator, Secratary");
        String department = sc.nextLine();

        System.out.println("Gender type: MALE/FEMALE/UNKNOWN:");
        Gender gender
                = Gender.valueOf(sc.next().toUpperCase());

        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Add age of employee");

        int wage = sc.nextInt();
        sc.nextLine();
        System.out.println("Add wage of employee");

        int bonus = sc.nextInt();
        sc.nextLine();
        System.out.println("Add bonus of employee");

        int yearOfJoining = sc.nextInt();
        sc.nextLine();
        System.out.println("Add Start year of employee");

        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Add id of employee");

//        int roll = sc.nextInt();
//        sc.nextLine();
//        switch (roll) {
//            
//            case 1:
//                Administrator a = new Administrator(firstName, lastName,
//                        dateofbirth, department, wage, bonus,
//                        yearOfJoining, id, gender "Administrator");
//                Employee.list.add(a);
//                break;
//        }
        if (department.equalsIgnoreCase("Administrator")) {
            EmployeeList.employees.add(new Employee(firstName, lastname, dateofbirth, department, wage, bonus, yearOfJoining, id, gender));
        } else if (department.equalsIgnoreCase("Marketing")) {
            EmployeeList.employees.add(new Employee(firstName, lastname, dateofbirth, department, wage, bonus, yearOfJoining, id, gender));
        } else if (department.equalsIgnoreCase("Developer")) {
            EmployeeList.employees.add(new Employee(firstName, lastname, dateofbirth, department, wage, bonus, yearOfJoining, id, gender));
        } else if (department.equalsIgnoreCase("WebDesigner")) {
            EmployeeList.employees.add(new Employee(firstName, lastname, dateofbirth, department, wage, bonus, yearOfJoining, id, gender));
        } else if (department.equalsIgnoreCase("Secretary")) {
            EmployeeList.employees.add(new Employee(firstName, lastname, dateofbirth, department, wage, bonus, yearOfJoining, id, gender));
        } else if (department.equalsIgnoreCase("CEO")) {
            EmployeeList.employees.add(new Employee(firstName, lastname, dateofbirth, department, wage, bonus, yearOfJoining, id, gender));
        }

    }

    private static void removeEmployee() {
        System.out.println("Add Id you want to Remove");
        int id = sc.nextInt();
        sc.nextLine();

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).getId() == id) {
                list.remove(i);
                System.out.println("Employee removed");

            }

        }
    }

    private static void updateName() {
        System.out.println("What is the Id you want to update(Name)?");
        int id = sc.nextInt();
        sc.nextLine();
        for (Employee Employee : Employee.list) {
            if (Employee.getId() == id) {
                System.out.println("Whats the first name? ");
                String firstName = sc.nextLine();
                System.out.println("Whats the last name? ");
                String lastName = sc.nextLine();
                Employee.setFirstName(firstName);
                Employee.setFirstName(lastName);

            }
        }
    }

    private static void updateDateOfBirth() {
        System.out.println("What is the Id you want to update (Date Of Birth)?");
        int id = sc.nextInt();
        sc.nextLine();
        for (Employee Employee : Employee.list) {
            if (Employee.getId() == id) {
                System.out.println("Whats the Date of Birth you want to update? ");
                String dateofbirth = sc.nextLine();
                Employee.setDateofbirth(dateofbirth);

            }
        }
    }

    private static void updateDivision() {
        System.out.println("What is the id you want to update (Devision)?");
        String division = sc.nextLine();
        for (Employee Employee : Employee.list) {
            if (Employee.getDepartment() == "") {
                System.out.println("What is the new Division? ");
                System.out.println("Ceo, Administrator, Secratary, Technician, Developer, Webdesigner, Marketing");
                String department = sc.nextLine();
                Employee.setDepartment(division);
            }

        }
    }

    private static void updateWage() {
        System.out.println("What is the id you want to update (Wage)?");
        int id = sc.nextInt();
        for (Employee Employee : Employee.list) {
            if (Employee.getId() == id) {
                System.out.println("What is the new Wage? ");
                int wage = sc.nextInt();
                Employee.setWage(wage);
            }

        }
    }

    private static void updateBonus() {
        System.out.println("What is the id you want to update (Bonus)");
        int id = sc.nextInt();
        for (Employee Employee : Employee.list) {
            if (Employee.getId() == id) {
                System.out.println("What is the new Bonus?");
                int bonus = sc.nextInt();
                Employee.setBonus(bonus);
            }
        }
    }

    private static void searchEmployeeName() {
        System.out.println("What is the name of Employee, who you want information about? ");
        String search = sc.nextLine();
        for (Employee e : list) {
            if (search.equals(e.getFirstName())) {
                System.out.println(e.toString());
            }

        }
    }

    private static void searchEmployeeNumber() {
        System.out.println("What is the id of the Employee, who you want information about? ");
        int idSearch = sc.nextInt();
        for (Employee e : list) {
            if (idSearch == e.getId()) {

            }

        }

    }

    private static void searchEmployeeDepartment() {
        System.out.println("What is the name of Department you want to know about? ");
        String search = sc.nextLine();
        for (Employee e : list) {
            if (search.equals(e.getDepartment())) {
                System.out.println(e.toString());
            }

        }
    }

    private static void averageWage() {
        int sum = 0;
        for (Employee Employee : Employee.list) {
            sum += Employee.getWage();
        }
        System.out.println("Average wage is " + sum / list.size());
        sc.nextLine();
    }

    private static void maximumWage() {
        int maxWage = 0;
        for (Employee Employee : Employee.list) {
            if (maxWage < Employee.getWage()) {
                maxWage = Employee.getWage();
            }

        }
        System.out.println("Maximum wage is " + maxWage);
        sc.nextLine();
    }

    private static void minimumWage() {

        int minWage = 5000;
        for (Employee Employee : Employee.list) {
            if (minWage > Employee.getWage()) {
                minWage = Employee.getWage();
            }

        }
        System.out.println("Minimum wage is " + minWage);
        sc.nextLine();
    }

    private static void totalBonus() {
        int sum = 0;
        for (Employee Employee : Employee.list) {

            System.out.println(Employee.getFirstName() + "" + Employee.getLastName() + "" + Employee.getBonus());
            sum += Employee.getBonus();
        }

    }

    private static void femalePercentage() {
    }

    private static void malePercentage() {
    }

    private static void femalePercentageDivision() {
    }

    private static void malePercentageDivision() {
    }

    private static void displayAllIdAscending() {

        Comparator<Employee> SortbyNameAscending = (o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName());
        System.out.println(SortbyNameAscending);

    }

    private static void displayAllIdDescending() {
        Comparator<Employee> SortbyNameDesecnding = (o1, o2) -> o2.getFirstName().compareTo(o1.getFirstName());
        System.out.println(SortbyNameDesecnding);
    }

    private static void displayAllWageMenu() {
    }

    private static void displayAllDateOfBirthMenu() {
    }

    static void mainMenu() {

        System.out.println("\n+--------------------------------------------+");
        System.out.println("+-----------Employee Management--------------+");
        System.out.println("+--------------------------------------------+");
        System.out.println("1. Employee management (add, update, delete)");
        System.out.println("2. Employee statistics");
        System.out.println("0. Exit");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 0:
                Main.loop = false;
                break;
            case 1:
                loop = true;
                while (loop) {
                    employeeManagement();
                }
                break;
            case 2:
                loop = true;
                while (loop) {
                    employeeStatistics();
                }
                break;
            default:
                System.out.println("No such option");
                break;

        }
    }

    static void employeeManagement() {
        System.out.println("\n1. Register employee");
        System.out.println("2. Remove employee");
        System.out.println("3. Update name of employee");
        System.out.println("4. Update the DateOfBirth of employee");
        System.out.println("5. Update the division of employee");
        System.out.println("6. Update salary of employee");
        System.out.println("7. Update bonus of employee");
        System.out.println("8. Search employee by name");
        System.out.println("9. Search employee by id");
        System.out.println("10. View employees on departments");
        System.out.println("11. Display all employees");
        System.out.println("0. Back to main menu");

        int choice2 = sc.nextInt();
        sc.nextLine();

        switch (choice2) {
            case 0:
                loopA = false;
                break;
            case 1:
                addEmployee();
                break;
            case 2:
                removeEmployee();
                break;
            case 3:
                updateName();
                break;
            case 4:
                updateDateOfBirth();
                break;
            case 5:
                updateDivision();
                break;
            case 6:
                updateWage();
                break;
            case 7:
                updateBonus();
                break;
            case 8:
                searchEmployeeName();
                break;
            case 9:
                searchEmployeeNumber();
                break;
            case 10:
                searchEmployeeDepartment();
                break;
            case 11:
                loop = true;
                while (loop) {
                    displayAllMenu();
                }
                break;
            default:
                System.out.println("No such option");
                break;

        }
    }

    static void employeeStatistics() {
        System.out.println("\n1. Average wage at the company");
        System.out.println("2. Maximum wage in the company");
        System.out.println("3. Minimum wage in the company");
        System.out.println("4. Total bonus");
        System.out.println("5. Female in percentage in the company");
        System.out.println("6. Male percentage in the company");
        System.out.println("7. Female percentage in every department");
        System.out.println("8. Male percentage in every department");
        System.out.println("0. Back to main menu");

        int choice3 = sc.nextInt();
        sc.nextLine();

        switch (choice3) {
            case 0:
                loopB = false;
                break;
            case 1:
                averageWage();
                break;
            case 2:
                maximumWage();
                break;
            case 3:
                minimumWage();
                break;
            case 4:
                totalBonus();
                break;
            case 5:
                femalePercentage();
                break;
            case 6:
                malePercentage();
                break;
            case 7:
                femalePercentageDivision();
                break;
            case 8:
                malePercentageDivision();
                break;

        }
    }

    public static void displayAllMenu() {

        System.out.println("\n1. Display all employees sorted by id");
        System.out.println("2. Display all employees sorted by salary");
        System.out.println("3. Display all employees sorted by birthday");
        System.out.println("0. Back to employee statistics");
        int choice4 = sc.nextInt();
        sc.nextLine();

        switch (choice4) {
            case 0:
                loop = false;
                break;
            case 1:
                loopC = true;
                while (loop) {
                    displayAllIdMenu();
                }
                break;
            case 2:
                loop = true;
                while (loop) {
                    displayAllWageMenu();
                }
                break;
            case 3:
                loop = true;
                while (loop) {
                    displayAllDateOfBirthMenu();
                }
                break;

        }
    }

    public static void displayAllIdMenu() {
        System.out.println("\n1. Display in ascending order");
        System.out.println("2. Display in descending order");
        System.out.println("0. Back to display menu");
        int choice5 = sc.nextInt();
        sc.nextLine();

        switch (choice5) {
            case 0:
                loopD = false;
                break;
            case 1:
                displayAllIdAscending();
                break;
            case 2:
                displayAllIdDescending();
                break;
        }
    }

}
