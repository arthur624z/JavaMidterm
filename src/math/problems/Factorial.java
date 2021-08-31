package math.problems;

import java.util.Scanner;

public class Factorial {

    /*
     Write a method to return the Factorial of any given number using Recursion as well as Iteration

     Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    public static int Factorial(int num) {

        if (num == 1) {
            if (num == 1 || num == 0) {
                return 1;
            } else {
                return num * Factorial(num - 1);
            }

        }

        public static int Iteration ( int num){

            int result = 1;

            for (int i = 1; i <= num; i++) {

                result = i * result;
            }
            return result;
        }

        public static void main (String[]args)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter any number: ");
            System.out.println("Enter a positive number: ");
            int number = input.nextInt();
            System.out.println("Result using Recursion: " + Factorial(number));
            System.out.println("Result using Iteration: " + Iteration(number));
        }


    }
}
