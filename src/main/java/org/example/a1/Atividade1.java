package org.example.a1;

class Atividade1 {

    public static void main( String args[] ){
        int i = 5;
        int j = i;
        j = 10;
        System.out.println( "i + j = " + j + i );
    }

    /*
    * Retorno da questão: i + j = 105 devido o programa ter interpretado como concatenação de string
    * ao invés de soma aritmética. Para que seja interpretado como soma, deveria ter parenteses entre
    * as variáveis.
    *
    * Exemplo:
    * System.out.println( "i + j = " + (j + i) );
    */
}