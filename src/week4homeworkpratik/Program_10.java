package week4homeworkpratik;

import java.util.Scanner;

/*
10. Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153
*/
public class Program_10 {
    int no;

    public void inputnumber() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Input number: ");
        no = s1.nextInt();
        s1.close();
    }

    public void Armstrong()
    {
        int  originalNumber, remainder, result = 0;

        originalNumber = no;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == no)
            System.out.println(no + " is an Armstrong number.");
        else
            System.out.println(no + " is not an Armstrong number.");


    }

    public static void main(String[] args) {

        Program_10 obj=new Program_10();
        obj.inputnumber();
        obj.Armstrong();

    }

}
