package br.com.design.patterns.command;

import java.util.HashMap;
import java.util.Map;

public class SmartHouseApp {
    private final Map<String, SmartHouseCommand> commands = new HashMap<>(); // <key, command>

    public void addComand(String key, SmartHouseCommand command){
        commands.put(key, command);
    }

    public void executeCommand(String key) {
        commands.get(key).execute();
    }

    public void undoCommand(String key) {
        commands.get(key).undo();
    }
}
