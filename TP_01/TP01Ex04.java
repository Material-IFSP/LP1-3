import java.util.Scanner;

/*Renato Santos
TP01Ex04 - A partir dos valores da base e altura de um triângulo, calcular e exibir sua área. 
*/


public class TP01Ex04 {
  public static void main(String[] args) {
    String inputValue = "Default que sera convertido ao valor ";
    double base, altura, area;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe a base do triangulo : ");
    inputValue = scanner.next();
    base = Double.parseDouble(inputValue);

    System.out.print("Informe a altura do triangulo : ");
    inputValue = scanner.next();
    altura = Double.parseDouble(inputValue);

    area = (base * altura) / 2;

    System.out.println();
    System.out.println("Area do triangulo: " + area);
  }
}
