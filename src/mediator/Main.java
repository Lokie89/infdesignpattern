package mediator;

import mediator.contract.Colleague;
import mediator.contract.Mediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new ChatMediator();
        Colleague colleague1 = new ChatColleague(),
                colleague2 = new ChatColleague(),
                colleague3 = new ChatColleague();

        colleague1.join(mediator);
        colleague2.join(mediator);
        colleague3.join(mediator);

        colleague1.sendData("AAA");
        colleague2.sendData("BBB");
        colleague3.sendData("CCC");

    }
}
