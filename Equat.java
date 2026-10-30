package equations;
import java.util.Scanner;

public class Equat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Linear Equation");
        System.out.println("2. Quadratic Equation");
        int ch = sc.nextInt();

        if (ch == 1) {
            System.out.print("Enter a and b: ");
            double a = sc.nextDouble(), b = sc.nextDouble();

            if (a == 0)
                System.out.println(b == 0 ? "Infinite solutions" : "No solution");
            else
                System.out.println("x = " + (-b / a));
        }
        else if (ch == 2) {
            System.out.print("Enter a, b and c: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            if (a == 0) {
                System.out.println("Not quadratic");
                if (b == 0)
                    System.out.println(c == 0 ? "Infinite solutions" : "No solution");
                else
                    System.out.println("x = " + (-c / b));
            } else {
                double d = b*b - 4*a*c;
                System.out.println("Discriminant = " + d);

                if (d >= 0) {
                    System.out.println("Root 1 = " + (-b + Math.sqrt(d))/(2*a));
                    System.out.println("Root 2 = " + (-b - Math.sqrt(d))/(2*a));
                } else {
                    System.out.println("Complex roots");
                    System.out.println("Real part = " + (-b/(2*a)));
                    System.out.println("Imaginary part = " + (Math.sqrt(-d)/(2*a)));
                }
            }
        }
        else {
            System.out.println("Invalid choice");
        }
        sc.close();
    }
}