package C;

public class Junction {
    TrafficLight trafficLight1;
    TrafficLight trafficLight2;
    TrafficLight trafficLight3;
    public Junction() {
        this.trafficLight1 = new TrafficLight();
        this.trafficLight2 = new TrafficLight();
        this.trafficLight3 = new TrafficLight();
        trafficLight1.switchLight();
        trafficLight2.switchLight();
    }
    public void switchTrafficLightsStatus() {
        trafficLight1.switchLight();
        trafficLight2.switchLight();
        trafficLight3.switchLight();

    }
    public boolean isSafe(TrafficLight trafficLight) {
        return trafficLight.isGreenOn();
    }
}
