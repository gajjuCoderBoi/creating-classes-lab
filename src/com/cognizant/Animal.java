package com.cognizant;

public class Animal {

    private int numLegs, topSpeed;
    private boolean isEndangered;
    private String name;

    @Override
    public String toString() {
        return "The "+getName()+" has a top speed of "+getTopSpeed()+" mph.";
    }

    public Animal(int numLegs, int topSpeed, boolean isEndangered, String name) {
        setNumLegs(numLegs);
        setTopSpeed(topSpeed);
        setEndangered(isEndangered);
        setName(name);
    }


    public int getNumLegs() {
        return numLegs;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public boolean isEndangered() {
        return isEndangered;
    }

    public void setEndangered(boolean endangered) {
        isEndangered = endangered;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
