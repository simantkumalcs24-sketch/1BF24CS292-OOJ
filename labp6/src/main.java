import java.util.*;
import CIE.*;
import SEE.*;

public class main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = s.nextInt();
        Internal[] internals = new Internal[n];
        External[] externals = new External[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Student " + (i + 1) + " ---");
            externals[i] = new External();
            externals[i].inputStudentDetails();
            externals[i].inputCIEmarks();
            externals[i].inputSEEmarks();
            externals[i].calculateFinalMarks();
        }

        System.out.println("\n===== Final Marks of All Students =====");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            externals[i].displayFinalMarks();
        }
    }
}
