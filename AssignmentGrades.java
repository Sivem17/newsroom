package a05;

import java.util.Scanner;

/**
 * program to calculate the overall assignment grades in a class
 *
 * @author Aitezaz Siddiqi (A00431079)
 */
public class AssignmentGrades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner kbd = new Scanner(System.in);
        
        //DECLARING INT
        int assignmentScores, lowestScores;
        //DECLARING DOUBLE
        double finalResult, total = 0, studentAvg, classAverage = 0;

        printIntroduction();
        printPause(kbd);

        System.out.print("Enter a student number or leave blank to quit: ");
        //DECLARING STRING
        String aNumber;
        aNumber = kbd.nextLine();

        while (!(aNumber.isEmpty())) {
            finalResult = 0;
            lowestScores = 101;
            total += 1;
            System.out.print("Enter " + aNumber + "'s " + NUM_OF_ASSIGNMENT
                    + " assignment scores: ");

            for (int i = 1; i <= NUM_OF_ASSIGNMENT; ++i) {
                assignmentScores = kbd.nextInt();
                finalResult += assignmentScores;
                if (assignmentScores < lowestScores) {
                    lowestScores = assignmentScores;
                }
            }

            kbd.nextLine();
            studentAvg = (finalResult - lowestScores) / (NUM_OF_ASSIGNMENT - 1);

            System.out.println();
            System.out.println("Student " + aNumber + ":" + studentAvg + "%");
            classAverage += studentAvg;

            printPause(kbd);
            System.out.print("Enter a student number or leave blank to quit: ");
            aNumber = kbd.nextLine();

        }
        System.out.println();
        System.out.println("Class Average: " + classAverage / total + "%");

    }

    private static final int NUM_OF_ASSIGNMENT = 6;

    private static void printIntroduction() {
        System.out.println("Assignment Grade Calculator");
        System.out.println("---------------------------");
        System.out.println();

        System.out.println("This program calculates the overall assignment"
                + " grade \nfor a list of students in a class");
        System.out.println();
        System.out.println("By - Aitezaz Siddiqi (A00431079)");
        System.out.println("--------------------------------");
    }

    private static void printPause(Scanner kbd) {
        System.out.println();
        System.out.print("Press Enter key to continue...");
        kbd.nextLine();
        System.out.println();

    }

}
