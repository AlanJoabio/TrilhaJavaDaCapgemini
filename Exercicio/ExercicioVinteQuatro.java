import java.util.Scanner

public class Main {

  public static void main(String[] args) {
    Scanner leitorScanner(System.in);

    char desejaContinuar = 'S';

    while(desejaContinuar == 'S' || desejaContinuar == 's'){

      System.out.println("Digite um numero");

      int numero = leitorScanner.nextInt();

      if(numero == 0) {
        System.out.println("O numero e zero");
      } else{
        if(numero > 0) {
          System.out.println("O numero e maior que zero");
        } else {
          System.out.println("O numero e menor do zero");
        }
        
      }

      System.out.println("Deseja continuar ? S - Sim / N - Nao");
      desejaContinuar = leitorScanner.next().charAt(0);

      
    }    
  }
}