package org.lesson.java.abstractanimals;

public class Passerotto  extends Animale implements volatili{
    @Override
    public void vola() {
        System.out.println( "Sto volando!!!");
    }
    @Override
    void verso() {
        System.out.println("Cinguetta");

    }

    @Override
    void mangia() {
        System.out.println("Cereali/Semi");
    }
    void faiVolare(){
        vola();
    }
}