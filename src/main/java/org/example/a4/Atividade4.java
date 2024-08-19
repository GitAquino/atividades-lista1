package org.example.a4;

import java.util.Scanner;

public class Atividade4 {

    /*
    * Pretende-se escrever um programa que leia do teclado uma distância
    * expressa em milhas, converte-a para quilômetros e apresenta o resultado no
    * console. (fórmula de conversão: 1 milha = 1.609 km).
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a distância em milhas que se deseja converter: ");
        double dist = sc.nextDouble();

        double distConvertida = dist * 1.609;

        System.out.println(dist+" milhas, são "+distConvertida+" quilômetros");
    }

}
