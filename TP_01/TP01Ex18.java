import java.util.Scanner;

/*Renato Santos
TP01Ex18 - Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
que deverá ser devolvido. 
System.out.println("\n -------------//-------------------");
*/

public class TP01Ex18 {
  public static void main(String[] args) {
    String inputValue = "Default que sera convertido ao valor ";

    double custoProduto, quantPagamento, valorTroco,
      somaPrecos = 0,    
      quantProdutos = 5;

    Scanner scanner = new Scanner(System.in);
    System.out.println("\n -------------//-------------------");
    
    for(int i = 1; i <= quantProdutos; i++) {
      System.out.print("Informe o custo do " + i + " produto : ");
      inputValue = scanner.next();
      custoProduto = Double.parseDouble(inputValue);
      somaPrecos += custoProduto;
    }
    
    System.out.println("-------------//-------------------");
    System.out.print("Informe valor pago: ");
    inputValue = scanner.next();
    quantPagamento = Double.parseDouble(inputValue);


    valorTroco = quantPagamento - somaPrecos;

    System.out.println(" -------------//-------------------");
    System.out.println("Troco : " + valorTroco);
    System.out.println(" -------------//-------------------");
  }
}
