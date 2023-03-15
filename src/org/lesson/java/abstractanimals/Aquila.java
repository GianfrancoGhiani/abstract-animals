package org.lesson.java.abstractanimals;

public class Aquila extends Animale implements volatili {


    @Override
    public void vola() {
        System.out.println( "Sto volando!!!");
    }

    @Override
    void verso() {
        System.out.println("Stride");
    }

    @Override
    void mangia() {
        System.out.println("Carne");
    }
    public void faiVolare(){
        vola();
    }
}
