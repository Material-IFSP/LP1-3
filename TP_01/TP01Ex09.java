import java.util.Scanner;

/*Renato Santos
TP01Ex09 - Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm. 
System.out.println("\n -------------//-------------------");
*/

public class TP01Ex09 {
  public static void main(String[] args) {
    String inputValue = "Default que sera convertido ao valor ";

    double resistencia, corrente, tensao; // C = V / R p/ pegar corrente e V = C * R para pegar a tensao 

    Scanner scanner = new Scanner(System.in);
System.out.println("\n -------------//-------------------");
    System.out.print("Informe o valor da  resistencia : ");
    inputValue = scanner.next();
    resistencia = Double.parseDouble(inputValue);

    System.out.print("Informe o valor da corrente(em Miliamperes mA) : ");
    inputValue = scanner.next();
    corrente = Double.parseDouble(inputValue) / 1000;

    tensao = resistencia * corrente;

    System.out.println("\n -------------//-------------------");
    System.out.println(" O valor da tensao deste circuito e de :  " + tensao + " Volts!");
    System.out.println("\n -------------//-------------------");
  }
}
