package br.com.design.patterns.criacional.builder;

public interface BuilderInterface {
    void buildName();
    void buildDb();
    void buildWebpack();
    void buildFull();
    void buildTests();
}
