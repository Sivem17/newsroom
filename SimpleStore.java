package a04;

import java.util.Scanner;

/**
 *
 * @author Aitezaz Siddiqi (A00431079)
 */
public class SimpleStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        //DECLARING INT
        int num_pencil, num_eraser, num_paper, age;

        //DECLARING CONSTANT DOUBLE
        final double price_pencil, price_eraser, price_paper;
        price_pencil = 0.99;
        price_eraser = 2.99;
        price_paper = 8.99;

        //DECLARING DOUBLE
        double total_pencil_price, total_eraser_price, total_paper_price, 
                total_price, discount, discount_price, total_discounted_price;

        //DECLARING CONSTANT STRING
        final String pencils, erasers, packages_of_paper;
        pencils = "'Pencil'";
        erasers = "'Eraser'";
        packages_of_paper = "'Package of paper'";

        // INTRODUCTION
        System.out.println("Simple Store Receipt Printer");
        System.out.println("----------------------------");
        System.out.println();
        System.out.println("by Aitezaz Siddiqi (A00431079)");
        System.out.println();

        //PAUSE
        System.out.print("Press enter...");
        kbd.nextLine();
        System.out.println();

        //USER INPUT FOR PENCIL
        System.out.print("Rate of per " + pencils + " is $" + price_pencil + 
                ". How many " + pencils + " do you want? ");
        num_pencil = kbd.nextInt();
        //IF USER INPUT NEGATIVE NUMBER
        if (num_pencil < 0) {
            num_pencil = 0;
            System.out.println("You can't order a negative number of items!");
        }

        //USER INPUT FOR ERASER
        System.out.print("Rate of per " + erasers + " is $" + price_eraser + 
                ". How many " + erasers + " do you want? ");
        num_eraser = kbd.nextInt();
        //IF USER INPUT NEGATIVE NUMBER
        if (num_eraser < 0) {
            num_eraser = 0;
            System.out.println("You can't order a negative number of items!");
        }

        //USER INPUT FOR PACKAGES OF PAPER
        System.out.print("Rate of per"
                + " " + packages_of_paper + " is $" + price_paper + 
                ". How many " + packages_of_paper + " do you want? ");
        num_paper = kbd.nextInt();
        //IF USER INPUT NEGATIVE NUMBER
        if (num_paper < 0) {
            num_paper = 0;
            System.out.println("You can't order a negative number of items!");
        }
        System.out.println();
        kbd.nextLine();

        //PAUSE
        System.out.print("Press enter...");
        kbd.nextLine();
        System.out.println();

        //ASKS FOR AGE IF USER BUYS ANYTHING
        if (num_eraser == 0 && num_pencil == 0 && num_paper == 0) {
            System.out.println();
            System.out.println("Thank-you! Please come again!");
        } else {
            System.out.print("How old are you? ");
            age = kbd.nextInt();
            System.out.println();
            
            //CALCULATION FOR PRICE
            total_pencil_price = price_pencil * num_pencil;
            total_eraser_price = price_eraser * num_eraser;
            total_paper_price = price_paper * num_paper;
            total_price = total_pencil_price + total_eraser_price + 
                    total_paper_price;
                   
            //DISCOUNT CALCULATION IF 
            if (age <55) {
                discount = 0;
            } else if (age >= 55 && age < 75){
                discount = 0.10;
            } else {
                discount = 0.25;
            }
            discount_price = total_price * discount;
            total_discounted_price = total_price - discount_price;

            //PRINTING RECEIPT
            System.out.println("Customer Receipt");
            System.out.println("----------------");

            //PRINTS PRICE FOR PENCIL IF APPROPRIATE
            if (num_pencil > 0) {
                System.out.println();
                System.out.printf( + num_pencil + " " + pencils + " at "
                        + "$" + price_pencil + " each:     "
                                + "$" + "%.3f", total_pencil_price);
            }
            //PRINTS PRICE FOR ERASER IF APPROPRIATE
            if (num_eraser > 0) {
                System.out.println();
                System.out.printf( + num_eraser + " " + erasers + " at "
                        + "$" + price_eraser + " each:     "
                                + "$" + "%.3f", total_eraser_price);
            }
            //PRINTS PRICE FOR PACKAGES OF PAPER IF APPROPRIATE
            if (num_paper > 0) {
                System.out.println();
                System.out.printf( + num_paper + " " + packages_of_paper + " "
                        + "at $" + price_paper + " each:     "
                                + "$" + "%.3f", total_paper_price);
            }
           
            //PRINTS TOTAL DISCOUNTED PRICE IF APPROPRIATE
            if (age >= 55 && age < 75) {
                System.out.println();
                System.out.printf("Total regular price:     $" + 
                        "%.3f", total_price);
                System.out.println();
                System.out.println("Discount at 10%:     $" + 
                        String.format("%.03f", discount_price));
                System.out.printf("Total discounted price:     $" + 
                        "%.3f", total_discounted_price);
                System.out.println();
            } else if (age >= 75) {
                System.out.println();
                System.out.printf("Total regular price:     $" + 
                        "%.3f", total_price);
                System.out.println();
                System.out.println("Discount at 25%:     $" + 
                        String.format("%.03f", discount_price));
                System.out.printf("Total discounted price:     $" + 
                        "%.3f", total_discounted_price);
                System.out.println();
            } else {
                System.out.println();
                System.out.printf("Total regular price:     $" + 
                        "%.3f", total_price);
                System.out.println();
            }
        }

    }
}