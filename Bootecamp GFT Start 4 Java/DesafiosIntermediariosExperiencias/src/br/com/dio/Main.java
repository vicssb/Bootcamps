/**
 * Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua
 * ajuda para organizar os experimentos de um laboratório o qual ela é responsável.
 * Ela quer saber no final do ano, quantas cobaias foram utilizadas no laboratório e o
 * percentual de cada tipo de cobaia utilizada.
 *
 * Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos.
 * Para obter estas informações, ela sabe exatamente o número de experimentos que foram
 * realizados, o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.
 *
 * Entrada
 * A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste
 * que vem a seguir. Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa
 * a quantidade de cobaias utilizadas e um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de
 * cobaia (R:Rato S:Sapo C:Coelho).
 *
 * Saída
 * Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o
 * percentual de cada uma em relação ao total de cobaias utilizadas, sendo que o percentual
 * deve ser apresentado com dois dígitos após o ponto.
 *
 * Exemplo de Entrada	Exemplo de Saída
 * 10
 * 10 C
 * 6 R
 * 15 S
 * 5 C
 * 14 R
 * 9 C
 * 6 R
 * 8 S
 * 5 C
 * 14 R
 *
 * Total: 92 cobaias
 * Total de coelhos: 29
 * Total de ratos: 40
 * Total de sapos: 23
 * Percentual de coelhos: 31.52 %
 * Percentual de ratos: 43.48 %
 * Percentual de sapos: 25.00 %
 */
package br.com.dio;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int totalCobaias=0;
        int TotalCoelhos=0,TotalRatos=0,TotalSapos=0,i,t;
        int NTestes=input.nextInt();
        String tipoCobaia;

        //******************     N casos de teste
        for (i=0;i<NTestes;i++){
            t=input.nextInt();
            tipoCobaia= input.next();
            // ************* poderia usar switch
            if (tipoCobaia.equals("C"))
                TotalCoelhos+=t;
            if (tipoCobaia.equals("R"))
                TotalRatos+=t;
            if (tipoCobaia.equals("S"))
                TotalSapos+=t;

            totalCobaias+=t;

        }//for

        System.out.println("Total: "+totalCobaias+" cobaias");
        System.out.println("Total de coelhos: "+TotalCoelhos);
        System.out.println("Total de ratos: "+TotalRatos);
        System.out.println("Total de sapos: "+TotalSapos);

        double x;
        DecimalFormat df = new DecimalFormat("0.00");

        //System.out.println("Percentual de coelhos: ");
        x = TotalCoelhos*100.00/totalCobaias;
        System.out.println("Percentual de coelhos: "+df.format(x)+" %");
        //System.out.println("Percentual de ratos: ");
        x = TotalRatos*100.0/totalCobaias;
        System.out.println("Percentual de ratos: "+df.format(x)+" %");
        //System.out.println("Percentual de sapos: ");
        x = TotalSapos*100.0/totalCobaias;
        System.out.println("Percentual de sapos: "+df.format(x)+" %");

    }
}