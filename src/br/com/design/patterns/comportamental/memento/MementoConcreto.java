package br.com.design.patterns.comportamental.memento;

import java.time.LocalDate;

public class MementoConcreto implements Memento {

    private String nome;
    private LocalDate data;
    private String filePath;
    private String fileFormato;

    public MementoConcreto(String nome, LocalDate data, String filePath, String fileFormato) {
        this.nome = nome;
        this.data = data;
        this.filePath = filePath;
        this.fileFormato = fileFormato;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public String getFileFormat() {
        return this.fileFormato;
    }

    @Override
    public String getName() {
        return this.nome;
    }

    @Override
    public LocalDate getDate() {
        return this.data;
    }
}
