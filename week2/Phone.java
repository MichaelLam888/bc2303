package week2;

public class Phone {
    private String brand;
    private String color;
    private String ram;
    private boolean isDiscount;
    private int price;
    private char code;

    public Phone() {

    }

    public Phone(String brand, char code) {
        this.brand = brand;
        this.code = code;
    }

    public Phone(String brand, String color, String ram, int price, char code) {
        this.brand = brand;
        this.price = price;
        this.ram = ram;
        this.color = color;
        this.code = code;

        if (price > 3000) {
            isDiscount = true;
        } else {
            isDiscount = false;
        }
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setDetials(String brand, String color, String ram, int price, char code) {
        this.color = color;
        this.ram = ram;
        this.price = price;
        this.code = code;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getDetials() {
        return this.color + " - " + this.ram;
    }

    public String toString() {
        return "Brand : " + this.brand + //
                " Color : " + this.color + //
                " RAM : " + this.ram + //
                " $: " + this.price + //
                " Code : " + this.code;
    }

    public String checkDiscount() {
        if (this.isDiscount) {
            return "Yes,10% off now!";
        } else {
            return "No discount now.";
        }
    }


}