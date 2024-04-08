package br.com.design.patterns.builder;

public class FrameworkFullBuilder implements BuilderInterface {

    private final Framework framework;

    FrameworkFullBuilder() {
        framework = new Framework();
        this.buildFull();
        this.buildDb();
        this.buildName();
        this.buildTests();
        this.buildWebpack();
        this.buildTests();
    }

    public Framework getFramework() {
        return framework;
    }

    @Override
    public void buildName() {
        framework.setName("My project");
    }

    @Override
    public void buildDb() {
        framework.setDb("mysql");
        framework.setUser("root");
        framework.setPassword("root");
    }

    @Override
    public void buildWebpack() {
        framework.setWebpack(true);

    }

    @Override
    public void buildFull() {
        framework.setFull(true);
    }

    @Override
    public void buildTests() {
        framework.setTestes(true);
    }
}
