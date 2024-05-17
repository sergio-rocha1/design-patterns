package br.com.design.patterns.comportamental.command;

public class Main {

    public static void main(String[] args) {
        // Receiver
        SmartHouseLight bedroomLight = new SmartHouseLight("Luz Quarto");
        SmartHouseLight bathrommLight = new SmartHouseLight("Luz Banheiro");

        // Command
        LightPowerCommand bedroomLightPowerCommand = new LightPowerCommand(bedroomLight);
        LightPowerCommand bathroomLightPowerCommand = new LightPowerCommand(bathrommLight);
        LightIntensityCommand bedroomLightIntensityCommand = new LightIntensityCommand(bedroomLight);

        // Controle - Invoker
        SmartHouseApp smartHouseApp = new SmartHouseApp();
        smartHouseApp.addComand("btn-1", bedroomLightPowerCommand);
        smartHouseApp.addComand("btn-2", bathroomLightPowerCommand);
        smartHouseApp.addComand("btn-3", bedroomLightIntensityCommand);

        smartHouseApp.executeCommand("btn-1");
        smartHouseApp.undoCommand("btn-1");

        smartHouseApp.executeCommand("btn-2");
        smartHouseApp.undoCommand("btn-2");

        for(int i = 0; i < 10; i++) {
            smartHouseApp.executeCommand("btn-3");
        }

        for(int i = 0; i < 100; i++) {
            smartHouseApp.undoCommand("btn-3");
        }
    }
}
