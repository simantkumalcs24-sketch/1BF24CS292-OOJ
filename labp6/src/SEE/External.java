package SEE;

import CIE.Internal;
import java.util.Scanner;

public class External extends Internal{
    protected int seeMarks[] = new int[5];
    protected int finalMarks[] = new int[5];

    public void inputSEEmarks() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter SEE marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            seeMarks[i] = s.nextInt();
        }
    }

    public void calculateFinalMarks() {
        for (int i = 0; i < 5; i++) {
            // Each internal is out of 50, SEE out of 100, so convert SEE to 50 and add
            finalMarks[i] = (marks[i]) + (seeMarks[i] / 2);
        }
    }

    public void displayFinalMarks() {
        displayStudentDetails();
        System.out.println("Final Marks in 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": " + finalMarks[i]);
        }
    }
}
