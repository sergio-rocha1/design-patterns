package br.com.design.patterns.memento;

public class Main {

    public static void main(String[] args) {
        EditorImagem editorImagem = new EditorImagem("/media/image.png", "png");

        EditorImagemBackupManager backupManager = new EditorImagemBackupManager(editorImagem);

        backupManager.backup();
        editorImagem.convertFormatTo("gif");

        backupManager.backup();
        editorImagem.convertFormatTo("bmp");

        backupManager.backup();
        editorImagem.convertFormatTo("jpg");

        System.out.println(editorImagem); // jpg

        backupManager.undo();
        System.out.println(editorImagem); // bmp

        backupManager.undo();
        System.out.println(editorImagem); // gif

        backupManager.undo();
        System.out.println(editorImagem); // png

        backupManager.undo(); // Sem mementos

    }
}
