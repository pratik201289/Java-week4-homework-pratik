package week4homeworkpratik;

import java.util.Scanner;

/*Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel of Consonant, depending on the user input. If the user input
Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.*/
public class Program_3 {
    public static void main(String[] args) {

        Program_3 obj = new Program_3();
        obj.vowelAndConsonant();

    }

    public void vowelAndConsonant() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Letter: = ");
        String a = sc.next();
        sc.close();
        if (a.length() == 1 && Character.isAlphabetic((a.charAt(0)))) {
            char ch = Character.toLowerCase((a.charAt(0)));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(a + " is a vowel");
            } else {

                System.out.println(a + " is a consonant");
            }

        } else {

            System.out.println("Invalid Input");
        }


    }
}
