/**
 * Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.
 *
 * Entrada
 * Você receberá 1 valor inteiro N, onde N > 0.
 *
 * Saída
 * Exiba todos os números pares até o valor de entrada, sendo um em cada linha.
 * Exemplo de Entrada	Exemplo de Saída
 * 6
 *                         2
 *                         4
 *                         6
 */
package br.com.dio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i=1; i<=n; i++)
            if (i%2 == 0)
                System.out.println(i);

    }
}
