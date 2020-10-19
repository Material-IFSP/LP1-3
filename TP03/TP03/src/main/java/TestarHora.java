/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author renat
 */
/* public class TestarHora {

    /**
     * @param args the command line arguments
     */
  /*   public static void main(String[] args) {
        // TODO code application logic here
    }
    
} */



//package src;

import Hora.Hora;

import java.util.Scanner;

public class TestarHora {
  private static String title = "Testando a Clase \"Hora\"";
  private static Scanner scanner = new Scanner(System.in);

  private static void clear() {
    System.out.flush();
  }

  private static void testar(String title, Hora hora) {
    System.out.println(title);
    System.out.println();

    System.out.println("Horas: " + hora.getHoras());
    System.out.println("Minutos: " + hora.getMinutos());
    System.out.println("Segundos: " + hora.getSegundos());
    System.out.println("Tempo em segunods: " + hora.toSegundos());
    System.out.println("Horario Formatado: " + hora.getHoraCompleta());
    System.out.println("Horario Formatado: " + hora.getHoraCompleta(true));
    System.out.println();
    System.out.println();
  }

  private static void refreshTitle() {
    clear();
    System.out.println(title);
    System.out.println();
  }

  private static void setTitle(String newTitle) {
    title = newTitle;
    refreshTitle();
  }

  public static void main(String[] args) {
    int horas, minutos, segundos;
    boolean ValorValido = true;

    refreshTitle();

/*    setTitle(
      "I - Initializing first object: Construct with params \n âžœ Requesting values"
    );
*/
    do {
      if (!ValorValido) {
        System.out.println(
          "Valor Inserido Invalido"
        );
      }
      System.out.print("Insira um valor Valor valido de Hora: ");
      horas = scanner.nextInt();

      ValorValido = Hora.HoraValida(horas);

      refreshTitle();
    } while (!ValorValido);

    do {
      if (!ValorValido) {
        System.out.println(
          "Valor de Minutos Inserido é invalido!"
        );
      }
      System.out.print("Insira um valor Valido de Minutos: ");
      minutos = scanner.nextInt();

      ValorValido = Hora.MinutoValido(minutos);

      refreshTitle();
    } while (!ValorValido);

    do {
      if (!ValorValido) {
        System.out.println(
          "Valor de Segundos Inserido é invalido!"
        );
      }
      System.out.print("Insira um valor Valido de Segundos: ");
      segundos = scanner.nextInt();

      ValorValido = Hora.SegundoValido(segundos);

      refreshTitle();
    } while (!ValorValido);

    setTitle(
      "I - Construtor com Parametros!"
    );

    Hora hour_01 = new Hora(horas, minutos, segundos);

    setTitle(
      "II - Construtor sem parametros! Pedindo valores mas nao serão usados ! "
    );

    Hora hour_02 = new Hora();

    setTitle(
      "II - Construtor sem parametros! Valores pedidos serão usados desta vez :D"
    );

    do {
      if (!ValorValido) {
        System.out.println(
          "Valor de Horas Inserido é invalido!"
        );
      }
      System.out.print("Insira um valor Valido de Horas: ");
      horas = scanner.nextInt();

      ValorValido = Hora.HoraValida(horas);

      refreshTitle();
    } while (!ValorValido);

    do {
      if (!ValorValido) {
        System.out.println(
          "Valor de Minutos Inserido é invalido!"
        );
      }
      System.out.print("Insira um valor Valido de Minutos: ");
      minutos = scanner.nextInt();

      ValorValido = Hora.MinutoValido(minutos);

      refreshTitle();
    } while (!ValorValido);

    do {
      if (!ValorValido) {
        System.out.println(
          "Valor de segundos Inserido é invalido!"
        );
      }
      System.out.print("Insira um valor Valido de Segundos: ");
      segundos = scanner.nextInt();

      ValorValido = Hora.SegundoValido(segundos);

      refreshTitle();
    } while (!ValorValido);

    hour_02.setHoras(horas);
    hour_02.setMinutos(minutos);
    hour_02.setSegundos(segundos);

    setTitle(
      "III - Construtor sem parametros! Valores pedidos não serao usados! "
      
    );

    Hora hour_03 = new Hora();

    setTitle(
      "III - Construtor sem parametros! Valores pedidos serão usados desta vez :D"
    );

    hour_03.setHoras();
    refreshTitle();
    hour_03.setMinutos();
    refreshTitle();
    hour_03.setMinutos();
    refreshTitle();

    testar("Teste usando o construtor com parametros! ", hour_01);
    testar("Teste usando objeto com input manual e setters com parametros! ", hour_02);
    testar("Teste usando onjeto com input manual, mas setando sem parametros", hour_03
    );
  }
}




