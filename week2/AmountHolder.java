package week2;

public class AmountHolder {
    int x;

    public AmountHolder(int x) {
        this.x = x;
    }

    public int getAmount() {
        return this.x;
    }

    public void setAmount(int x) {
        this.x = x;
    }

    public static void doSth(AmountHolder holder) {
        holder = new AmountHolder(99);
        System.out.println("doSth method address : " + holder);
    }

    public static void doAnother(AmountHolder holder) {
        holder.setAmount(99);
        System.out.println("doAnother method address : " + holder);
    }

    public static void main(String[] args) {
        AmountHolder holder = new AmountHolder(10);
        System.out.println(holder.getAmount());
        doSth(holder);
        System.out.println("Main method address : " + holder);
        System.out.println(holder.getAmount());
        doAnother(holder);
        System.out.println(holder.getAmount());

    }

}
