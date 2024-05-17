package br.com.design.patterns.criacional.singleton;

public class LogSingleton {

    private static LogSingleton instance = null;

    private LogSingleton() {}

    public static LogSingleton getInstance() {
        if(instance == null) {
            instance = new LogSingleton();
        }
        return instance;
    }

    public void enviarLog(String mensagem) {
        System.out.println("\n[LOG] - " + mensagem);
    }

    public void enviarErro(String mensagem) {
        System.out.println("\n[ERROR] - " + mensagem);
    }
}
