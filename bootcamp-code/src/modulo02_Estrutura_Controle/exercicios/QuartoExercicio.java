package modulo02_Estrutura_Controle.exercicios;

import java.util.Scanner;

public class QuartoExercicio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o número inicial:");
        int number = scan.nextInt();
        boolean keepVerify = true;
        while(keepVerify){
            System.out.println("Informe o número para verificação:");
            int toVerifify = scan.nextInt();

            if (toVerifify < number){
                System.out.printf("Informe o número maior que %d\n", number);
                continue;
            }
            int result = toVerifify % number;
            keepVerify = result == 0;

            System.out.printf("%d %% %d = %d \n", toVerifify, number, result);
        }
    }
}
