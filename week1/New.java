package week1;

public class New {

    public static void main(String[] args) {

        for (int x = 0; x < 5; x++) {
            System.out.print("* ");
            for (int y = x; y >= 0; y--) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("--------");

        for (int x = 0; x < 5; x++) {
            System.out.print("* ");
            for (int y = x; y < 5; y++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("--------");

        for (int x = 0; x < 5; x++) {

            for (int z = x + 1; z < 5; z++) {
                System.out.print(" ");
            }

            for (int y = x; y >= 0; y--) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("--------");

        for (int x = 0; x < 5; x++) {


            for (int z = x + 1; z < 5; z++) { //print space / 4/3/2/1/0
                System.out.print(" ");
            }

            for (int y = x; y >= 0; y--) { // y = 1 , y = 2 , y = 3 , y = 4 , y = 5
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
/*
 * *
 * **
 * ***
 * ****
 * *****
 */

/*
 * row 1 space x 4 + star x 1
 ** row 2 space x 3 + star x 2
 *** row 3 space x 2 + star x 3
 **** row 4 space x 1 + star x 4
 ***** row 5 space x 0 + star x 5
 */

/*
    *         r:1 space:4 *:1
   ***        r:2 space:3 *:3
  *****       r:3 space:2 *:5
 *******      r:4 space:1 *:7
*********     r:5 space:0 *:9
 */