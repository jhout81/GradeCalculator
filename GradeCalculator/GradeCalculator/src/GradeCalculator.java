//import package to use scanner class

import java.util.Scanner;

//Prints out a letter grarde based on what numeric grade you enter
public class GradeCalculator {
    //main method void means you can't return a value
    public static void main(String[] args) {
        //initiallizing variable
        double grade;
        //initializing scanner so data from the keyboard can be read in
        Scanner in = new Scanner(System.in);
        //printing to screen to ask user to enter grade information
        System.out.print("Please enter your numeric grade: ");
        //storing input information from user
        grade = in.nextDouble();
        //if statement executes if true
        if (grade >= 92) {
            //prints out letter grade if true
            System.out.println("Your grade is an A.");
            //else if statement executes if true
        } else if (grade >= 89 && grade < 92) {
            //prints out letter grade if true
            System.out.println("Your grade is a A-.");
            //else if statement executes if true
        } else if (grade >= 87 && grade < 89) {
            //prints out letter grade if true
            System.out.println("Your grade is a B+.");
            //else if statement executes if true
        } else if (grade >= 82 && grade < 87) {
            //prints out letter grade if true
            System.out.println("Your grade is a B.");
            //else if statement executes if true
        } else if (grade >= 79 && grade < 82) {
            //prints out letter grade if true
            System.out.println("Your grade is a B-.");
            //else if statement executes if true
        } else if (grade >= 77 && grade < 79) {
            //prints out letter grade if true
            System.out.println("Your grade is a C+.");
            //else if statement executes if true
        } else if (grade >= 72 && grade < 77) {
            //prints out letter grade if true
            System.out.println("Your grade is a C.");
            //else if statement executes if true
        } else if (grade >= 69 && grade < 72) {
            //prints out letter grade if true
            System.out.println("Your grade is a C-.");
            //else if statement executes if true
        } else if (grade >= 67 && grade < 69) {
            //prints out letter grade if true
            System.out.println("Your grade is a D+.");
            //else if statement executes if true
        } else if (grade >= 60 && grade < 67) {
            //prints out letter grade if true
            System.out.println("Your grade is a D.");
            //else if statement executes if true
        } else if (grade >= 0 && grade < 60) {
            //prints out letter grade if true
            System.out.println("Your grade is an F.");
            //executes the else statement if everything else is false
        } else {
            //prints out Error statement if none of the other parameters are true
            System.out.println("ERROR, You entered a value less than 0.");
        }

    }
}
