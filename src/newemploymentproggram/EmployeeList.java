package newemploymentproggram;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeList {

    static Scanner sc = new Scanner(System.in);
    public static ArrayList<Employee> employees = new ArrayList<>();

    public static void dBLoad() {

        EmployeeList.employees.add(new Employee("Harkan", "Singh", "800627", "CEO", 100000, 9999, 2000, 111, Gender.MALE));
        EmployeeList.employees.add(new Employee("Amarjot", "Maan", "860217", "Secretary", 35000, 2999, 2000, 222, Gender.FEMALE));
        EmployeeList.employees.add(new Employee("Dipika", "Padu", "891201", "Administrator", 25000, 2000, 2000, 333, Gender.FEMALE));
        EmployeeList.employees.add(new Employee("Mia", "Khalifa", "840115", "Marketing", 33000, 3999, 2015, 444, Gender.FEMALE));
        EmployeeList.employees.add(new Employee("Sasha", "Grey", "830225", "Technician", 40000, 2999, 2011, 555, Gender.FEMALE));
        EmployeeList.employees.add(new Employee("Sunny", "Leone", "790125", "WebDesigner", 40000, 1999, 2013, 666, Gender.FEMALE));
        EmployeeList.employees.add(new Employee("Ranbir", "Kapoor", "990121", "WebDesigner", 40000, 1000, 2014, 777, Gender.MALE));
        EmployeeList.employees.add(new Employee("Ballo", "Kapoor", "920421", "WebDesigner", 40000, 1000, 2014, 797, Gender.MALE));
        EmployeeList.employees.add(new Employee("Rishi", "Kapoor", "630121", "Technician", 40000, 1000, 2014, 888, Gender.MALE));
        EmployeeList.employees.add(new Employee("Govinda", "Ahuja", "690121", "Developer", 40000, 1000, 2014, 999, Gender.MALE));
        EmployeeList.employees.add(new Employee("Meena", "Kumari", "550122", "Developer", 36000, 1000, 1988, 919, Gender.FEMALE));
        EmployeeList.employees.add(new Employee("Salman", "Khan", "660121", "Developer", 40000, 1000, 2014, 1010, Gender.MALE));
        EmployeeList.employees.add(new Employee("Sharukh", "Khan", "690121", "Developer", 59000, 1000, 2019, 2322, Gender.MALE));

        Map<String, String> employeesMap = new HashMap<>();
        Comparator e = (Comparator<String>) (String s, String s1) -> s1.compareTo(s);


        /* distinct() returns a stream consisting of distinct elements in a stream.
        distinct() is the method of Stream interface. 
        This method uses hashCode() and equals() methods to get distinct elements.
        In case of ordered streams, the selection of distinct elements is stable*/ //Print name of all Deparments
        employees.stream()
                .map(Employee::getDepartment) //Name all the Employees after 2015
                .distinct()
                .forEach(System.out::println);

        System.out.println("********************************");

        employees.stream()
                .map(Employee::getYearOfJoining)
                .distinct()
                .forEach(System.out::println);

        System.out.println("********************************");

        //Highest paid Employee
        Optional<Employee> highestPaidEmployeeWrapper
                = employees.stream()
                        .collect(Collectors.maxBy(Comparator.comparing(Employee::getWage)));


        Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();

        System.out.println("Details Of Highest Paid Employee : ");

        System.out.println("==================================");

        System.out.println("ID : " + highestPaidEmployee.getId());

        System.out.println("Name : " + highestPaidEmployee.getFirstName());

        System.out.println("Age : " + highestPaidEmployee.getDateofbirth());

        System.out.println("Gender : " + highestPaidEmployee.getGender());

        System.out.println("Department : " + highestPaidEmployee.getDepartment());

        System.out.println("Year Of Joining : " + highestPaidEmployee.getYearOfJoining());

        System.out.println("Salary : " + highestPaidEmployee.getWage());

        System.out.println("********************************");

        //Lowest paid Employee
        Optional<Employee> lowestPaidEmployeeWrapper
                = employees.stream()
                        .collect(Collectors.minBy(Comparator.comparing(Employee::getWage)));

        Employee lowestPaidEmployee = lowestPaidEmployeeWrapper.get();

        System.out.println("Details Of Lowest Paid Employee : ");

        System.out.println("==================================");

        System.out.println("ID : " + lowestPaidEmployee.getId());

        System.out.println("Name : " + lowestPaidEmployee.getFirstName());

        System.out.println("Age : " + lowestPaidEmployee.getDateofbirth());

        System.out.println("Gender : " + lowestPaidEmployee.getGender());

        System.out.println("Department : " + lowestPaidEmployee.getDepartment());

        System.out.println("Year Of Joining : " + lowestPaidEmployee.getYearOfJoining());

        System.out.println("Salary : " + lowestPaidEmployee.getWage());

        System.out.println("********************************");

        // Sort employees/Firstname
        employees.stream()
                .map(Employee::getFirstName)
                .distinct()
                .forEach(System.out::println);

        System.out.println("********************************");

//        //Sort employees/Lastname
        employees.stream()
                .map(Employee::getLastName)
                .distinct()
                .forEach(System.out::println);

        System.out.println("********************************");

        //Employee who started after 2000
        employees.stream()
                .filter(s -> s.getYearOfJoining() > 2000)
                .map(Employee::getFirstName)
                .forEach(System.out::println);

        System.out.println("********************************");

        
        
        
        
        
        
        
        //Youngest male Employee
//        Optional<Employee> youngestEmployee
//                = employees.stream()
////                .filter(e -> e.getGender()=="Male" &amp;&amp; e.getDepartment()=="youngestEmployee")
//                .min(Comparator.comparingInt(Employee::getDateOfBirth);
//        //sort them by gender
//        Map<String, Long> noOfMaleAndFemale
//                = employees.stream()
//.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
//        System.out.println(noOfMaleAndFemale);
//        //sort them/ wageAccen
//        employees.stream()
//                .sorted((o1, o2) -> (int) (o2.getWage() - (o1.getWage())));
//
//// 
//       
//                
//        Count the employees in each department.
//        map<Entry<String, Long>> employeeCountByDepartment
//                = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
//
//        Set<Entry<String, Long>> entrySet = employeeCountByDepartment.entrySet();
//
//        for (Entry<String, Long> entry : entrySet) {
//
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
//        
// Map<String, Long> countMaleFemaleEmployeesInSalesMarketing
//                = employees.stream()
//                        .filter(e -> e.getDepartment() == "Sales and Marketing")
//                        .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()))
//                        .forEach(System.out::println);
//        System.out.println("countMaleFemaleEmployeesInSalesMarketing");
    }
}
//        //How many Males and Females are working
//        Map<String, Long> noOfMaleAndFemaleEmployees
//                = employees.stream()
//                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
//
//        System.out.println(noOfMaleAndFemaleEmployees);
/*The filter() method of java. util. Optional class in Java is used to filter
the value of this Optional instance by matching it with the given Predicate, 
and then return the filtered Optional instance. */

 /*collect: The collect method is used to return the result of the intermediate operations performed on the stream.
List number = Arrays.asList(2,3,4,5,3);
Set square = number.stream().map(x->x*x).collect(Collectors.toSet());

forEach: The forEach method is used to iterate through every element of the stream.
List number = Arrays.asList(2,3,4,5);
number.stream().map(x->x*x).forEach(y->System.out.println(y));

reduce: The reduce method is used to reduce the elements of a stream to a single value.
The reduce method takes a BinaryOperator as a parameter. 

List number = Arrays.asList(2,3,4,5);
int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);

map: The map method is used to returns a stream consisting of the results of applying the given function to the elements of this stream.
List number = Arrays.asList(2,3,4,5);
List square = number.stream().map(x->x*x).collect(Collectors.toList());
filter: The filter method is used to select elements as per the Predicate passed as argument.

List names = Arrays.asList("Reflection","Collection","Stream");
List result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());

sorted: The sorted method is used to sort the stream.
List names = Arrays.asList("Reflection","Collection","Stream");
List result = names.stream().sorted().collect(Collectors.toList());*/
