package br.com.design.patterns.criacional.prototype;

public class Main {

    public static void main(String[] args) {
        UserSession sessaoOriginal = new UserSession("User123");
        UserSession sessaoClonada = (UserSession) sessaoOriginal.clone();

        // Modificar as preferências do usuário clonado sem afetar o original
        sessaoClonada.getPreferencias().add("UseHighContrast");

        System.out.println("Original: " + sessaoOriginal);
        System.out.println("Clonada: " + sessaoClonada);
    }
}
