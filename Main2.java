// testes do curso de bootcamp Java da DIO

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int idadeUsuario = scanner.nextInt();
        System.out.println("Idade: " + idadeUsuario);
        System.out.println("Você é emancipado(a)?");
        boolean emancipado = scanner.nextBoolean();
        var canDrive = idadeUsuario >= 18 || (emancipado && idadeUsuario >= 16); // || = OU
        System.out.println("Pode dirigir? " + (canDrive ? "Sim" : "Não"));
       
    }

    
}
