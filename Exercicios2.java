
public class Exercicios2 {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
    
       
    //ToDo 1: código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número
        System.out.println("Digite um número para ver sua tabuada:");
        int numero = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
                }
            }
        }
    
    //ToDo 2: Cálculo de IMC
        System.out.println("Digite seu peso em kg:");
        double peso = scanner.nextDouble();
        System.out.println("Digite sua altura em metros:");
        double altura = scanner.nextDouble();
        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Peso ideal.");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Levemente acima do peso.");
        } else if (imc >= 30 && imc < 34.9) {
            System.out.println("Obesidade Grau I."); }
        else if (imc >= 35 && imc < 39.9) {
            System.out.println("Obesidade Grau II (severa).");
        } else if (imc >= 40) {
            System.out.println("Obesidade Grau III (mórbida)."); }
    
    
    //ToDo 3: Numeros pares ou impares entre entradas do usuario, exibidos em ordem descresente
        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número (maior que o primeiro):");
        int num2 = scanner.nextInt();
        System.out.println ("Selecione PARES ou ÍMPARES (P/I):");
        char escolha = scanner.next().toUpperCase().charAt(0);
        
        if (num1 > num2) {
            System.out.println("O primeiro número deve ser menor que o segundo.");
        }
        if (escolha == 'P') {
            System.out.println("Números pares entre " + num1 + " e " + num2 + ":");
            for (int i = num2; i >= num1; i--) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else if (escolha == 'I') {
            System.out.println("\nNúmeros ímpares entre " + num1 + " e " + num2 + ":");
            for (int i = num2; i >= num1; i--) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    //ToDo 4: solicita entrada N numeros inteiros, executa até que o n número dividido pelo primeiro tenha resto diferente de zero
    
    // Solicita o número inicial
        System.out.print("Informe o número inicial: ");
        int numeroInicial = scanner.nextInt();

        while (true) {
            System.out.print("Informe um número (ou qualquer número para encerrar): ");
            int numero = scanner.nextInt();

            // Ignora números menores que o número inicial
            if (numero < numeroInicial) {
                System.out.println("Número ignorado (menor que o número inicial).");
                continue;
            }

            // Verifica se é divisível
            if (numero % numeroInicial != 0) {
                System.out.println("Número não divisível por " + numeroInicial + ". Encerrando.");
                break;
            }

            // Exibe o número válido
            System.out.println("Número válido: " + numero);
            System.out.println("a divisão de " + numero + " por " + numeroInicial + " é: " + (numero / numeroInicial));
        }

    }
}
