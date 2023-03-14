package week2Abstract;

public class Musican extends Artist {
    private String instrument;

    public Musican() {

    }

    public Musican(String instrument) {
        // this.artType = artType;
        // this.regional = regional;
        // this.name = name;
        // this.age=age;
        this.instrument = instrument;
    }

    @Override
    public void doSomething() {
        System.out.println("I can play a wonderful " + this.instrument + " song");
    }

    public String getMusican() {
        return this.getAllDetial() + " Instrument : " + this.instrument;
    }

    @Override
    public void payTax() {
       System.out.println("I should pay tax : $" + this.taxRate * 10000);
    }

}