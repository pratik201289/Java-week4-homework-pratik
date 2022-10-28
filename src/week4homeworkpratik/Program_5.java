package week4homeworkpratik;

/*Write a method called isPalindrome with one int parameter called number. The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false.
Check the tips below for more info about palindromes.*/
public class Program_5 {
    static int number, rem, reverse, temp;

    public static void main(String[] args) {

        isPalindrome(-1221);
        isPalindrome(707);
        isPalindrome(11212);
    }

    public static boolean isPalindrome(int number) {

        reverse = 0;
        temp = number;
        while (number != 0) {

            rem = number % 10;
            reverse = reverse * 10 + rem;
            number = number / 10;
        }
        if (temp == reverse) {

            System.out.println("True");
        } else {
            System.out.println("False");
        }

        return false;
    }
}
