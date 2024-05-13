package br.com.design.patterns.bridge.remoteControl;

import br.com.design.patterns.bridge.device.DeviceImplementation;

public class ControleRemoto {
    protected DeviceImplementation device;

    public ControleRemoto(DeviceImplementation device) {
        this.device = device;
    }

    public void togglePower() {
        this.device.setPower(!this.device.getPower());
        System.out.println(this.device.getName() + " power status agora é: " + this.device.getPower());
    }
}
