package org.example.a8;

import java.util.Scanner;

public class Atividade8 {

    /*
    * Criar uma classe Java que receba uma palavra (String) retorne uma
    * mensagem caso a palavra fornecida seja uma palavra que pode ser lida
    * da esquerda pra direita, ou da direita pra esquerda obtendo-se a mesma palavra.
    * Ex.: Ana, arara, osso, etc.
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra="";

        System.out.println("Informe uma palavra: ");
        palavra = sc.nextLine();

        // O string builder foi optado para utilizar nessa ocasião devido
        // sua facilidade para manipulação de strings, sendo necessário apenas
        // utilizar um método (palavra.reverse) para inverter as letras da palavra
        StringBuilder palavraInvertida = new StringBuilder(palavra);
        palavraInvertida.reverse();

        // Entretanto, é necessário converter esse método atribuído para string
        // para que seja possível fazer a verificação de igualdade, visto que não
        // é possível comparar uma string com um método.
        if (palavra.equals(palavraInvertida.toString())) {
            System.out.println("A palavra de trás para frente mantém a mesma estrutura!");
        }
        else {
            System.out.println("A palavra de trás para frente NÃO mantém a mesma estrutura!");

        }

    }

}
