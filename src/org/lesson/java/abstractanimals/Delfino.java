package org.lesson.java.abstractanimals;

public class Delfino  extends Animale implements nuotatore {

    @Override
    public void nuota() {
        System.out.println( "Sto nuotando!!!");
    }
    @Override
    public void verso() {
        System.out.println("emette 'clicks'");
    }
    @Override
    public void mangia() {
        System.out.println("Pesci");
    }
    public void faiNuotare(){
        nuota();
    }
}