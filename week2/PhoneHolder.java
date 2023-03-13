package week2;

import java.util.List;

public class PhoneHolder {

    private Phone phone;
    List<Phone> phones;

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Phone getPhone() {
        return this.phone;
    }

  

    public static void main(String[] args) {
        Phone iPhone = new Phone();
        Phone sonyX1 = new Phone("Sony", 'S');
        Phone nokia3310 = new Phone("Nokia", "Black", "64MB", 3500, 'N');


        

        System.out.println(iPhone.getDetials());
        System.out.println(sonyX1.getDetials());

        System.out.println(nokia3310.toString());

        System.out.println(nokia3310.checkDiscount());
        System.out.println(sonyX1.checkDiscount());

        PhoneHolder phoneHolder = new PhoneHolder();
        phoneHolder.setPhone(sonyX1);

        System.out.println(sonyX1.toString());
        System.out.println(sonyX1);
        System.out.println(phoneHolder.getPhone().toString());
        System.out.println(phoneHolder);

    }

    

}
