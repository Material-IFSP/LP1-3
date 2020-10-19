package DataPack;

public class Mes {
  public final int codigo;
  public final String nome;

  public static int[] mesesValidos = new int[] {
    0,1,2,3,4,5,6,7,8,9,10,11,
  };

  public static Mes[] meses = new Mes[] {
    new Mes(0, "Janeiro"),
    new Mes(1, "Fevereiro"),
    new Mes(2, "Marco"),
    new Mes(3, "Abril"),
    new Mes(4, "Maio"),
    new Mes(5, "Junho"),
    new Mes(6, "Julho"),
    new Mes(7, "Agosto"),
    new Mes(8, "Setembro"),
    new Mes(9, "Outubro"),
    new Mes(10,"Novembro"),
    new Mes(11,"Dezembro"),
  };

  private Mes(int codigo, String nome) {
    this.codigo = codigo;
    this.nome = nome;
  }
}