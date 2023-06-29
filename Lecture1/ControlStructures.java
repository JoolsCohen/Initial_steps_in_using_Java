package Lecture1;

public class ControlStructures {
  public static void main(String[] args) {
    int a = 1;
    int b = 2;
    int c;
    if (a > b){
      c = a;
    } else{
      c = b;
    }
    System.out.println(c);
  }
  public static void main1(String[] args) {
    int x = 1;
    int y = 2;
    int k = 0;
    if (x > y) k = x;
    if (y > x) k = y;
    System.out.println(k);
  }
  public static void main2(String[] args) {
    int n = 1;
    int m = 2;
    int min = n < m ? n : m;
    System.out.println(min);
  }
}

