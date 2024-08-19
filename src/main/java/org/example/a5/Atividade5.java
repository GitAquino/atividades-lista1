package org.example.a5;

import java.util.Scanner;

public class Atividade5 {

    /*
    * Faça um programa que solicite ao usuário um número de 1 a 7, e imprima na
    * tela o dia da semana correspondente. Suponha que Segunda corresponde a 1 ,
    * Terça corresponde a 2, e assim por diante. Utilizando Array.
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] dia = {"Segunda",
                "Terça",
                "Quarta",
                "Quinta",
                "Sexta",
                "Sabado",
                "Domingo"};

        System.out.print("Informe o número do dia: ");
        int numeroDia = sc.nextInt();

        // Estrutura pra verificar se o número informado está dentre a quantidade total de dias (7)
        if (numeroDia >= 1 && numeroDia <= 7) {

            // Para imprimir o número, ele primeiro puxa o array (dia), depois ele puxa a posição [numeroDia-1]
            // É colocado numeroDia-1 devido a estrutura de arrays iniciar com o número 0
            System.out.println(dia[numeroDia-1]);
        }
        else{
            System.out.println("O número informado não faz parte dos dias da semana!");
        }

        sc.close();
    }
}