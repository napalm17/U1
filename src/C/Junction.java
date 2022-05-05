package C;

/**
 * Models a junction with its traffic lights:
 * @author ugpsy
 * @version 1.0
 */
public class Junction {
    TrafficLight trafficLight1;
    TrafficLight trafficLight2;
    TrafficLight trafficLight3;

    /**
     * Constructor helps us initialize a junction with its first two traffic lights on
     * and the final one off.
     */
    public Junction() {
        this.trafficLight1 = new TrafficLight();
        this.trafficLight2 = new TrafficLight();
        this.trafficLight3 = new TrafficLight();
        trafficLight1.switchLight();
        trafficLight2.switchLight();
    }

    /**
     * A void method that changes the status of all the traffic lights on the junction.
     * If the light on a traffic light is green, then it will be green and vice versa.
     */
    public void switchTrafficLightsStatus() {
        trafficLight1.switchLight();
        trafficLight2.switchLight();
        trafficLight3.switchLight();

    }
    /**
     * A boolean method that checks if a traffic light is safe to cross.
     * @param trafficLight One of the 3 traffic light's which is to be crossed.
     * @return if the green light is on(true) on the given traffic light
     */
    public boolean isSafe(TrafficLight trafficLight) {
        return trafficLight.isGreenOn();
    }
}
