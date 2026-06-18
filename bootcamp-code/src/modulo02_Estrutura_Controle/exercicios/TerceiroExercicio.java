package modulo02_Estrutura_Controle.exercicios;

import java.util.Scanner;

public class TerceiroExercicio {
    public static void main(String[] args) {

        // PAR OU IMPAR DECRESCENTE A PARTIR DO SEGUNDO NÚMERO (SENDO ELE O MAIOR)

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro número:");
        int firstNumber = scan.nextInt();
        System.out.println("Entre com o segundo número (Tem que ser maior que o primeiro):");
        int secondNumber = scan.nextInt();

        System.out.println("Escolha (par ou impar): ");
        String option = scan.next();

        if (option.equalsIgnoreCase("par")) {
            for (int contEvenNumbers = secondNumber; contEvenNumbers >= firstNumber; contEvenNumbers--) {
                if (contEvenNumbers % 2 == 0) {
                    System.out.println(contEvenNumbers);
                }
            }
        } else if (option.equalsIgnoreCase("impar")) {
            for (int contOddNumbers = secondNumber; contOddNumbers >= firstNumber; contOddNumbers--) {
                if (contOddNumbers % 2 == 1) {
                    System.out.println(contOddNumbers);
                }
            }
        } else {
            System.out.println("Opção Inválida");
        }
    }
}
