package br.com.design.patterns.estrutural.facade.interfaces;

public interface DvdPlayer {
    void on();
    void stop();
    void off();
    void play(String filme);
}
