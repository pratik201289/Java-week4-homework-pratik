package week4homeworkpratik;
/*7. First And Last Digit Sum
Write a method named sumFirstAndLastDigit with one parameter of type int called number.
The method needs to find the first and the last digit of the parameter number passed to the method,
using a loop and return the sum of the first and the last digit of that number.
If the number is negative then the method needs to return -1 to indicate an invalid value.*/
public class Program_7 {
    public static void main(String[] args) {

        sumFirstAndLastDigit(252);
        sumFirstAndLastDigit(257);
        sumFirstAndLastDigit(0);
        sumFirstAndLastDigit(5);
        sumFirstAndLastDigit(-10);
    }

    public static int sumFirstAndLastDigit(int number){

        int x = 0;
        if(number<0){
            System.out.println("-1");
            return -1;
        }
        int firstDigit = 0;
        int lastDigit = number % 10;
        while (number != 0) {
            firstDigit = number % 10;
            number /= 10;
            x= firstDigit + lastDigit;

        }
        System.out.println(x);
        return x;

    }
}
