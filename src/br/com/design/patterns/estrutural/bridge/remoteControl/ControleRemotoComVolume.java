package br.com.design.patterns.estrutural.bridge.remoteControl;

import br.com.design.patterns.estrutural.bridge.device.DeviceImplementation;

public class ControleRemotoComVolume extends ControleRemoto {

    public ControleRemotoComVolume(DeviceImplementation device) {
        super(device);
    }

    public void aumentarVolume() {
        int oldVolume = this.device.getVolume();

        this.device.setVolume(oldVolume + 10);

        System.out.println(this.device.getName() + " tinha o volume " + oldVolume + " e agora tem " + this.device.getVolume());
    }

    public void abaixarVolume() {
        int oldVolume = this.device.getVolume();

        this.device.setVolume(oldVolume - 10);

        System.out.println(this.device.getName() + " tinha o volume " + oldVolume + " e agora tem " + this.device.getVolume());
    }

}
