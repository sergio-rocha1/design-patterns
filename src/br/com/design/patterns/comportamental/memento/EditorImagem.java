package br.com.design.patterns.comportamental.memento;

import java.time.LocalDate;

// Originator
public class EditorImagem {
    private String filePath;
    private String formato;

    public EditorImagem(String filePath, String formato) {
        this.filePath = filePath;
        this.formato = formato;
    }

    public void convertFormatTo(String novoFormato) {
        int lastIndexOfDot = this.filePath.lastIndexOf('.');
        if (lastIndexOfDot != -1) {
            // Se existe um ponto, substitui a parte após o último ponto pela nova extensão
            this.filePath = this.filePath.substring(0, lastIndexOfDot) + "." + novoFormato;
        } else {
            // Se não há ponto, apenas adiciona a extensão
            this.filePath += "." + novoFormato;
        }
        this.formato = novoFormato;
    }

    public Memento save() {
        LocalDate dataAtual = LocalDate.now();

        return new MementoConcreto("Memento-" + dataAtual.toString(), dataAtual, this.filePath, this.formato);
    }

    public void restore(Memento memento) {
        MementoConcreto mementoConcreto = (MementoConcreto) memento;
        this.filePath = mementoConcreto.getFilePath();
        this.formato = mementoConcreto.getFileFormat();
    }

    @Override
    public String toString() {
        return "Arquivo: " + this.filePath + " Formato: " + this.formato;
    }
}
