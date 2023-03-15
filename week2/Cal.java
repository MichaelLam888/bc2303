package week2;

public class Cal {

    public static int calReminder(int x, int y, int z) {

        return (x + y) % z;

    }

    public static double calReminder(int x, int y) {
        double a = x;
        double b = y;
        return a / b;
    }

    public static int sum(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public static int sumArgs(int[] nums) {
        int sum = 0;
        for (int element : nums) {
            sum += element;
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(calReminder(10, 10, 3));
        System.out.println(calReminder(10, 3));
        System.out.println(sum(1, 2, 2, 3, 4, 5, 6, 7, 7, 8));
        int[] arr = new int[] { 1, 2, 3 };
        System.out.println(sumArgs(arr));

    }

}
