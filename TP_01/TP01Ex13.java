import java.util.Scanner;


/*Renato Santos
TP01Ex13 - Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
valores da velocidade inicial (em m/s), da aceleração (m/s²) e do tempo de percurso
(em s) que serão digitados. 
String inputValue = "Default que sera convertido ao valor ";
System.out.println("\n -------------//-------------------");
*/


public class TP01Ex13 {
  public static void main(String[] args) {
    String inputValue = "Default que sera convertido ao valor ";
   double velocInicial, aceleracao, tempoPercurso, velocFinal;

   
    Scanner scanner = new Scanner(System.in);
    System.out.println("\n -------------//-------------------");
    System.out.print("Informe a velocidade inicial (M/s): ");
    inputValue = scanner.next();
    velocInicial = Double.parseDouble(inputValue);

    System.out.print("Informe a acelaracao (M/s²): ");
    inputValue = scanner.next();
    aceleracao = Double.parseDouble(inputValue);

    System.out.print("Informe o tempo de percurso (Segs): ");
    inputValue = scanner.next();
    tempoPercurso = Double.parseDouble(inputValue);

    velocFinal = (velocInicial + (aceleracao * tempoPercurso)) * 3.6;
    
    System.out.println("\n -------------//-------------------");
    System.out.println("Velocidade final (km/h) : " + velocFinal);
    System.out.println("\n -------------//-------------------");
  }
}
