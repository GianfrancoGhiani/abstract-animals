package org.lesson.java.abstractanimals;

public class Delfino  extends Animale implements nuotatore {

    @Override
    public void nuota() {
        System.out.println( "Sto nuotando!!!");
    }
    @Override
    void verso() {
        System.out.println("emette 'clicks'");
    }
    @Override
    void mangia() {
        System.out.println("Pesci");
    }
    void faiNuotare(){
        nuota();
    }
}