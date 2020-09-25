import java.util.Scanner;

/*Renato Santos
TP01Ex07 - Calcular e exibir a média geométrica de dois valores quaisquer que serão
digitados. 
*/


public class TP01Ex07 {
  public static void main(String[] args) {
    String inputValue = "Default que sera convertido ao valor ";
    double
      media,
      resultValores = 1,
      contValores = 2;

    double[] valores = new double[(int)contValores];

    Scanner scanner = new Scanner(System.in);
    System.out.println("\n -------------//-------------------");

    for(int i = 1; i <= contValores; i++) {
      double valorConvertido;

      System.out.print("Informe o " + i + " valor: ");
      inputValue = scanner.next();

      valorConvertido = Double.parseDouble(inputValue);

      resultValores *= valorConvertido;
    }

    media = Math.pow(resultValores, (1 / contValores));
    
    System.out.println("\n -------------//-------------------");
    System.out.println();
    System.out.println("Media geometrica : " + media);
    System.out.println("\n -------------//-------------------");
  }
}
