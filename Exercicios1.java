/*Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"

Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela

fórmula: área=lado X lado
Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela

fórmula: área=base X altura
Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas */

public class Exercicios1 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Exercício 1: Nome e ano de nascimento
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        int idade = 2025 - anoNascimento; // Considerando o ano atual como 2025
        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");

        // Exercício 2: Área do quadrado
        System.out.print("Digite o tamanho do lado do quadrado: ");
        double ladoQuadrado = scanner.nextDouble();
        double areaQuadrado = ladoQuadrado * ladoQuadrado;
        System.out.println("A área do quadrado é: " + areaQuadrado);

        // Exercício 3: Área do retângulo
        System.out.print("Digite a base do retângulo: ");
        double baseRetangulo = scanner.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double alturaRetangulo = scanner.nextDouble();
        double areaRetangulo = baseRetangulo * alturaRetangulo;
        System.out.println("A área do retângulo é: " + areaRetangulo);

        // Exercício 4: Diferença de idade entre duas pessoas
        scanner.nextLine(); // Limpar o buffer
        System.out.print("Digite o nome da primeira pessoa: ");
        String nomePessoa1 = scanner.nextLine();
        System.out.print("Digite a idade da primeira pessoa: ");
        int idadePessoa1 = scanner.nextInt();

        scanner.nextLine(); // Limpar o buffer
        System.out.print("Digite o nome da segunda pessoa: ");
        String nomePessoa2 = scanner.nextLine();
        System.out.print("Digite a idade da segunda pessoa: ");
        int idadePessoa2 = scanner.nextInt();

        int diferencaIdade = Math.abs(idadePessoa1 - idadePessoa2);
        System.out.println("A diferença de idade entre " + nomePessoa1 + " e " + nomePessoa2 + " é de " + diferencaIdade + " anos.");
    }
}
