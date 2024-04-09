package br.com.design.patterns.command;

public class SmartHouseLight {

    private boolean isOn = false;
    private int intensity = 50;
    private final String name;

    SmartHouseLight(String name) {
        this.name = name;
    }
    public String getPowerStatus() {
        return this.isOn ? "ON" : "OFF";
    }

    public int getIntensity() {
        return this.intensity;
    }

    public boolean turnOn() {
        this.isOn = true;
        System.out.println(this.name + " agora está: " + getPowerStatus());
        return this.isOn;
    }

    public boolean turnOff() {
        this.isOn = false;
        System.out.println(this.name + " agora está: " + getPowerStatus());
        return this.isOn;
    }

    public void aumentarIntensidade() {
        int newIntensity = this.intensity + 10;
        if(this.intensity <= 100 && newIntensity <= 100) {
            this.intensity += 10;
            System.out.println("A intensidade da " + this.name + " agora é: " + this.intensity);
        }
    }

    public void diminuirIntensidade() {
        int newIntensity = this.intensity - 10;
        if(this.intensity >= 0 && newIntensity >= 0) {
            this.intensity -= 10;
            System.out.println("A intensidade da " + this.name + " agora é: " + this.intensity);
        }
    }
}
