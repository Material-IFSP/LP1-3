import java.util.Scanner;

/*Renato Santos
TP01Ex08 - Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
dois metros e que um quilômetro possui mil metros, fazer um programa para
converter milhas marítimas em quilômetros. 
*/

public class TP01Ex08 {
  public static void main(String[] args) {
    String inputValue = "Default que sera convertido ao valor ";
    double milhaMetros = 1852;
    double KmMetros = 1000;

    
    double milhas, disMetros, disKm;

    Scanner scanner = new Scanner(System.in);
    System.out.println("\n -------------//-------------------");
    System.out.print("Informe a distancia em milhas : ");
    inputValue = scanner.next();

    milhas = Double.parseDouble(inputValue);
    disMetros = milhas * milhaMetros;
    disKm = disMetros / KmMetros;

    System.out.println();
    System.out.println("\n -------------//-------------------");
    System.out.println("Distancia em KM : " + disKm);
    System.out.println("\n -------------//-------------------");
  }
}
