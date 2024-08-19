package org.example.a2;

import java.util.Scanner;

public class Atividade2 {

    /*
    * Faça um programa que receba 2 valores e retorne o maior entre eles
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("N1: Informe um número inteiro");
        int n1 = sc.nextInt();
        System.out.println("N2: Informe outro número inteiro:");
        int n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println("N1("+n1+") é maior que N2("+n2+")");
        }
        else if (n2 > n1) {
            System.out.println("N2("+n2+") é maior que N1("+n1+")");
        }
        else{
            System.out.println("Números iguais!");
        }
    }
}
