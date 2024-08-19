package org.example.a9;

import java.util.Scanner;

public class Atividade9 {

    /*
    * . Escreva uma classe para calcular a área de um círculo, sabendo que a área
    * é A = PI * r2, onde o raio (r) deve ser informado pelo usuário e o resultado terá
    * que ser arredondado
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do raio do círculo: ");
        double raio = sc.nextDouble();

        // Utilizada função Math.pow para elevar um determinado valor a uma determinada exponenciação
        double valorArea = 3.14159 * Math.pow(raio, 2);

        // Utilizada função Math.round para poder arredondar o valor ao número inteiro mais próximo
        System.out.println("O valor da área arredondado é: " + Math.round(valorArea));
    }

}
