package com.example.dependencyInj.controller;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    private int lid;
    private String hardDrive;

    public void compile(){
        System.out.println("Compiling code");
    }
}
