package week4homeworkpratik;

import java.util.Scanner;

/*
14. Write a program in Java to display the pattern like a diamond.
While loop
*/
public class Program14 {

    int no;

    public void inputnumber() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Input number: ");
        no = s1.nextInt();
        s1.close();
    }

    public void dimond(){
        int i,j;
        for(i=0;i<=no;i++)
        {
            for(j=1;j<=no-i;j++)
                System.out.print(" ");
            for(j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.print("\n");
        }

        for(i=no-1;i>=1;i--)
        {
            for(j=1;j<=no-i;j++)
                System.out.print(" ");
            for(j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.print("\n");
        }

    }

    public static void main(String[] args) {

        Program14 obj=new Program14();
        obj.inputnumber();
        obj.dimond();

    }
}
