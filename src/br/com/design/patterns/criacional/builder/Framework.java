package br.com.design.patterns.criacional.builder;

public class Framework {

    private String name;
    private String db;
    private String user;
    private String password;
    private boolean full;
    private boolean webpack;
    private boolean testes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public boolean isWebpack() {
        return webpack;
    }

    public void setWebpack(boolean webpack) {
        this.webpack = webpack;
    }

    public boolean isTestes() {
        return testes;
    }

    public void setTestes(boolean testes) {
        this.testes = testes;
    }

    public void run() {
        System.out.println("CRIADO O BANCO DE DADOS");
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " User: " + this.user + " Password: " + this.password;
    }
}
