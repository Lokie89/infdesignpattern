package abstractfactorypattern.ab1;

import abstractfactorypattern.ab1.gt.GtFactory;
import abstractfactorypattern.ab1.sam.SamFactory;

public class Main {
    public static void main(String[] args) {
//        BikeFactory bikeFactory = new SamFactory();
        BikeFactory bikeFactory = new GtFactory();
        Body body = bikeFactory.createBody();
        Wheel wheel = bikeFactory.createWheel();
        System.out.println(body.getClass());
        System.out.println(wheel.getClass());
    }
}
