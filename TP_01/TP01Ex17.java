import java.util.Scanner;

/*Renato Santos
TP01Ex17 - Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln. 

System.out.println("\n -------------//-------------------");
*/

public class TP01Ex17 {
  public static void main(String[] args) {
    String inputValue = "Default que sera convertido ao valor ";

    double x, y;

    Scanner scanner = new Scanner(System.in);
    System.out.println("\n -------------//-------------------");
    System.out.print("Informe o valor de X : ");
    inputValue = scanner.next();
    x = Double.parseDouble(inputValue);
    
    System.out.print("Informe o valor de Y : ");
    inputValue = scanner.next();
    y = Double.parseDouble(inputValue);

    System.out.println("\n\n -------------//-------------------");
    System.out.println("X elevado  a Y : " + Math.pow(x, y));
    System.out.println("\n -------------//-------------------");
  }
}
