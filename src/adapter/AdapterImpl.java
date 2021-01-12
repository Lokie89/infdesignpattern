package adapter;

public class AdapterImpl implements Adapter {

    @Override
    public Float twiceOf(Float f) {
        Float f1 = (float) Math.twoTime(f.doubleValue());
        return f1;
    }

    @Override
    public Float halfOf(Float f) {
        return (float) Math.half(f.doubleValue());
    }
}
