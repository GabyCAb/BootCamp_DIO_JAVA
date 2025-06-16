// testes do curso de bootcamp Java da DIO

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Primeira parte: idade e emancipação
        System.out.println("Digite sua idade:");
        int idadeUsuario = scanner.nextInt();
        System.out.println("Idade: " + idadeUsuario);
        System.out.println("Você é emancipado(a)?");
        boolean emancipado = scanner.nextBoolean();
        var canDrive = idadeUsuario >= 18 || (emancipado && idadeUsuario >= 16); // || = OU
        System.out.println("Pode dirigir? " + (canDrive ? "Sim" : "Não"));

        // Segunda parte: operações com números
        System.out.println("Digite o primeiro número:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int numero2 = scanner.nextInt();

        System.out.println("Os números são: " + numero1 + " e " + numero2);
        System.out.println("A soma é: " + (numero1 + numero2));
        System.out.println("A subtração é: " + (numero1 - numero2));
    }

    
}
