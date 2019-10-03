package com.cognizant;

public class Main {

    public static void main(String[] args) {
        Animal elephant = new Animal(4,12,false, "Elephant");

        System.out.println(elephant.getName());
        System.out.println(elephant.getNumLegs());

        elephant.setEndangered(true);



    }
}
