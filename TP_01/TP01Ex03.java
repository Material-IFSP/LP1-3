import java.util.Scanner;

/*Renato Santos
TP01Ex03 - Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
digitado.
*/

public class TP01Ex03 {
  public static void main(String[] args) {
    String inputValue = "Default que sera convertido ao valor ";
    double diagonal, area;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe a diagonal do quadrado : ");
    inputValue = scanner.next();
    diagonal = Double.parseDouble(inputValue);

    area = Math.pow(diagonal, 2) / 2;

    System.out.println();
    System.out.println("Area do quadrado: " + area);
  }
}
