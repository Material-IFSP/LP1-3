import java.util.Scanner;

/*Renato Santos
TP01Ex01 - Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
área. 
String inputValue = "Default que sera convertido ao valor ";
System.out.println("\n -------------//-------------------");
*/


public class TP01Ex01 {
  public static void main(String[] args) {
    String inputValue = "Default que sera convertido ao valor ";
    double base, altura, area;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Valor da base do retangulo: ");
    inputValue = scanner.next();
    base = Double.parseDouble(inputValue);

    System.out.print("Valor da altura do retangulo: ");
    inputValue = scanner.next();
    altura = Double.parseDouble(inputValue);

    area = base * altura;

    System.out.println();
    System.out.println("Area do retangulo : " + area);
    System.out.println("\n -------------//-------------------");
  }
}
