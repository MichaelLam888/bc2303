package week2;

public class Cat extends Animal{
    String color;


public Cat(){
    //super();
}

public Cat(String name,String color){
    super(name);
    this.color = color;
}

public void setColor(String color) {
    this.color=color;

}

public String toString(){
    return this.name + " - " + this.color; 
}
  
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Kitty");
        cat1.setColor("Black");

    Cat cat2 = new Cat("Meow","Yellow");
    System.out.println(cat2.toString());



    }
}
