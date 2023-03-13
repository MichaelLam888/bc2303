package week2;

import java.util.Scanner;

public class Marketing {
    Car car;

    public static void main(String[] args) {

        Car nsx = new Car();
        Car estima = new Car();
        Car rx7 = new Car();

        nsx.setDetials("Honda", "Manual", "Red", 2500);
        estima.setDetials("Toyota", "Auto", "Black", 3500);
        rx7.setDetials("Mazda", "Manual", "Yellow", 1200);



        System.out.println("Please select a car : NSX , or estima or rx7 ");
        Scanner stringScanner = new Scanner(System.in);
        String input = stringScanner.next();
        input = input.toLowerCase();

        System.out.println(input.getClass());

        if ("nsx".equals(input)) {
            System.out.println(nsx.getBrand());
            System.out.println(nsx.getTransmit());
            System.out.println(nsx.getCc());
            if (nsx.isInStock()) {
                System.out.println("NSX is in inStock");
            } else {
                System.out.println("NSX is out of stock");
            }
            if (nsx.isDiscount()) {
                System.out.println("Yes,now is 10% off!");
            } else {
                System.out.println("Sorry that now is no discount.");
            }



        } else if ("estima".equals(input)) {
            System.out.println(estima.getBrand());
            System.out.println(estima.getTransmit());
            System.out.println(estima.getCc());
            if (estima.isInStock()) {
                System.out.println("Estima is in inStock");
            } else {
                System.out.println("Estima is out of stock");
            }
            if (estima.isDiscount()) {
                System.out.println("Yes,now is 10% off!");
            } else {
                System.out.println("Sorry that now is no discount.");
            }

        } else if ("rx7".equals(input)) {
            System.out.println(rx7.getBrand());
            System.out.println(rx7.getTransmit());
            System.out.println(rx7.getCc());
            if (rx7.isInStock()) {
                System.out.println("RX7 is in inStock");
            } else {
                System.out.println("RX7 is out of stock");
            }
            if (rx7.isDiscount()) {
                System.out.println("Yes,now is 10% off!");
            } else {
                System.out.println("Sorry that now is no discount.");
            }

        }
        else{
            System.out.println("No Data");
        }

    }
}
