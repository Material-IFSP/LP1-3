import java.util.Scanner;

/*Renato Santos
TP01Ex11 - A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área
System.out.println("\n -------------//-------------------");
*/

public class TP01Ex11 {
  public static void main(String[] args) {
    String inputValue = "Default que sera convertido ao valor ";

    double diametro, area, raio;

    Scanner scanner = new Scanner(System.in);
    System.out.println("\n -------------//-------------------");
    System.out.print("Informe o diametro da circuferencia : ");
    inputValue = scanner.next();
    diametro = Double.parseDouble(inputValue);

    raio = diametro / 2;
    area = Math.PI * Math.pow(raio, 2);

    System.out.println("\n -------------//-------------------");
    System.out.println("Área da circunferência : " + area);
    System.out.println("\n -------------//-------------------");
  }
}
