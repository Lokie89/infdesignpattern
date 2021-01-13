package abstractfactorypattern.ab1.sam;

import abstractfactorypattern.ab1.BikeFactory;
import abstractfactorypattern.ab1.Body;
import abstractfactorypattern.ab1.Wheel;

public class SamFactory implements BikeFactory {

    Body body;
    Wheel wheel;

    @Override
    public Body createBody() {
        return new SamBody();
    }

    @Override
    public Wheel createWheel() {
        return new SamWheel();
    }
}
