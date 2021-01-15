package chainofresponsibility.c1;

public class PlusCalculator extends Calculator {
    @Override
    protected boolean operator(Request request) {
        if (request.getOper().equals("+")) {
            int num1 = request.getNum1();
            int num2 = request.getNum2();
            int sum = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + sum);
            return true;
        }
        return false;
    }
}
