package chainofresponsibility.c1;

public class Request {
    private int num1, num2;
    private String oper;

    public Request(int num1, int num2, String oper) {
        this.num1 = num1;
        this.num2 = num2;
        this.oper = oper;
    }

    public String getOper() {
        return oper;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }
}
