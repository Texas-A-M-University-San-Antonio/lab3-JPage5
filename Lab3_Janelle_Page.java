//Name= Janelle Page
//Date= 9/13/25
//Purpose= to find compound interest

import java.util.Scanner;
//the beginning of the code to start me off
public class Lab3_Janelle_Page {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //establishing a scanner so that things are simplified

        //Now i am just going to be declaring the given variables from the read me
        double P; //the first value
        int t; //time elapsed in years
        double r; //the interest rate when it is a decimal
        double A; // this will be the last value

        //asking users for their inputsss 0.0
        System.out.print ("Please enter the initial value of the home: ");
        P = input.nextDouble();
        System.out.print("Please enter the number of elapsed years: ");
        t = input.nextInt();
        System.out.print("Please enter the interest rate: ");
        r = input.nextDouble();
        //im going to to convert the interest rate to a decimal instead of a percentage
        r = r/100;
        //the formula for compound interes is A=P * (1+r)^t
        A= P * Math.pow(1+ r, t);
        // this code on the bottom will print the final result
        System.out.printf("The final value of the home is %.2f%n", A);

        input.close();
    }
    
}