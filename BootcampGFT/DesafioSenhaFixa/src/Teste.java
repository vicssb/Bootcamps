/**
 * Escreva um programa que repita a leitura de uma senha até que ela seja válida.
 * Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida".
 * Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido"
 * e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
 *
 * Entrada
 * A entrada é composta por vários casos de testes contendo valores inteiros.
 *
 * Saída
 * Para cada valor lido mostre a mensagem correspondente à descrição do problema.
 *
 *
 * Exemplo de Entrada	Exemplo de Saída
 * 2200                 Senha Invalida
 * 1020                 Senha Invalida
 * 2022                 Senha Invalida
 * 2002                 Acesso Permitido
 *
 *
 * Formatação e inserção no portal por Cássio Favaretto.
 */

import java.io.IOException;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) throws IOException {
        int SENHA_CORRETA=2002;
        int senha;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a senha:");
        senha = leitor.nextInt();

        while (senha != SENHA_CORRETA){
            System.out.println("Senha Invalida");
            System.out.println("Digite a senha:");
            senha = leitor.nextInt();
        }
        System.out.println("Acesso Permitido");
    }
}