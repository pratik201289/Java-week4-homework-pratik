package week4homeworkpratik;
/*8. Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@*/
public class Program_8 {


    public static void tringalelogic(){

        int i,j,n;

        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
             System.out.print("@" + " ");

            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        tringalelogic();
    }


}
