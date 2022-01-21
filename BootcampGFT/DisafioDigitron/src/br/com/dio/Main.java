/**
 * Desafio
 * Após os rivais Bruno e Guarte capturarem alguns Digitrons, eles resolveram batalhar
 * entre eles. Então decidiram fazer isso de uma forma simples, com combates no modo 1x1
 * e vencendo quem tem o Digitron com maior valor de golpe, que é definido da seguinte forma:
 *
 * O Bônus será dado ao Digitron do treinador que estiver em um level de valor par.
 *
 * Neste problema será dado a você o valor do bônus aplicado, os valores de ataque e defesa
 * do Digitron de Bruno e Guarte e seus respectivos níveis, cabe a você informar o vencedor da batalha.
 */

package br.com.dio;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int T = leitor.nextInt();
        int B, A1, D1, L1, A2, D2, L2, V1, V2;
        for (int i = 0; i < T; i++) {
            B = leitor.nextInt();
            A1 = leitor.nextInt();
            D1 = leitor.nextInt();
            L1 = leitor.nextInt();
            A2 = leitor.nextInt();
            D2 = leitor.nextInt();
            L2 = leitor.nextInt();

            V1 = (            ) + (L1 % 2 == 0 ? B : 0);
            V2 = (            ) + (L2 % 2 == 0 ? B : 0);

            if (           ) System.out.println("Bruno");
            else if (         ) System.out.println("Guarte");
            else System.out.println("Empate");
        }
}
