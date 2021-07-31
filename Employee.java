import java.util.Scanner;

public class Employee {
    String name,address;
    int year;
    
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee emp[] = new Employee[3];

        for (int i = 0; i < 3; i++) {
            emp[i] = new Employee();

            System.out.println("Enter " + (i + 1) + " Employee data ");

            System.out.print("Enter employee name :");
            emp[i].name = sc.next();
            System.out.print("Enter employee year :");
            emp[i].year = sc.nextInt();
            System.out.print("Enter employee address :");
            emp[i].address = sc.next();

        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Name Year of joining Address :" + emp[i].name + " " + emp[i].year + " " + emp[i].address);

        }
    }

}