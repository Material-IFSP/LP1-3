import java.util.Scanner;

/*Renato Santos
TP01Ex16 - Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
Lembre-se que uma função trigonométrica trabalha em radianos. 

System.out.println("\n -------------//-------------------");
*/

public class TP01Ex16 {
  public static void main(String[] args) {
    String inputValue = "Default que sera convertido ao valor ";

    double anguloGrau, anguloRadiano;

    Scanner scanner = new Scanner(System.in);
    System.out.println("\n -------------//-------------------");
    System.out.print("Informe o angulo em graus : ");
    inputValue = scanner.next();
    anguloGrau = Double.parseDouble(inputValue);

    anguloRadiano = anguloGrau * Math.PI / 180;

    System.out.println("\n -------------//-------------------");
    System.out.println("Seno : " + Math.sin(anguloRadiano));
    System.out.println("Cosseno : " + Math.cos(anguloRadiano));
    System.out.println("Tangente : " + Math.tan(anguloRadiano));
    System.out.println("Secante : " + (1 / Math.cos(anguloRadiano)));
    System.out.println("\n -------------//-------------------");
  }
}
