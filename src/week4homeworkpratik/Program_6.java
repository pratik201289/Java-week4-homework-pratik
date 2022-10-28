package week4homeworkpratik;

import java.util.Scanner;
/*6. Write a program in Java to display the pattern like a triangle with a number.
For eg.
Input number of rows: 10
Expected Output:
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910
*/
public class Program_6 {
    public int pat;

    public void inputgiven() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        pat = s1.nextInt();
        s1.close();
    }

    public void tringlepattern() {
        int i, j;
        for (i = 1; i <= pat; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
               }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {

        Program_6 prg = new Program_6();
        prg.inputgiven();
        prg.tringlepattern();


    }

}
