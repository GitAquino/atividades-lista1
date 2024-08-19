package org.example.a11;

import java.util.Scanner;

public class Atividade11 {

    /*
    * Escreva um programa que tenha duas palavras como entrada, e a saída
    * imprima as palavras em ordem alfabética (utilize o método compareTo da
    * classe String),. Informe também, qual das palavras tem o maior número de
    * caracteres
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira string: ");
        String palavra1 = sc.nextLine();
        System.out.println("Digite a segunda string: ");
        String palavra2 = sc.nextLine();



        // Estrutura utilizando o compareTo, onde ele verifica se a palavra1 inicia com uma letra que venha antes da
        // inicial da palavra dois, se iniciar ela cai na primeira exceção, se não, ela cai na segunda, ou se caso sejam iguais,
        // ela cai na terceira exceção
        if (palavra1.compareTo(palavra2) < 0) {
            System.out.println("Ordem alfabética: " + palavra1 + ", " + palavra2);
        } else if (palavra1.compareTo(palavra2) > 0) {
            System.out.println("Ordem alfabética: " + palavra2 + ", " + palavra1);
        } else {
            System.out.println("As palavras são iguais: " + palavra1);
        }

        // Estrutura para verificar o tamanho dos caracteres
        if (palavra1.length() > palavra2.length()) {
            System.out.println(palavra1+"("+(palavra1.length()+")"+" possui mais caracteres que "+palavra2+"("+(palavra2.length()+")")));
        }
        else if (palavra1.length() < palavra2.length()) {
            System.out.println(palavra2+"("+(palavra2.length()+")"+" possui mais caracteres que "+palavra1+"("+(palavra1.length()+")")));
        }
        else {
            System.out.println("As palavras possuem o mesmo número de caracteres");
        }
    }

}
