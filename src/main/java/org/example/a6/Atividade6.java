package org.example.a6;

public class Atividade6 {

    /*
    * Imprima produto dos números de ímpares de 15 a 30, usando os tipos de dados int e float.
    * */

    public static void main(String[] args) {

        int produtoInt = 1;
        float produtoFloat = 1.0f;

        for (int i = 15; i <= 30; i++) {

            // Estrutura para verificar se o número é impar, se a divisão dele por 2 não resultar em modulo 0,
            // a multiplicação é realizada e atualiza o valor de produto atual.
            if (i % 2 != 0) {
                produtoInt *= i;
                produtoFloat *= i;
            }
        }

        // O valor do int estourou devido ao tamanho do número
        System.out.println("Produto dos números ímpares de 15 a 30 (int): " + produtoInt);
        // Devido ao número ser muito grande, o float perde a precisão
        System.out.println("Produto dos números ímpares de 15 a 30 (float): " + produtoFloat);
    }

}
