package scanner; //Define File location

import java.util.Scanner; //import Scanner function

import scanner.dto.Customer;
import scanner.dto.Day;
import scanner.services.CustomerService;

//Start working main function
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        greeting("Welcome to Customer Service !");
        Customer cu = getCustomer(sc);
        CustomerService service = addToService(cu);
        showCustomer(service);
        greeting("Bye Bye");
    }

    public static void showCustomer(CustomerService service) {
        Customer cus = service.getCustomer();
        System.out.println("Customer Name: " + cus.getName());
        System.out.println("Customer Age: " + cus.getAge());
        System.out.println("Customer Day: " + cus.getDay());
        System.out.println("Description: " + service.getDescription());

    }

    public static CustomerService addToService(Customer cu) {
        CustomerService service = new CustomerService(cu, "This is form new Customer Service.");
        return service;
    }

    public static Customer getCustomer(Scanner sc) {
        // Customer c = new Customer();
        System.out.println("Type Customer name !");
        String name = sc.nextLine();
        System.out.println("Type Customer Age !");
        int age = sc.nextInt();
        System.out.println("Type to Day 1 to 7 !");
        int day = sc.nextInt();
        // Customer c = new Customer(name,age,day);
        // return c;
        return new Customer(name, age, day);
        // c.setDay(Day.MON);
        // return null;
    }

    static void greeting(String message) {
        System.out.println("========================================");
        System.out.println("++++++++++++++" + message + "+++++++++++");
        System.out.println("========================================");
        System.out.println();
    }
}
