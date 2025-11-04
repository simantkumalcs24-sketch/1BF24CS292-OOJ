import java.util.Scanner;

abstract class Shape {
    int a, b;
    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int x, int y) {
        a = x;
        b = y;
    }
    void printArea() {
        System.out.println("Area of Rectangle = " + (a * b));
    }
}

class Triangle extends Shape {
    Triangle(int x, int y) {
        a = x;
        b = y;
    }
    void printArea() {
        System.out.println("Area of Triangle = " + (0.5 * a * b));
    }
}

class Circle extends Shape {
    Circle(int x) {
        a = x;
    }
    void printArea() {
        System.out.println("Area of Circle = " + (Math.PI * a * a));
    }
}

public class lab4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape s;

        System.out.println("Enter the dimensions of the Rectangle:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        s = new Rectangle(a, b);
        s.printArea();

        System.out.println("Enter the dimensions of the Triangle:");
        a = sc.nextInt();
        b = sc.nextInt();
        s = new Triangle(a, b);
        s.printArea();

        System.out.println("Enter the radius of the Circle:");
        a = sc.nextInt();
        s = new Circle(a);
        s.printArea();

        sc.close();
    }
}
