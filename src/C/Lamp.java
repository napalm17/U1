package C;

/**
 * Models a single lamp on a traffic light:
 * @author ugpsy
 * @version 1.0
 */
public class Lamp {

    private boolean isOn;

    /**
     * Constructor helps us initialize a lamp with the option of choosing whether it's
     * on(green) or off(red).
     * @param isOn If true, the light is green
     */
    Lamp(boolean isOn) {
        this.isOn = isOn;
    }

    /**
     * A void method that changes the lamp's color.
     */
    public void switchColor() {
        this.isOn = !(this.isOn);
    }

    /**
     * A boolean method that
     * @return If the lamp is on(true) or (false).
     */
    public boolean isOn() {
        return this.isOn;
    }
}
