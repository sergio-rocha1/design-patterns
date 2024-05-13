package br.com.design.patterns.bridge.device;

public interface DeviceImplementation {
    String getName();
    void setPower(boolean powerStatus);
    boolean getPower();
    void setVolume(int volume);
    int getVolume();
}
