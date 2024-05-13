package br.com.design.patterns.memento;

import java.util.ArrayList;
import java.util.List;

public class EditorImagemBackupManager {

    private final List<Memento> mementos = new ArrayList<>();
    private EditorImagem editorImagem;

    public EditorImagemBackupManager(EditorImagem editorImagem) {
        this.editorImagem = editorImagem;
    }

    public void backup() {
        System.out.println("BACKUP: Salvando o estado de EditorImagem");
        mementos.add(editorImagem.save());
    }

    public void undo() {
        int indexMemento = mementos.size() - 1;

        Memento ultimoMemento = null;

        if(indexMemento >= 0) {
            ultimoMemento = mementos.remove(indexMemento);
        }
        if (ultimoMemento == null) {
            System.out.println("BACKUP: Nenhum backup encontrado!");
            return;
        }

        this.editorImagem.restore(ultimoMemento);
        System.out.println("BACKUP: " + ultimoMemento.getName() + " foi restaurado com sucesso!");
    }

    public void mostrarMementos() {
        for (Memento memento : mementos) {
            System.out.println("\n" + memento.getName());
        }
    }
}
