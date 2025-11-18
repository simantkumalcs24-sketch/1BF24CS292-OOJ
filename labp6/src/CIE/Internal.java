package CIE;

import java.util.Scanner;

public class Internal extends Student {
    protected int marks[] = new int[5]; // 5 courses

    public void inputCIEmarks() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Internal marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = s.nextInt();
        }
    }

    public int[] getCIEMarks() {
        return marks;
    }
}
