package chainofresponsibility.c2;

public class Attack {
    private int amount;

    public Attack(int amount) {
        this.amount = amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}