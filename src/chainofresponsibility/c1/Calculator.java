package chainofresponsibility.c1;

public abstract class Calculator {

    private Calculator nextCalculator;

    public void setNextCalculator(Calculator nextCalculator) {
        this.nextCalculator = nextCalculator;
    }

    public boolean process(Request request) {
        if (operator(request)) {
            return true;
        } else {
            return nextCalculator.process(request);
        }
    }

    protected abstract boolean operator(Request request);
}
