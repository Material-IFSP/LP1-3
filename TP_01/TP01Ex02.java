import java.util.Scanner;

/*Renato Santos
TP01Ex02 - Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será
digitado. 
*/


public class TP01Ex02 {
  public static void main(String[] args) {
    String inputValue = "Default que sera convertido ao valor ";
    double aresta, area;

    Scanner scanner = new Scanner(System.in);

    System.out.print(" Informe a aresta do quadrado : ");
    inputValue = scanner.next();
    aresta = Double.parseDouble(inputValue);

    area = Math.pow(aresta, 2);

    System.out.println();
    System.out.println(" Area do quadrado : " + area);
  }
}
