import java.util.Scanner;

public class Employee {

    int eid;
    String name;
    float salary;

    public void inputDetails() {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the eid :: ");
        eid = in.nextInt();
        System.out.print("Enter the name :: ");
        name = in.next();
        System.out.print("Enter the salary :: ");
        salary = in.nextFloat();
    }

    public void showDetails() {

        System.out.println("Employee id = " + eid);
        System.out.println("Employee name = " + name);
        System.out.println("Employee salary = " + salary);
    }

    public static void main(String[] args) {

        Employee e[] = new Employee[5];

        for(int i=0; i<5; i++) {

            e[i] = new Employee();
            e[i].inputDetails();
        }

        System.out.println("**** Print the Details ****");

        for(int i=0; i<5; i++) {

            e[i].showDetails();
        }
    }
}