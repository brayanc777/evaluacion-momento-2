package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String jugador1, jugador2;
        Scanner lea = new Scanner(System.in);

        System.out.println("Seleccion jugador 1: ");
        jugador1 = lea.nextLine();
        System.out.println("Seleccion jugador 2: ");
        jugador2 = lea.nextLine();

        if (jugador1.equals(jugador2)) {
            System.out.println("***** EMPATE *****");
            if (jugador1.equals("piedra") && jugador2.equals("tijera")||
            jugador1.equals("tijera") && jugador2.equals("papel")||
            jugador1.equals("papel") && jugador2.equals("piedra")){
                System.out.println("***** JUGADOR 1 GANA *****");
            }
        }else{
            System.out.println("***** JUGADOR 2 GANA *****");
        }

    }
}