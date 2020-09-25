import java.util.Scanner;

/*Renato Santos
TP01Ex05 - Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que
será digitado. 
*/



public class TP01Ex05 {
  public static void main(String[] args) {
    String inputValue = "Default que sera convertido ao valor ";
    double diametro, raio, volume;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o diametro da esfera : ");
    inputValue = scanner.next();
    diametro = Double.parseDouble(inputValue);

    raio = diametro / 2;

    volume = (4 * Math.PI * Math.pow(raio, 3)) / 3; //math.pi retorna o valor de PI = 3,14 

    System.out.println();
    System.out.println(" Volume da esfera : " + volume);
  }
}
