/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a06;

/**
 *
 * @author Aitezaz Siddiqi (A00431079)
 */
public class GradeDistribution {

    private int reqGrade; 
    private String numA, numB, numC, numD, numF;

    void print() {

        System.out.println();
        for (int x = 0; x <= 100; x = x + 10) {
            System.out.print(x);
            for (int i = 1; i <= 5; i++) {
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int j = 0; j <= 100; j = j + 10) {
            System.out.print("|");
            for (int k = 1; k <= 6 && j != 100; k++) {
                System.out.print("_");
            }
        }
        System.out.println();
    }

    void reset() {
    }

    public String addGrade(int numberGrade) {
        this.reqGrade=numberGrade;
        if (numberGrade >= 80) {
            return "A";
        } else if (numberGrade >= 70) {
            return "B";
        } else if (numberGrade >= 60) {
            return "C";
        } else if (numberGrade >= 50) {
            return "D";
        } else {
            return "F";
        }
        

    }

    String getAs() {
        return numA;
    }

    String percentAs() {
        return addGrade(reqGrade);
    }

    String getBs() {
        return numB;
    }

    String percentBs() {
        return addGrade(reqGrade);
    }

    String getCs() {
        return numC;
    }

    String percentCs() {
        return addGrade(reqGrade);
    }

    String getDs() {
        return numD;
    }

    String percentDs() {
        return addGrade(reqGrade);
    }

    String getFs() {
        return numF;
    }

    String percentFs() {
        return addGrade(reqGrade);
    }

    String getTotal() {
        return "";
    }
}
