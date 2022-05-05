package C;

public class TrafficLight {
    Light redLight;
    Light greenLight;
    TrafficLight() {
       this.redLight = new Light(true);
       this.greenLight = new Light(false);
    }
    public void switchLight() {
        this.redLight.changeLightStatus();
        this.greenLight.changeLightStatus();
    }
    public boolean isGreenOn() {
        return this.greenLight.isOn();
    }

}
