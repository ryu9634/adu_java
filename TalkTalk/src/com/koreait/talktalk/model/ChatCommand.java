package com.koreait.talktalk.model;

public enum ChatCommand {
    WHISPER("/w");

    private final String command;

    private ChatCommand(String command){
        this.command = command;
    }

    public String toString(){
        return command;
    }
}
