/**
 * Números em ponto flutuante podem ser bastante extensos para mostrar. Nesses casos,
 * é conveniente usar a notação científica.
 *
 * Você deve escrever um programa que, dado um número em ponto flutuante, mostre este
 * número na notação científica: sempre mostre o sinal da mantissa; sempre mostre 4
 * casas decimais na mantissa; use o caractere 'E' para separar a mantissa do expoente;
 * sempre mostre o sinal do expoente; e mostre o expoente com pelo menos 2 dígitos.
 *
 * Entrada
 *A entrada é um número em ponto flutuante de dupla precisão X (de acordo com o
 * padrão IEEE 754-2008). Nunca haverá um número com mais de 110 caracteres nem
 * com mais de 6 casas decimais.
 *
 * Saída
 * A saída é o número X em uma única linha na notação científica detalhada acima.
 * Veja os exemplos abaixo.
 *
 *
 * Exemplos de Entrada	        Exemplos de Saída
 * 3.141592                     +3.1416E+00
 *
 * 1.618033                     +1.6180E+00
 *
 *
 * 602214085774747474747474     +6.0221E+23
 *
 *
 * -0.000027                    -2.7000E-05
 *
 *
 * -10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
 *
 * -1.0000E+100
 *
 * Prova 1 de Programação de Computadores da UNILA (2015/2)
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */
package br.com.dio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //Escreva aqui o seu código

        DecimalFormat df = new DecimalFormat("0.0000E00");

        double n;
        int sinalExpoente,  separador;
        String numeroLido,resposta = "",num, mantissa, expoente;

        numeroLido = leitor.next();
        n=Double.parseDouble(numeroLido);
        num = df.format(n);

        //============ CALCULO =====================

        //****************   sinalMantissa
        if (n>0)
            resposta+="+";


        //****************   Mantissa
        separador = num.indexOf("E");
        mantissa = num.substring(0,separador);
        resposta+=mantissa;

        //****************   Expoente
        expoente= num.substring(separador+1,num.length());

        if (num.charAt(separador+1)!= '-')
            resposta+="E+";
        else
            resposta+="E";
        resposta+=expoente;



        //========== RESPOSTA ==================
        System.out.println("O numero: "+numeroLido);
        System.out.println("Escrito em notacao cientifica:"+resposta);



    }
}
