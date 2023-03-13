package week2;

import java.util.List;

public class Car {




    private String brand, transmit, color;
    private int cc;
    private boolean inStock, discount;
    


    public void setDetials(String brand, String transmit, String color, int cc) {
        this.brand = brand;
        this.transmit = transmit;
        this.color = color;
        this.cc = cc;



        if (this.cc > 2000 ){
            this.discount = true;
        } else {
            this.discount = false;
        }

        if (this.brand == "Toyota" ){
            this.inStock = false;
        }else {
            this.inStock = true;
        }
        
    }

    public String getBrand() {
        return "This is made by " + this.brand;
    } 

    public String getTransmit() {
        return "This is " + this.transmit + " gear";
    }

    public String getColoString() {
        return "This is " + this.color;
    }

    public String getCc() {
        return "This " + this.cc + " cc";
    }

    public boolean isInStock() {
        return this.inStock;
    }

    public boolean isDiscount() {
        return this.discount;
    }

}
