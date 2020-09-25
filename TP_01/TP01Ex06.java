import java.util.Scanner;

/*Renato Santos
TP01Ex06 - Calcular e exibir a média aritmética de quatro valores quaisquer que serão
digitados. 
*/


public class TP01Ex06 {
  public static void main(String[] args) {
    String inputValue = "Default que sera convertido ao valor ";
    double media,
      somaValores = 0,
      contValores = 4;
    
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("\n -------------//-------------------");

    for(int i = 1; i <= contValores; i++) {
      double valorConvertido;

      System.out.print("Informe o " + i + " valor: ");
      inputValue = scanner.next();
      valorConvertido = Double.parseDouble(inputValue);
      somaValores += valorConvertido;         
    }

    media = somaValores / contValores;
  
    System.out.println("\n -------------//-------------------");
    System.out.println("Media aritmetica : " + media);
  }
}
