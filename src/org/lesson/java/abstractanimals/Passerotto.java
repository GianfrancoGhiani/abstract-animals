package org.lesson.java.abstractanimals;

public class Passerotto  extends Animale {

    @Override
    void verso() {
        System.out.println("Cinguetta");

    }

    @Override
    void mangia() {
        System.out.println("Cereali/Semi");
    }
}