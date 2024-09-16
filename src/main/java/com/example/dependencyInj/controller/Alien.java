package com.example.dependencyInj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype")
public class Alien {
    private int aid;
    private String aname;
    private String lang;

    public Alien(){
        System.out.println("Alien Object Created");
    }

    @Autowired
    private Laptop lap;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", lang='" + lang + '\'' +
                '}';
    }

    public void show(){
        System.out.println("Alien show");
        lap.compile();
    }


}
