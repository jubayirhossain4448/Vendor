package com.jubayir;

public class Test {

    public static void main(String[] args) {
        WildAnimal wolf = new WildAnimal("Long");
        WildAnimal tiger = new WildAnimal("Feline", 80, "Short");
        System.out.println(wolf.type + " " + wolf.maxSpeeed + " " + wolf.bounds);
        System.out.println(tiger.type + " " + tiger.maxSpeeed + " " + tiger.bounds);
    }

}
