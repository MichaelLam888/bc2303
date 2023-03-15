package week2Abstract;

import java.time.LocalDate;

public class Who {
    public static void main(String[] args) {
        Musican andy = new Musican("Guitar");
        Actor leon = new Actor("TV Show");

        andy.setDetials("Musican", "Esia Asia", "Andy", 39);
        andy.setTaxRate(0.3);
        leon.setDetials("Actor", "EURO", "Leon", 45);

        andy.doSomething();
        andy.payTax();
        System.out.println(andy.getMusican());

        leon.doSomething();
        System.out.println(leon.getActor());

        LocalDate dateOfBrith = LocalDate.of(1986, 7, 8);
        System.out.println(dateOfBrith);

        //(x + y)
        
        System.out.println(calReminder(33,33,5));


    }



}
