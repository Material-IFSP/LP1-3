import java.util.Scanner;

/*Renato Santos
TP01Ex15 -  Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
dólares. Calcular e exibir o valor correspondente em Reais (R$). 

System.out.println("\n -------------//-------------------");
*/

public class TP01Ex15 {
  public static void main(String[] args) {
    String inputValue = "Default que sera convertido ao valor ";

    double cotacaoDolar, quantidadeDolar, quantidadeReal;

    Scanner scanner = new Scanner(System.in);  
    System.out.println("\n -------------//-------------------");
    System.out.print("Informe a cotação do dólar: ");
    inputValue = scanner.next();
    cotacaoDolar = Double.parseDouble(inputValue);

    System.out.print("Informe quantia em dólares a converter: ");
    inputValue = scanner.next();
    quantidadeDolar = Double.parseDouble(inputValue);


    quantidadeReal = quantidadeDolar * cotacaoDolar;

    System.out.println("\n -------------//-------------------");
    System.out.println(" Valor em real: R$" + quantidadeReal);
    System.out.println("\n -------------//-------------------");
  }
}
