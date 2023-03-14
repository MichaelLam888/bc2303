package week2Abstract;

public class Who {
    public static void main(String[] args) {
        Musican andy = new Musican("Guitar");
        Actor leon = new Actor("TV Show");

        andy.setDetials("Musican", "Esia Asia", "Andy", 39);
        leon.setDetials("Actor", "EURO", "Leon", 45);

        andy.doSomething();
        System.out.println(andy.getMusican()); 
        
        
        leon.doSomething();

    }
}
