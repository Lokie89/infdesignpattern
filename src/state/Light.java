package state;

public class Light {
    private LightState lightState;

    private LightState offLightState = new LightState() {
        @Override
        public void on() {
            System.out.println("Light ON");
            lightState = onLightState;
        }

        @Override
        public void off() {
            System.out.println("Nothing");
        }
    };

    private LightState onLightState = new LightState() {
        @Override
        public void on() {
            System.out.println("Nothing");
        }

        @Override
        public void off() {
            System.out.println("Light OFF");
            lightState = offLightState;
        }
    };

    public Light() {
        lightState = offLightState;
    }

    public void on() {
        lightState.on();
    }

    public void off() {
        lightState.off();
    }
}

interface LightState {
    void on();
    void off();
}
