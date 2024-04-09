package br.com.design.patterns.command;

public class LightPowerCommand implements SmartHouseCommand {
    private final SmartHouseLight light;

    LightPowerCommand(SmartHouseLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}
