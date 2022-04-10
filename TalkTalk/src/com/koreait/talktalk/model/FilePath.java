package com.koreait.talktalk.model;

public enum FilePath {
    PROFILEPATH("profile/"),
    DOWNLOADFILEPATH("download/");

    private final String path;

    private FilePath(final String path){
        this.path = path;
    }

    public String toString(){
        return path;
    }
}
