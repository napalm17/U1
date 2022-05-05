package C;

public class Light {
    private boolean isOn;
    Light(boolean isOn) {
        this.isOn = isOn;
    }
    public void changeLightStatus() {
        this.isOn = !(this.isOn);
    }
    public boolean isOn() {
        return this.isOn;
    }
}
