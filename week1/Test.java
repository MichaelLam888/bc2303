package week1;

public class Test {
    public static void main(String[] args) {
        for (int x = 0; x < 5; x++) { // rows
            // print space
            for (int z = 4 - x; z >= 0; z--) {
                System.out.print(" ");
            }
            // print *
            for (int y = x; y >= 0; y--) {
                System.out.print(y);
            }
            // print mirror of *
            for (int y = x; y > 0; y--) {
                System.out.print(y);
            }
            System.out.println("");
        }


    }
}
