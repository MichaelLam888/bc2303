package week1;

public class Loops {
    public static void main(String[] args) {

        /*
         * int maxTime = 5;
         * 
         * for (byte i = 0 ; i < maxTime ; i++) { //counter to start ; condition to
         * continue ; change of I eash loop
         * System.out.println("Hello" + i);
         * }
         */

         /* 
        int i = 0;
        int count = 0;
        while (i < 5) { // condition to countinue
            System.out.println("Hello" + count);
            i++;
        }
        */

        /* 
        int i =  0;
        do {
            System.out.println("Hello");
            i += 1;
        } while (i < 5);
        */


        for (int a= 0 ; a < 4  ; a++ ){
            System.out.println("Hello"+ a);
            if ( a ==2 ){
                break;
            }
        }
    } 
}