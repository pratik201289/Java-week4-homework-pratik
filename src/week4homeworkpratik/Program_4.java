package week4homeworkpratik;

/*Digit Sum Challenge*/
public class Program_4 {
    public static void sumDigits(int number) {

        int sum = 0;
        while (number > 0) {
            //find the last digit of the given number
            sum = sum + number % 10;
            //remove the last digit from the number
            number = number / 10;

        }
        //prints the result
        System.out.println("Sum of digits " + sum);

    }

    public static void main(String[] args) {
        sumDigits(125);
        sumDigits(-1);
    }

}
