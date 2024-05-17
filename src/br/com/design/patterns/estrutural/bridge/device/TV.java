package br.com.design.patterns.estrutural.bridge.device;

public class TV implements DeviceImplementation {

    private int volume = 10;
    private boolean powerStatus = false;
    private String name = "TV";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setPower(boolean powerStatus) {
        this.powerStatus = powerStatus;
    }

    @Override
    public boolean getPower() {
        return this.powerStatus;
    }

    @Override
    public void setVolume(int volume) {
        if(volume < 0 || volume > 100) return;

        this.volume = volume;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }
}
