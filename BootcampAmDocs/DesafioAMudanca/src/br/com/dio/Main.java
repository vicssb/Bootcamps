package br.com.dio;
/**
 * 0<=graus<90
 *  Bom Dia!!
 *
 * 90<=graus<180
 *  Boa Tarde!!
 *
 * 180<=graus<270
 *  Boa Noite!!
 *
 * 270<=graus<360
 *  De Madrugada!!
 */

import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext()) {
            int graus = leitor.nextInt();
            if ((0<=graus)&&(graus<90)||(graus==360))
                System.out.println("Bom Dia!!");
            else if ((90<=graus)&&(graus<180))
                System.out.println("Bom Tarde!!");
            else if ((180<=graus)&&(graus<270))
                System.out.println("Bom Noite!!");
            else if ((270<=graus)&&(graus<360))
                System.out.println("Bom Noite!!");
        }
    }
}