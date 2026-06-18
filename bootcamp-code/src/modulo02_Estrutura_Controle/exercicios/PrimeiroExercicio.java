package modulo02_Estrutura_Controle.exercicios;

import java.util.Scanner;

public class PrimeiroExercicio {
    public static void main(String[] args) {
        // TABUADA DE 1 A 10
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o número da Tabuada (1 - 10):");
        int numberMultiTable = scan.nextInt();

        for (int multiTable = 1; multiTable <= 10; multiTable++){
            int result = numberMultiTable * multiTable;
            System.out.println(numberMultiTable + " x " + multiTable + " = " + result);
        }
    }
}
