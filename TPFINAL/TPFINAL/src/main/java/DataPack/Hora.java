/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author renat
 */
package DataPack;

import java.util.Scanner;

public class Hora {
  private int horas;
  private int minutos;
  private int segundos;

  private final String hourTemplate = "%s:%s:%s";
  private Scanner scanner;

  private String FormatarValor(int value) {
    String stringifiedValue = "00" + Integer.toString(value);

    return stringifiedValue.substring(stringifiedValue.length() - 2);
  }

  private void Validar() throws Exception {
    if (this.horas < 0 || this.horas > 23) {
      throw new Exception("Valor de Hora Invalida");
    }

    if (this.minutos < 0 || this.minutos > 59) {
      throw new Exception("Valor de Minutos Invalido");
    }

    if (this.segundos < 0 || this.segundos > 59) {
      throw new Exception("Valor de segundos Invalido");
    }
  }

  private int HorToMin(int horas) {
    return horas * 60;
  }

  private int MinToSec(int minutos) {
    return minutos * 60;
  }

  public static boolean HoraValida(int hora) {
    return hora >= 0 && hora < 24;
  }

  public static boolean MinutoValido(int minuto) {
    return minuto >= 0 && minuto < 60;
  }

  public static boolean SegundoValido(int second) {
    return second >= 0 && second < 60;
  }

  public void Validar(int horas, int minutos, int segundos) throws Exception {
    if (horas < 0 || horas > 23) {
      throw new Exception("Valor de Hora Invalida");
    }

    if (minutos < 0 || minutos > 59) {
      throw new Exception("Valor de Minutos Invalido");
    }

    if (segundos < 0 || segundos > 59) {
      throw new Exception("IValor de Segundos Invalido");
    }
  }

  public Hora() {
    this.setHoras();
    this.setMinutos();
    this.SetSegundos();

    this.horas = 0;
    this.minutos = 0;
    this.segundos = 0;
  }

  public Hora(int horas, int minutos, int segundos) {
    this.horas = horas;
    this.minutos = minutos;
    this.segundos = segundos;

    try {
      Validar();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void setHoras(int horas) {
    this.horas = horas;

    try {
      Validar();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void setMinutos(int minutos) {
    this.minutos = minutos;

    try {
      Validar();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void setSegundos(int segundos) {
    this.segundos = segundos;

    try {
      Validar();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void setHoras() {
    try {
      this.scanner = new Scanner(System.in);

      System.out.print("Insert a valid value for \"hours\": ");
      this.horas = scanner.nextInt();

      Validar();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void setMinutos() {
    try {
      this.scanner = new Scanner(System.in);

      System.out.print("Insert a valid value for \"minutes\": ");
      this.minutos = scanner.nextInt();

      Validar();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void SetSegundos() {
    try {
      this.scanner = new Scanner(System.in);

      System.out.print("Insert a valid value for \"seconds\": ");
      this.segundos = scanner.nextInt();

      Validar();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public int getHoras() {
    return this.horas;
  }

  public int getMinutos() {
    return this.minutos;
  }

  public int getSegundos() {
    return this.segundos;
  }

  public int toSegundos() {
    int qntMinutos = 0, qntSegundos = 0;

    qntMinutos += this.minutos + HorToMin(this.horas);

    qntSegundos += this.segundos + MinToSec(qntMinutos);

    return qntSegundos;
  }

  public String getHoraCompleta() {
    String HoraCompleta = String.format(
      this.hourTemplate,
      FormatarValor(this.horas),
      FormatarValor(this.minutos),
      FormatarValor(this.segundos)
    );

    return HoraCompleta;
  }

  public String getHoraCompleta(boolean FormatoVinteQuatroHoras) {
    boolean isPostMeridiem = this.horas - 12 > 0;

    String suffix = isPostMeridiem ? "PM" : "AM";

    String completeHour = String.format(
      this.hourTemplate + " %s",
      FormatarValor(isPostMeridiem ? this.horas - 12 : this.horas),
      FormatarValor(this.minutos),
      FormatarValor(this.segundos),
      suffix
    );

    return completeHour;
  }
}

