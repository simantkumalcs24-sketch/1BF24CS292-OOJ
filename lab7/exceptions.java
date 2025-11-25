import java.util.Scanner;

class WrongAgeException extends Exception {
    public WrongAgeException(String message) {
        super(message);
    }
}

class Father {
    protected int fatherAge;

    public Father(int age) throws WrongAgeException {
        if (age < 0) {
            throw new WrongAgeException("Father's age cannot be negative!");
        }
        this.fatherAge = age;
        System.out.println("Father's age: " + fatherAge); 
    }
}

class Son extends Father {
    private int sonAge;

    public Son(int fatherAge, int sonAge) throws WrongAgeException {
        super(fatherAge);
        if (sonAge >= fatherAge) {
            throw new WrongAgeException("Son's age cannot be greater than or equal to Father's age!");
        }
        if (sonAge < 0) {
            throw new WrongAgeException("Son's age cannot be negative!");
        }
        this.sonAge = sonAge;
        System.out.println("Son's age: " + sonAge);
    }
}

public class exceptions {
    public static void main(String[] args) {
        try {
            Son s1 = new Son(25, 20);
            Son s2 = new Son(45, 20);
        } catch (WrongAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
