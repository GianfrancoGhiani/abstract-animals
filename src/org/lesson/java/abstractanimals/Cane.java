package org.lesson.java.abstractanimals;

public class Cane  extends Animale {



    @Override
    public void verso() {
        System.out.println("Abbaia");

    }
    @Override
    public void mangia() {
        System.out.println("Carne");
    }
}