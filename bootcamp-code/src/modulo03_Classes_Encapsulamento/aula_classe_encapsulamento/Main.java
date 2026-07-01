package modulo03_Classes_Encapsulamento.aula_classe_encapsulamento;

public class Main {
    public static void main(String[] args) {

        Person male = new Person("Paulo", 20);
        Person female = new Person("Juliana", 25);

        System.out.println("Male Name: " + male.getName() + " - Age: " + male.getAge());
        System.out.println("Female Name: " + female.getName() + " - Age: " + female.getAge());

    }
}
