import java.util.Scanner;


/*Renato Santos
TP02Ex05 - Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela. 

String inputValue = "Default que sera convertido ao valor ";
Scanner scanner = new Scanner(System.in);
System.out.println("\n -------------//-------------------");
*/

public class TP02EX05 {

    
    public static void main(String[] args) {
        String inputValue = "Default que sera convertido ao valor ";
    Scanner scanner = new Scanner(System.in);
    int dimencaoX = 3, dimencaoY = 2;
    int[][] matrix;

    matrix = new int[dimencaoX][dimencaoY];

    for (int x = 1; x <= dimencaoX; x++) {
      for (int y = 1; y <= dimencaoY; y++) {
        int valor;
        
        System.out.println("Insira o valor da posicao " + x + "x" + y + " da matriz: ");               
        inputValue = scanner.next();
        valor = Integer.parseInt(inputValue);

        int currentIndexX = x - 1, currentIndexY = y - 1;

        matrix[currentIndexX][currentIndexY] = valor;
      }
    }

    System.out.println("\n -------------//-------------------");
    for (int x = 0; x < dimencaoX; x++) {
      for (int y = 0; y < dimencaoY; y++) {
        System.out.print(" " + matrix[x][y] + " ");
      }
     System.out.println("\n -------------//-------------------");
    }
    }
    
}
