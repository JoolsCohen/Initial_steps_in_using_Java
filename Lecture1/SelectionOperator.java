package Lecture1;

public class SelectionOperator {
  public static void main(String[] args) {
    int month = 1;
    String text = "";
    switch (month) {
      case 1:
        text = "Fall";
        break;
      
      default:
      text = "mistake";
        break;
    }
    System.out.println(text);
  }
}
