package week4homeworkpratik;

import java.util.Scanner;

/*
1. Read 10 numbers from the console entered by the user and print the sum of those numbers.
*/
public class Program_1 {
    public static void main(String[] args) {
        Program_1 obj = new Program_1();
        obj.sumInput();
    }
    public void sumInput() {
        int i = 1;
        int sum = 0;
        Scanner s1 = new Scanner(System.in);
        while (i <= 10) {
            System.out.println("Enter integer number:  " + i);
            if (s1.hasNextInt()) {
                sum = sum + s1.nextInt();
                i++;
            } else {
                System.out.println("Invalid number you entered");
                s1.next(); // use this to flush the input number
            }

        }
        s1.close();
        System.out.println("The Summation is: " + sum);


    }
}