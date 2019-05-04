package com.example.firstspringboot;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    private int lID;
    private int ram;
    private String name;

    public int getlID() {
        return lID;
    }

    public void setlID(int lID) {
        this.lID = lID;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void compile() {
        System.out.println("Compiling...");
    }
}
