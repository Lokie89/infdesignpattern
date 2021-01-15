package decorator;

public class Espresso extends AbstAdding {

    protected static int espressoCount = 0;

    public Espresso(IBeverage material) {
        super(material);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice() + getAddPrice();
    }

    private static int getAddPrice() {
        espressoCount++;
        int addPrice = 100;

        if (espressoCount > 1) {
            addPrice = 70;
        }
        return addPrice;
    }
}
