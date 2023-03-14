package week2Abstract;

public class Actor extends Artist {
    String actorType;

    public Actor() {

    }

    public Actor(String actorType) {
        this.actorType = actorType;
    }

    @Override
    public void doSomething() {
        System.out.println("I starred a great" + this.actorType);
    }

}
