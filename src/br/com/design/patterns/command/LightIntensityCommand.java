package br.com.design.patterns.command;

public class LightIntensityCommand implements SmartHouseCommand {
    private final SmartHouseLight light;

    public LightIntensityCommand(SmartHouseLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.aumentarIntensidade();
    }

    @Override
    public void undo() {
        light.diminuirIntensidade();
    }
}
