package chainofresponsibility.c2;

public class Armor implements Defense {

    private Defense nextDefense;
    private int def;

    public Armor(int def) {
        this.def = def;
    }

    @Override
    public void defense(Attack attack) {
        process(attack);

        if (nextDefense != null) {
            nextDefense.defense(attack);
        }
    }

    private void process(Attack attack) {
        attack.setAmount(attack.getAmount() - def);
    }

    public void setNextDefense(Defense nextDefense) {
        this.nextDefense = nextDefense;
    }
}
