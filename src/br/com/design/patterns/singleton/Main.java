package br.com.design.patterns.singleton;

public class Main {

    public static void main(String[] args) {
        LogSingleton instance = LogSingleton.getInstance();
        System.out.println(instance.toString());
        instance.enviarErro("Teste de erro");
        instance.enviarLog("Teste de log enviado");

        // Esse segundo objeto instanciado tem o mesmo toString, ou seja, o mesmo endereço apontado para o objeto "instance" de cima.
        LogSingleton instance2 = LogSingleton.getInstance();
        System.out.println(instance2.toString());
    }
}
