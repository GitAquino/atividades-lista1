package org.example.a7;

public class Atividade7 {

    /*
    * Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e
    * 100, usando os tipos de dados int e double .
    * */

    // Laço imprimindo os valores inteiros divisíveis por 3
    public static void main(String[] args) {
        for (int i = 1; i<= 100; i++){
            if (i % 3 == 0){
                System.out.println("Resultado com int: "+i/2);
            }
        }

        // Linha para separar os valores
        System.out.println("");

        // Laço para imprimir os valores com ponto flutuante
        // A precisão do valor é mais exata utilizando esse tipo
        for (double i = 1; i<= 100; i++){
            if (i % 3 == 0){
                System.out.println("Resultado com double: "+i/2);
            }
        }
    }
}
