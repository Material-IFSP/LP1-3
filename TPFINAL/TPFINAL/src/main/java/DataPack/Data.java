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
import DataPack.*;
import java.text.*;
import java.util.*;






public class Data {
  private int ano;
  private int mes;
  private int dia;

  private Scanner scanner;

  private String FormatarValorUnit(int valor, int numDigitos) {
    String zeros = "";

    for (int i = 0; i < numDigitos; i++) {
      zeros += "0";
    }

    String stringfiedValue = zeros + Integer.toString(valor);

    return stringfiedValue.substring(stringfiedValue.length() - numDigitos);
  }

  public boolean AnoBissexto() {
    return this.ano % 4 == 0;
  }

  public boolean CodMesValido(int codigo) {
    boolean codMesValido = false;

    for (int codMes : Mes.mesesValidos) {
      if (codMes == codigo) {
        codMesValido = true;
      }
    }

    return codMesValido;
  }

  private void Validar() throws Exception {
    if (this.ano <= 0) {
      throw new Exception("Valor de Ano invalido!");
    }

    if (!CodMesValido(this.mes)) {
      throw new Exception("Valor de mes invalido!");
    }

    if (this.dia > 31) {
      throw new Exception("Valor de dia invalido!");
    }

    if (this.mes == 1) {
      if (!this.AnoBissexto() && this.dia > 28) {
        throw new Exception(
          "Valor invalido de dia para um Ano Normal - Não Bissexto."
        );
      } else if (this.dia > 29) {
        throw new Exception(
          "Valor invalido de dia para um ano Bissexto!."
        );
      }
    }
  }

  public Data() {
    this.ano = 0;
    this.mes = 0;
    this.dia = 0;

    this.setAno();
    this.setMes();
    this.SetDia();
  }

  public Data(int dia, int mes, int ano) {
    this.ano = ano;
    this.mes = mes;
    this.dia = dia;

    try {
      Validar();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public int getAno() {
    return this.ano;
  }

  public int getMes() {
    return this.mes;
  }

  public int getDia() {
    return this.dia;
  }

  public void setAno(int ano) {
    this.ano = ano;

    try {
      Validar();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void setMes(int mes) {
    this.mes = mes;

    try {
      Validar();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void SetDia(int dia) {
    this.dia = dia;

    try {
      Validar();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void setAno() {
    try {
      this.scanner = new Scanner(System.in);

      System.out.print("Insira um Valor de Ano Valido!");
      this.ano = scanner.nextInt();

      Validar();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void setMes() {
    try {
      this.scanner = new Scanner(System.in);

      int opcao;

      System.out.println("Selecione um mes: ");
      System.out.println();

      for (Mes mesAtual : Mes.meses) {
        System.out.println(mesAtual.codigo + " - " + mesAtual.nome);
      }

      System.out.println();

      boolean opcaoInvalida = false;

      do {
        if (opcaoInvalida) {
          System.out.println(
            "Opcao Invalida! Favor selecionar uma Valida!."
          );
        }

        System.out.print("Opcao: ");
        opcao = scanner.nextInt();

        opcaoInvalida = !CodMesValido(opcao);
      } while (opcaoInvalida);

      this.mes = opcao;

      Validar();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void SetDia() {
    try {
      this.scanner = new Scanner(System.in);

      System.out.print("Insira um valor de dia Valido: ");
      this.dia = scanner.nextInt();

      Validar();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public String getDiaCompleto() {
    String hourTemplate = "%s/%s/%s";

    String diaCompleto = String.format(
      hourTemplate,
      FormatarValorUnit(this.dia, 2),
      FormatarValorUnit(this.mes + 1, 2),
      FormatarValorUnit(this.ano, 4)
    );

    return diaCompleto;
  }

  public String getDiaCompleto(boolean mesExtenso) {
    String hourTemplate = "%s/%s/%s";

    String StrgMes = "";

    for (Mes mes : Mes.meses) {
      if (this.mes == mes.codigo) {
        StrgMes = mes.nome;
        continue;
      }
    }

    String diaCompleto = String.format(
      hourTemplate,
      FormatarValorUnit(this.dia, 2),
      StrgMes,
      FormatarValorUnit(this.ano, 4)
    );

    return diaCompleto;
  }

  public int getDiasPassados() {
    int cntDias = 0;

    cntDias += this.mes * 30;
    cntDias += this.dia;

    return cntDias;
  }

  public String getDiaAtual() {
    DateFormat dateFormat = DateFormat.getDateInstance(
      DateFormat.FULL,
      Locale.ENGLISH
    );

    String formattedDate = dateFormat.format(new Date());

    return formattedDate;
  }
}
