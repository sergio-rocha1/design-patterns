package br.com.design.patterns.bridge;

import br.com.design.patterns.bridge.device.TV;
import br.com.design.patterns.bridge.remoteControl.ControleRemoto;
import br.com.design.patterns.bridge.remoteControl.ControleRemotoComVolume;

public class Main {

    public static void main(String[] args) {
        TV tv = new TV();

        ControleRemoto controleRemoto = new ControleRemoto(tv);
        controlar(controleRemoto);

        ControleRemotoComVolume controleRemotoComVolume = new ControleRemotoComVolume(tv);
        controlar(controleRemotoComVolume);
    }

    private static void controlar(ControleRemoto controleRemoto) {
        controleRemoto.togglePower();

        if (controleRemoto instanceof ControleRemotoComVolume) {
            ((ControleRemotoComVolume) controleRemoto).aumentarVolume(); // 20
            ((ControleRemotoComVolume) controleRemoto).aumentarVolume(); // 30
            ((ControleRemotoComVolume) controleRemoto).abaixarVolume(); // 20
        }
    }
}
