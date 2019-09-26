// Faça um programa que leia um primeiro nome para transformar para o código decimal da tabela ASCII e criar uma senha de 6 caracteres:
import java.util.Scanner;

public class DecimalASCII {
  public static void main(String[] args) {
    int i = 0, soma = 0;
   
    Scanner scn = new Scanner(System.in);
    
    System.out.println("Digite o seu nome: ");
    String nome = scn.nextLine();
    
    while (i < nome.length()) {
      System.out.println((int)nome.charAt(i));
      soma += ((int)nome.charAt(i));
      i++;
    }
    
    String senha = nome.substring(0, 3) + soma;
    System.out.println();
    System.out.println("A sua nova senha é: "+senha);
    

  }
}
