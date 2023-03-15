package org.lesson.java.abstractanimals;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        //import
        Scanner input = new Scanner(System.in);
        Animale[] zoo = new Animale[4];


        for (int i = 0; i < zoo.length; i++) {
            boolean valid = true;

                System.out.println("Wich type of animal do you want to insert? a/d/p/c");
                String typeOfAnimal = input.nextLine();
                if (typeOfAnimal.equals("a")){
                    zoo[i] = new Aquila();
                }else if (typeOfAnimal.equals("d")){
                    zoo[i] = new Delfino();

                }else if (typeOfAnimal.equals("p")){
                    zoo[i] = new Passerotto();

                }else if (typeOfAnimal.equals("c")){
                    zoo[i] = new Cane();

                }else {
                    valid = false;
                }



        }
        for (Animale animale :zoo) {
            animale.dormi();
            animale.mangia();
            animale.verso();
            if (animale instanceof Aquila){
                ((Aquila)animale).faiVolare();
            } else if (animale instanceof Passerotto){
                ((Passerotto)animale).faiVolare();
            } else if (animale instanceof Delfino){
                ((Delfino)animale).faiNuotare();
            }
        }
    }
}
