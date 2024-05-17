package br.com.design.patterns.criacional.builder;

public class Main {

    public static void main(String[] args) {
        Framework framework = new FrameworkFullBuilder().getFramework();
        framework.run();
    }
}
