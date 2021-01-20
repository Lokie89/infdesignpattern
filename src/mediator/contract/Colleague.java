package mediator.contract;

import java.util.Objects;

public abstract class Colleague {
    private Mediator mediator;

    public boolean join(Mediator mediator) {
        if (Objects.isNull(mediator)) {
            return false;
        }
        this.mediator = mediator;
        return mediator.addColleague(this);
    }

    public void sendData(String data) {
        if (Objects.nonNull(mediator)) {
            mediator.mediate(data);
        }
    }

    public abstract void handle(String data);
}
