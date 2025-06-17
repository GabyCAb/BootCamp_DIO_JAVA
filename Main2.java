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
        float numero1 = scanner.nextFloat();
        System.out.println("Digite o segundo número:");
        float numero2 = scanner.nextFloat();

        System.out.println("Os números são: " + numero1 + " e " + numero2);
        System.out.println("A soma é: " + (numero1 + numero2));
        System.out.println("A subtração é: " + (numero1 - numero2));
        System.out.println("A multiplicação é: " + (numero1 * numero2));
        System.out.println("A divisão é: " + (numero1 / numero2));

        var value = 33;
        value += 10; // += é o mesmo que value = value + 10
        System.out.println("O valor atualizado é: " + value);
        value -= 5; // -= é o mesmo que value = value - 5
        System.out.println("O valor atualizado é: " + value);
        value *= 2; // *= é o mesmo que value = value * 2
        System.out.println("O valor atualizado é: " + value);
        value /= 3; // /= é o mesmo que value = value / 3
        System.out.println("O valor atualizado é: " + value);
        value %= 2; // %= é o mesmo que value = value % 2
        System.out.println("O valor atualizado é: " + value);
        value++; // Incrementa o valor em 1
        System.out.println("O valor atualizado é: " + value);
        value--; // Decrementa o valor em 1
        System.out.println("O valor atualizado é: " + value);

        // Terceira parte: bitwise (bit a bit)
        var value1 = 5;
        var binary1 = Integer.toBinaryString(value1);
        System.out.println("Valor 1: " + value1 + " (binário: " + binary1 + ")");
        var value2 = 3;
        var binary2 = Integer.toBinaryString(value2);
        System.out.println("Valor 2: " + value2 + " (binário: " + binary2 + ")");
        
    }

    
}
