import java.util.Scanner;

public class Entrada{
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("digite seu nome");
    String nome = scanner.nextLine();

    System.err.println("digite sua idade");
    int idade = scanner.nextInt();


    System.err.println("Ola " + nome + " voce tem " + idade + " anos, seja bem vinda/o");

  }
}