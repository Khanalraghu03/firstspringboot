package com.example.firstspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Alien {
    private String aID;
    private String aName;
    @Autowired
    private Laptop l1;

    public Alien() {
        super();
        System.out.println("Object created...");
    }

    public String getaID() {
        return aID;
    }

    public void setaID(String aID) {
        this.aID = aID;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public Laptop getL1() {
        return l1;
    }

    public void setL1(Laptop l1) {
        this.l1 = l1;
    }

    public void show() {
        System.out.println("in show");
        l1.compile();
    }
}