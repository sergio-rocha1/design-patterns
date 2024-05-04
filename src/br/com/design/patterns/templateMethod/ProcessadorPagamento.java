package br.com.design.patterns.templateMethod;

public abstract class ProcessadorPagamento {

    public void processarPagamento() {
        preparar();
        validar();
        debitar();
        notificar();
        notificarAdicional(); // Hooks
        finalizar();
        finalizarAdicional(); // Hooks
    }

    // Método que todas as classes estendidas precisam implementar
    protected abstract void debitar();

    private void preparar() {
        System.out.println("Reservando produtos");
    }

    private void validar(){
        System.out.println("Validando cadastro");
    }

    protected void notificar() {
        System.out.println("Notificando usuário");
    }

    // Hook de notificação adicional
    protected void notificarAdicional() {
    }

    private void finalizar() {
        System.out.println("Finalizando compra");
    }

    // Hook de finalização adicional
    protected void finalizarAdicional() {
    }

}
