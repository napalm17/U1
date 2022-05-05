package C;

/**
 * Models a traffic light with its lamps:
 * @author ugpsy
 * @version 1.0
 */
public class TrafficLight {
    Lamp redLight;
    Lamp greenLight;

    /**
     * Constructor helps us initialize a traffic light with its red lamp on and
     * green lamp off.
     */
    TrafficLight() {
       this.redLight = new Lamp(true);
       this.greenLight = new Lamp(false);
    }

    /**
     * A void method that changes the status of the traffic light.
     */
    public void switchLight() {
        this.redLight.switchColor();
        this.greenLight.switchColor();
    }

    /**
     * A boolean method that
     * @return If the green lamp on traffic light is on(true) or (false).
     */
    public boolean isGreenOn() {
        return this.greenLight.isOn();
    }
}
