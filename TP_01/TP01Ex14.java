import java.util.Scanner;

/*Renato Santos
TP01Ex14 - Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
“r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão
digitados. 
System.out.println("\n -------------//-------------------");
*/

public class TP01Ex14 {
  public static void main(String[] args) {
    String inputValue = "Default que sera convertido ao valor ";
   double raioEsfera, arestaCubo, volumeCubo, volumeEsfera, volumeLivre;
   
    Scanner scanner = new Scanner(System.in);
    System.out.println("\n -------------//-------------------");
    System.out.print("Informe o raio da esfera : ");
    inputValue = scanner.next();
    raioEsfera = Double.parseDouble(inputValue);

    System.out.print("Informe a aresta do cubo : ");
    inputValue = scanner.next();
    arestaCubo = Double.parseDouble(inputValue);
   

    volumeCubo = Math.pow(arestaCubo, 3);
    volumeEsfera = (4 * Math.PI * Math.pow(raioEsfera, 3)) / 3;

    volumeLivre = volumeCubo - volumeEsfera;

    System.out.println("\n -------------//-------------------");
    System.out.println("Volume livre: " + volumeLivre);
    System.out.println("\n -------------//-------------------");
  }
}
