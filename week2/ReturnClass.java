package week2;

public class ReturnClass {

    public static AmountHolder getAmountHolder (int x){
     AmountHolder newHolder = new AmountHolder(x);
     return newHolder;
    }


    public static void main(String[] args) {
        int amount = 33;
        AmountHolder holderByMethod = getAmountHolder(amount);
        System.out.println(holderByMethod.getAmount());
    }
}
