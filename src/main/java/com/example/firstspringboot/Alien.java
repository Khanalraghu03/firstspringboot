package com.example.firstspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //create one obj: AKA singleton
@Scope(value = "prototype") //creates multiple obj AKA prototype
public class Alien {
    private int aID;
    private String aName;
    private String tech;
    //Autowired will look for Laptop by type
    @Autowired
    //Qualifier will look by name
    @Qualifier("lap1")
    private Laptop laptop;

    public Alien() {
        System.out.println("Object created...");
    }

    public int getaID() {
        return aID;
    }

    public void setaID(int aID) {
        this.aID = aID;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void show() {
        System.out.println("in show");
        laptop.compile();
    }
}