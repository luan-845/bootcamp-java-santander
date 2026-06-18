package modulo02_Estrutura_Controle.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class SegundoExercicio {
    public static void main(String[] args) {

        // CALCULO IMC

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a altura:");
        double height = scan.nextDouble();

        System.out.println("Entre com o peso:");
        double weight = scan.nextDouble();

        double calculoImc = weight / (Math.pow(height,2));

        if(calculoImc <= 18.5){
            System.out.println("Abaixo do Peso");
        } else if (calculoImc > 18.6 && calculoImc <= 24.9) {
            System.out.println("Peso ideal");

        } else if(calculoImc > 25.0 && calculoImc <= 29.9){
            System.out.println("Levemente acima do Peso");
        } else if(calculoImc > 30.0 && calculoImc <= 34.9){
            System.out.println("Obesidade Grau I");
        } else if(calculoImc > 35.0 && calculoImc <= 39.9){
            System.out.println("Obesidade Grau II");
        } else if (calculoImc > 40.0){
            System.out.println("Obesidade Grau III (Mórbida)");
        }
    }
}
