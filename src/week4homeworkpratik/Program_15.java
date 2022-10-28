package week4homeworkpratik;

/*15. Display left angle triangle of * using nested for loops
 *
 * *
 * * *
 * * * *
 * * * * *
 */
public class Program_15 {


    public static void lefttriangle() {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("\n");
        }

    }

    public static void main(String[] args) {

        lefttriangle();

    }

}
