package com.koreait.talktalk.model;

import java.io.ObjectOutputStream;
import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int profileNum;
    transient private ObjectOutputStream oos;

    public User(String name, int profileNum, ObjectOutputStream oos){
        this.name = name;
        this.profileNum = profileNum;
        this.oos = oos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProfileNum() {
        return profileNum;
    }

    public void setProfileNum(int profileNum) {
        this.profileNum = profileNum;
    }

    public ObjectOutputStream getOos() {
        return oos;
    }

    public void setOos(ObjectOutputStream oos) {
        this.oos = oos;
    }
}
