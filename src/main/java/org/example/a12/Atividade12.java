package org.example.a12;

import java.util.Scanner;

public class Atividade12 {

    /*
    * Os motoristas se preocupam com a quilometragem obtida por seus
    * automóveis. Um motorista monitorou vários tanques cheios de gasolina registrando a
    * quilometragem dirigida e a quantidade de combustível em litros utilizados para
    * cada tanque cheio.
    *
    * Desenvolva um aplicativo Java que receba como entrada os quilômetros dirigidos e os litros
    * de gasolina consumidos (ambos com inteiros) para cada tanque cheio.
    *
    * O programa deve calcular e exibir o consumo em quilômetros/litro para cada tanque cheio,
    * e imprimir a quilometragem combinada e a soma total de litros de combustível consumidos até esse ponto.
    *
    * Todos os cálculos de média devem produzir resultados de ponto flutuante.
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalQuilometragem = 0;
        int totalGasolinaGasta = 0;

        char continuar;

        // Estrutura para o usuário informar o tamanho do trecho percorrido e a quantidade de gasolina gasta
        do {
            System.out.println("Informe a quilometragem dirigida (Número inteiro): ");
            int quilometragemDirigida = sc.nextInt();
            System.out.println("Informe a quantia de gasolina gasta (Número inteiro): ");
            int gasolinaGasta = sc.nextInt();

            // Atribuição do total de quilometros percorridos e gasolina gasta para cada vez que a estrutura for realizada
            totalQuilometragem += quilometragemDirigida;
            totalGasolinaGasta += gasolinaGasta;

            // Pergunta ao usuário se deseja fazer outra verificação, caso ele tenha feito um percurso parceladamente
            // Dessa forma ele tem um controle mais aprofundado
            System.out.println("\nDeseja fazer uma outra verificação?");
            System.out.println("1 - Sim");
            System.out.println("Informe qualquer outro valor para sair");
            continuar = sc.next().charAt(0);
        }
        while (continuar == '1');

        // Realiza a media de quilometragem por litro feito
        float mediaKmPorLitro = (float) totalQuilometragem / totalGasolinaGasta;

        // Estrutura pra verificar se os dados são maiores do que 0, pois caso sejam igual ou menor a 0
        // não é possivel realizar os calculos
        if (totalGasolinaGasta>0 && totalQuilometragem>0) {
            System.out.println("\nAté o momento foram gastos: " + totalGasolinaGasta + " litros de gasolina");
            System.out.println("Até o momento foram dirigidos " + totalQuilometragem + " quilômetros");
            System.out.println("A média de quilômetros por litro é de " + mediaKmPorLitro);
        }
        else{
            System.out.println("\nDados insuficientes para realizar a média");
        }
    }

}
