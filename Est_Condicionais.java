
public class Est_Condicionais {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
/*
// Parte 1 - If, Else If, Else

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        if (idade < 18) {
            System.out.println("Você é menor de idade, " + nome + ".");
        } else if (idade >= 18 && idade < 60) {
            System.out.println("Você é adulto, " + nome + ".");
        } else {
            System.out.println("Você é idoso, " + nome + ".");
        }

        var canDrive = idade >= 18;
        var message = canDrive ?
            nome + ", você pode dirigir." :
            nome + ", você não pode dirigir.";
        System.out.println(message);

        System.out.println("Fim da execução da parte 1.");


// parte 2 - Switch Case
        System.out.println("Digite um número de 1 a 7:");
        int option = scanner.nextInt();

        switch (option) {
            case 1 -> {
                System.out.println("Domingo");
                System.out.println("Fim de semana!");
            }
            case 2 -> System.out.println("Segunda-feira");
            case 3 -> System.out.println("Terça-feira");
            case 4 -> System.out.println("Quarta-feira");
            case 5 -> System.out.println("Quinta-feira");
            case 6 -> System.out.println("Sexta-feira");
            case 7 -> {
                System.out.println("Sábado");
                System.out.println("Fim de semana!");
            }
            default -> System.out.println("Opção inválida.");
        }
        System.out.println("Fim da execução da parte 2.");

// Parte 3 - Repetição for

        for (int i = 0; i <= 10; i++) {
            if (i == 10) break;
            System.out.println(i);
            // imprime numeros de 0 a 10
        }

        for (int i = 0; i <= 10; i += 2) {
            if (i % 2 != 0) continue;
            System.out.println(i);
            // imprime numeros pares de 0 a 10
        }

        for (int i =0; i <= 10; i += 1) {
            if (i % 2 == 0) continue;
            System.out.println(i);
            // imprime numeros impares de 0 a 10
        }
        System.out.println("Fim da execução da parte 3.");
*/

//Parte 4 - while e do while
        String name = "";
        while (!name.equals("sair")) {
            System.out.println("Digite seu nome (ou 'sair' para encerrar):");
            name = scanner.nextLine();
            if (!name.equals("sair")) {
                System.out.println("Olá, " + name + "!");
            }
        }

        System.out.println("Fim da execução da parte 4.");
        
    }
}
