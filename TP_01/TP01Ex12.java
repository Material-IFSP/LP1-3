import java.util.Scanner;

/*Renato Santos
TP01Ex12 - Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
área. 
System.out.println("\n -------------//-------------------");
*/

public class TP01Ex12 {
  public static void main(String[] args) {
    String inputValue = "Default que sera convertido ao valor ";
    double altura, raio , volume;

    Scanner scanner = new Scanner(System.in);
    System.out.println("\n -------------//-------------------");
    System.out.print("Informe a altura do cone : ");
    inputValue = scanner.next();
    altura = Double.parseDouble(inputValue);

    System.out.print("Informe o raio da base : ");
    inputValue = scanner.next();
    raio = Double.parseDouble(inputValue);

    volume = (Math.PI * Math.pow(raio, 2) * altura) / 3;

    System.out.println("\n -------------//-------------------");
    System.out.println("Volume do cone : " + volume);
    System.out.println("\n -------------//-------------------");
  }
}
