package abstractfactorypattern.ab1.gt;

import abstractfactorypattern.ab1.BikeFactory;
import abstractfactorypattern.ab1.Body;
import abstractfactorypattern.ab1.Wheel;

public class GtFactory implements BikeFactory {

    Body body;
    Wheel wheel;

    @Override
    public Body createBody() {
        return new GtBody();
    }

    @Override
    public Wheel createWheel() {
        return new GtWheel();
    }
}
