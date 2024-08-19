package org.example.a3;

import java.util.Scanner;

public class Atividade3 {

    /*
    * Crie uma classe e na função main() implemente um programa que lê um
    * número inteiro do teclado e imprime todos os números primos menores que ele
    * (divisíveis por 1 ou por ele mesmo).
    */


    public static boolean verificaPrimo(int num) {

        // True: Numero primo
        // False: Numero não primo

        // Verifica se o número é menor ou igual a 1 (Não primo), se é igual a 2 (Primo),
        // ou divisível por 2 (Não primo)
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        // Para números ímpares maiores que 2, o laço de repetição começa em 3 e verifica divisibilidade
        // até a raiz quadrada do número (i * i <= num), pulando pares (i += 2).
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Só entra no repetição caso o número possua números primos menores que ele mesmo
        // É necessário ser no mínimo o número 3
        if(numero <= 2){
            System.out.println("Não há numeros primos menores que " +numero+ "");
        }
        else{
            System.out.println("Números primos menores que " +numero+ ": ");

            // Verifica cada número a partir do 2 até o número informado pelo usuário
            for (int i = 2; i < numero; i++) {
                if (verificaPrimo(i)) {
                    System.out.println(i);
                }
            }
        }

        scanner.close();
    }
}
