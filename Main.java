public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
    System.out.println(3 + 3);
    //comentário
    /* comentário com muitas linhas */

    String nome = "Gabi";
    System.out.println("Olá, " + nome + "!");
    int idade = 33;
    System.out.println("Idade: " + idade);

    int x = 5;
    int y = 10;
    System.out.println("Soma: " + (x + y));

    try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
        System.out.print("Digite sua idade: ");
        int idadeUsuario = scanner.nextInt();
        System.out.println("Idade: " + idadeUsuario);
        System.out.println("Digite seu nome:");
        String nomeUsuario = scanner.next();
        System.out.println("Nome: " + nomeUsuario);
    }

    
  }
}
