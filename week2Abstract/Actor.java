package week2Abstract;

public class Actor extends Artist {
    private String actorType;

    public Actor() {

    }

    public Actor(String actorType) {
        this.actorType = actorType;
    }

    @Override
    public void doSomething() {
        System.out.println("I starred a great" + this.actorType);
    }

    public String getActor() {

        return this.getAllDetial() + " Actor Type : " + this.actorType;
    }

    @Override
    public void payTax(){
        System.out.println("I should pay tax : $" + this.taxRate); 
    }

}
