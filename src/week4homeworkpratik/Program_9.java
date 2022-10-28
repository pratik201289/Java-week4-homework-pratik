package week4homeworkpratik;

import java.util.Scanner;

/*
9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
* */
public class Program_9 {

    int no;

    public void inputnumber() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Input number: ");
        no = s1.nextInt();
        s1.close();
    }


    public void fibologic() {
        int n1 = 0, n2 = 1;


        for (int i = 1; i <= no; i++) {

            System.out.print(n1 + ",");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

    }

    public static void main(String[] args) {
        Program_9 obj = new Program_9();
        obj.inputnumber();
        obj.fibologic();
    }
}
