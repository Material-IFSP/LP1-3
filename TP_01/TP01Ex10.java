import java.util.Scanner;

/*Renato Santos
TP01Ex10 -  Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
exibir sua temperatura equivalente em Fahrenheit. 
System.out.println("\n -------------//-------------------");
*/

public class TP01Ex10 {
  public static void main(String[] args) {
    System.out.println("\n -------------//-------------------");
    String inputValue = "Default que sera convertido ao valor ";
    double celsius, fahrenheit;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Informe a temperatura em graus celsius : ");
    inputValue = scanner.next();
    celsius = Double.parseDouble(inputValue);

    fahrenheit = 32 + ( celsius * 9/5 );
    
    System.out.println("\n -------------//-------------------");
    System.out.println("Graus em fahrenheit : " + fahrenheit);
    System.out.println("\n -------------//-------------------");
  }
}
