/**
 * Desafio
 * O senhor Milli, morador da cidade Petland, é o famoso proprietário da maior fábrica de jogos de tabuleiros do mundo.
 *
 * Recentemente, ele teve a ideia de lançar um novo jogo exclusivo de tabuleiro, que ele apelidou de Tabuleiro da Frequência.
 *
 * O jogo ocorre da seguinte forma. Inicialmente, um tabuleiro com dimensões N × N é dado contendo apenas 0’s.
 * Depois disso, Q operações são propostas, podendo ser de 4 tipos:
 *
 1 X R: Atribuir o valor R a todos os números da linha X;

 2 X R: Atribuir o valor R a todos os números da coluna X;

 3 X: Imprimir o valor mais frequente na linha X;

 4 X: Imprimir o valor mais frequente da coluna X.

 Milli não é muito bom com computadores, mas é bastante preguiçoso. Sabendo que você é um dos melhores
 programadores do mundo, ele precisa sua ajuda para resolver este problema.

 Entrada
 A primeira linha da entrada é composta por dois inteiros N e Q (1 ≤ N, Q ≤ 105), representando,
 respectivamente, o tamanho do tabuleiro e a quantidade de operações. As próximas Q linhas da entrada
 vão conter as Q operações. O primeiro inteiro de cada linha vai indicar o tipo da operação.
 Caso seja 1 ou 2, será seguido por mais dois inteiros X (1 ≤ X ≤ N) e R (0 ≤ R ≤ 50).
 Caso seja 3 ou 4, será seguido por apenas mais um inteiro X.

 Saída
 Para cada operação do tipo 3 ou 4, seu programa deve produzir uma linha, contendo o valor da resposta correspondente. Se uma linha ou coluna tiver dois ou mais valores que se repetem o mesmo número de vezes, você deve imprimir o maior deles. Por exemplo, se uma linha tem os valores [5,7,7,2,5,2,1,3], tanto o 2, 5 e 7 se repetem duas vezes, então a resposta será 7, pois é o maior deles.


 Exemplo de Entrada	Exemplo de Saída
 2 4                2

 1 1 1              2

 2 2 2

 3 1

 3 2

 Exemplo de Entrada	Exemplo de Saída
 3 6                4

 1 1 2              3

 1 2 3

 1 3 4

 4 3

 1 3 0

 4 3

 */
package br.com.dio;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Main {

    public static void main(String[] args) throws IOException {

        int N = 0;//o tamanho do tabuleiro
        int Q = 0;//a quantidade de operações


//        char[] array = new char[100];

        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        //BufferedReader br = new BufferedReader(isr);


        //ArrayList<String> array = new ArrayList<>();


        //System.out.print("Digite o  tamanho do tabuleiro e a quantidade de operações: ");

        try {
           // br = new BufferedReader(isr);
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
            String line = br.readLine();

                //String[] lineValues = line.split(" ");
            String[] array = line.split(" ");
            line = br.readLine();

            N = Integer.parseInt(array[0]);
            Q = Integer.parseInt(array[1]);
//            System.out.println("Valor lido de N = "+N);
//            System.out.println("Valor lido de Q = "+Q);

            //************** preencher a matriz ***************
            int[][] matriz = new int[N][N];
            for (int i=0; i<N; i++) {
                for (int j = 0; j < N; j++) {
                    matriz[i][j] = 0;
                }
            }

            //*********** leitura das operaçõe *******************
            for (int i=0;i<Q;i++) {
               // line = br.readLine();
                //lineValues = line.split(" ");
                String[] lineValues = line.split(" ");
                line = br.readLine();

                int tipoOperacao = Integer.parseInt(lineValues[0]);

//                System.out.println("tipoOperacao " + tipoOperacao);

                switch (tipoOperacao){
                    case 1:
                        int x = Integer.parseInt(lineValues[1]);
                        int r = Integer.parseInt(lineValues[2]);
                        atribuirRLinhaX(r, x,matriz);
                        break;
                    case 2:
                        x = Integer.parseInt(lineValues[1]);
                        r = Integer.parseInt(lineValues[2]);
                        atribuirRColunaX(r, x,matriz);
                        break;
                    case 3:
                        x = Integer.parseInt(lineValues[1]);
                        frequenciaLinhaX(x,matriz);
                        break;
                    case 4:
                        x = Integer.parseInt(lineValues[1]);
                        frequenciaColunaX(x, matriz);
                        break;
                }

            }// for
            br.close();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }


    }//main

    //1 X R: Atribuir o valor R a todos os números da linha X;
    private static void atribuirRLinhaX(int r, int x, int[][] matriz){
//        System.out.println("r= "+r);
//        System.out.println("x= "+x);
        for (int j=0; j<matriz.length; j++){
            matriz[x-1][j]=r;
        }
//        System.out.println(matriz.toString());
    }

    //2 X R: Atribuir o valor R a todos os números da coluna X;
    private static void atribuirRColunaX(int r, int x, int[][] matriz) {
//        System.out.println("r= " + r);
//        System.out.println("x= " + x);
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][x - 1] = r;
        }
    }

    //3 X: Imprimir o valor mais frequente na linha X;
    private static void frequenciaLinhaX(int x, int[][] matriz){
        Map<Integer, Integer> mapFreq = new HashMap<>();
        mapFreq.put(matriz[x-1][0], 1);

        for (int i = 1; i < matriz.length; i++) {
            if(mapFreq.containsKey(matriz[x-1][i])){
                mapFreq.put(matriz[x-1][i], mapFreq.get(matriz[x-1][i])+1);
            } else {
                mapFreq.put(matriz[x-1][i], 1);
            }
        }

        var key = mapFreq.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();

        if(mapFreq.get(key) == 1){
            key = mapFreq.entrySet().stream().max((entry1, entry2) -> entry1.getKey() > entry2.getKey() ? 1 : -1).get().getKey();
        }

        System.out.println("frequenciaLinhaX"+key);
    }

    //4 X: Imprimir o valor mais frequente na coluna X;
    private static void frequenciaColunaX(int x, int[][] matriz){
        Map<Integer, Integer> mapFreq = new HashMap<>();
        mapFreq.put(matriz[0][x-1], 1);

        for (int i = 1; i < matriz.length; i++) {
            if(mapFreq.containsKey(matriz[i][x-1])){
                mapFreq.put(matriz[i][x-1], mapFreq.get(matriz[i][x-1])+1);
            } else {
                mapFreq.put(matriz[i][x-1], 1);
            }
        }

        var key = mapFreq.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();

        if(mapFreq.get(key) == 1){
            key = mapFreq.entrySet().stream().max((entry1, entry2) -> entry1.getKey() > entry2.getKey() ? 1 : -1).get().getKey();
        }

        System.out.println("frequenciaColunaX"+key);
    }


}
