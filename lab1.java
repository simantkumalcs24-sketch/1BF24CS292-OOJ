import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        double d;
        double r1, r2;

        System.out.println("Enter the coefficients a, b, c: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        while (a == 0) {
            System.out.println("Not a quadratic equation. Enter a non-zero value for a: ");
            a = input.nextDouble();
        }

        d = b * b - 4 * a * c;

        if (d == 0) {
            r1 = -b / (2 * a);
            System.out.println("Roots are real and equal.");
            System.out.println("Root1 = Root2 = " + r1);
        } else if (d > 0) {
            r1 = (-b + Math.sqrt(d)) / (2 * a);
            r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are real and distinct.");
            System.out.println("Root1 = " + r1 + " , Root2 = " + r2);
        } else {
            System.out.println("Roots are imaginary.");
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-d) / (2 * a);
            System.out.println("Root1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root2 = " + realPart + " - " + imaginaryPart + "i");
        }

        input.close();
    }
}
