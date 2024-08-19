package org.example.a10;

import java.util.Scanner;

public class Atividade10 {

    /*
    * Escreva uma classe que conte a quantidade de vogais, espaços em
    * brancos e consoantes de uma cadeia de caracteres.
    * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int vogais = 0, espacoBranco = 0, consoante = 0;

        System.out.println("Informe uma palavra ou frase: ");
        String caracteres = sc.nextLine();

        // Foi utilizado o toCharArray para transformar a string em um array de caracteres,
        // facilitando a verificação de cada uma das letras
        for (char v : caracteres.toCharArray()) {

            // Verifica se os caracteres são vogais
            if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u') {
                vogais++;
            }

            // Verifica se os caracteres são um espaço em branco
            else if (v == ' '){
                espacoBranco++;
            }

            // Verifica se os caracteres são consoantes (Deve ser utilizado por ultimo na estrutura,
            // pois se for utilizado antes de verificar as vogais, ele também contará as vogais como uma consoante,
            // porém visto que o programa já verificou se o char é uma vogal, ele contabiliza automaticamente como consoante).
            else if (v >= 'a' && v <= 'z'){
                consoante++;
            }
        }

        System.out.println("\nNúmero de vogais: " + vogais);
        System.out.println("Número de espaço em branco: " + espacoBranco);
        System.out.println("Número de consoantes: " + consoante);
    }
}
