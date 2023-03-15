package org.lesson.java.abstractanimals;

public class Aquila extends Animale {


    @Override
    void verso() {
        System.out.println("Stride");
    }

    @Override
    void mangia() {
        System.out.println("Carne");
    }
}
