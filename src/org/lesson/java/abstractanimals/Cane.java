package org.lesson.java.abstractanimals;

public class Cane  extends Animale {



    @Override
    void verso() {
        System.out.println("Abbaia");

    }
    @Override
    void mangia() {
        System.out.println("Carne");
    }
}