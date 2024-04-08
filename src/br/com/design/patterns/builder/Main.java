package br.com.design.patterns.builder;

public class Main {

    public static void main(String[] args) {
        Framework framework = new FrameworkFullBuilder().getFramework();
        framework.run();
    }
}
