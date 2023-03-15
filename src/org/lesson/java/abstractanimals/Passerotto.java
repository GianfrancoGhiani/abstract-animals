package org.lesson.java.abstractanimals;

public class Passerotto  extends Animale implements volatili{
    @Override
    public void vola() {
        System.out.println( "Sto volando!!!");
    }
    @Override
    public void verso() {
        System.out.println("Cinguetta");

    }

    @Override
    public void mangia() {
        System.out.println("Cereali/Semi");
    }
    public void faiVolare(){
        vola();
    }
}