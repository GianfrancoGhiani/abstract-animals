package org.lesson.java.abstractanimals;

public class Delfino  extends Animale {


    @Override
    void verso() {
        System.out.println("emette 'clicks'");
    }
    @Override
    void mangia() {
        System.out.println("Pesci");
    }
}