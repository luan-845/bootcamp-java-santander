package modulo03_Classes_Encapsulamento.aula_records;

public class Main {
    public static void main(String[] args) {
        Ficha ficha = new Ficha("Luan", 20);

        System.out.println(ficha);
        ficha = new Ficha("Luan", 21);
        System.out.println(ficha);

    }
}
