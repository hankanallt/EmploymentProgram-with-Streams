package newemploymentproggram;

import java.util.ArrayList;


public  class Employee {

    public static ArrayList<Employee> list = new ArrayList<>();

    private String firstName;
    private String lastName;
    private String dateofbirth;
    private String department;
    private int wage;
    private int bonus;
    private int yearOfJoining;

    public Employee(String firstName, String lastName, String dateofbirth, String department, int wage, int bonus, int yearOfJoining, int id, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateofbirth = dateofbirth;
        this.department = department;
        this.wage = wage;
        this.bonus = bonus;
        this.yearOfJoining = yearOfJoining;
        this.id = id;
        this.gender = gender;
    }

    public static ArrayList<Employee> getList() {
        return list;
    }

    public static void setList(ArrayList<Employee> list) {
        Employee.list = list;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Employee.counter = counter;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    private int id;
    static int counter = 1;
    private Gender gender;

    @Override
    public String toString() {
        return "Employee{" + "firstName=" + firstName + ", lastName=" + lastName + ", dateofbirth=" + dateofbirth + ", department=" + department + ", wage=" + wage + ", bonus=" + bonus + ", yearOfJoining=" + yearOfJoining + ", id=" + id + ", gender=" + gender + '}';
    }

    /*---------------------------------------------------------------*/
    public class CEO extends Employee {

        public CEO(String firstName, String lastName, String dateofbirth, String department, int wage, int bonus, int yearOfJoining, int id, Gender gender) {
            super(firstName, lastName, dateofbirth, department, wage, bonus, yearOfJoining, id, gender);
        }
    }

    /*---------------------------------------------------------------*/
    public class WebDesigner extends Employee {

        public WebDesigner(String firstName, String lastName, String dateofbirth, String department, int wage, int bonus, int yearOfJoining, int id, Gender gender) {
            super(firstName, lastName, dateofbirth, department, wage, bonus, yearOfJoining, id, gender);
        }

    }

    /*---------------------------------------------------------------*/
    public class Technician extends Employee {

        public Technician(String firstName, String lastName, String dateofbirth, String department, int wage, int bonus, int yearOfJoining, int id, Gender gender) {
            super(firstName, lastName, dateofbirth, department, wage, bonus, yearOfJoining, id, gender);
        }

    }

    /*---------------------------------------------------------------*/
    public class Secretary extends Employee {

        public Secretary(String firstName, String lastName, String dateofbirth, String department, int wage, int bonus, int yearOfJoining, int id, Gender gender) {
            super(firstName, lastName, dateofbirth, department, wage, bonus, yearOfJoining, id, gender);
        }

    }

    /*---------------------------------------------------------------*/
    public class Marketing extends Employee {

        public Marketing(String firstName, String lastName, String dateofbirth, String department, int wage, int bonus, int yearOfJoining, int id, Gender gender) {
            super(firstName, lastName, dateofbirth, department, wage, bonus, yearOfJoining, id, gender);
        }

    }

    /*---------------------------------------------------------------*/
    public class Developer extends Employee {

        public Developer(String firstName, String lastName, String dateofbirth, String department, int wage, int bonus, int yearOfJoining, int id, Gender gender) {
            super(firstName, lastName, dateofbirth, department, wage, bonus, yearOfJoining, id, gender);
        }

    }

    /*---------------------------------------------------------------*/
    
    
    public class Administrator extends Employee {
        

        public Administrator(String firstName, String lastName, String dateofbirth, String department, int wage, int bonus, int yearOfJoining, int id, Gender gender) {
            super(firstName, lastName, dateofbirth, department, wage, bonus, yearOfJoining, id, gender);
            

        }

    }
}
