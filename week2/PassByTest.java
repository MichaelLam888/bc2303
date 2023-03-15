package week2;

public class PassByTest {

    public static void doSth(int x) {
        x = 10;
    }

    public static void doSth(Integer y) {
        y = 10;
    }

    public static void doSth(StringBuilder s) {
        s.append(" Lam");
    }

    public static void main(String[] args) {
        int x = 99;
        StringBuilder michael = new StringBuilder("Michael");
        doSth(x);
        System.out.println(x);
        Integer y = 99;
        System.out.println(y);
        System.out.println("-------");
        System.out.println(michael.toString());
        doSth(michael);
        System.out.println(michael);
    }

}
