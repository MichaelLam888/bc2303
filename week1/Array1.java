package week1;

import java.util.Arrays;

public class Array1 {

    public static void main(String[] args) {

        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
    
        int[] array2 = new int[5];

        array2[1] = 100;

        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);

        for (int e : arr) {
            System.out.println(e);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // convet array2 to a string array
        String[] strArray = new String[array2.length];
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = String.valueOf(array2[i]);
        }

        System.out.println(Arrays.toString(strArray));

        System.out.println(Arrays.toString(arr));
        int total = 0;
        for (int element : arr) {
            total += element;
            System.out.println(total);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String test = String.valueOf(arr[2]);
        System.out.println(test);


    }

}