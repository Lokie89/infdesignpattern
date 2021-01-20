package mediator.contract;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Mediator {
    protected List<Colleague> colleagues;

    public Mediator() {
        this.colleagues = new ArrayList<>();
    }

    public boolean addColleague(Colleague colleague) {
        if (Objects.isNull(colleague)) {
            throw new RuntimeException();
        }
        return colleagues.add(colleague);
    }

    public abstract void mediate(String data);
}
