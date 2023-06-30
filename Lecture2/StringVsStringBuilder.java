package Lecture2;

public class StringVsStringBuilder {
  public static void main(String[] args) {
    String str = "";
    for (int i = 0; i < 1000000; i++) {
      str += "+";
    } // 40м.сек
  }

  public static void main1(String[] args) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 1000000; i++) {
      sb.append("+");
    } // 9м.сек
  }
}

/**
 * InnerStrings
 */
class InnerStrings {
  public static void main(String[] args) {
    String[] name = { "C", "е", "р", "г", "е", "й" };
    String sk = "СЕРГЕЙ КА.";
    System.out.println(sk.toLowerCase()); // сергей ка.
    System.out.println(String.join("", name)); // Cергей
    System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));
    // C,е,р,г,е,й
    System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));
  }
}
// Много изменений – String
// Много преобразований – StringBuilder
