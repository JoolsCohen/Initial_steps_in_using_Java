package Lecture1;

public class Cycles {
  public static void While(String[] args) {
    int value = 321;
    int count = 0;
    while (value != 0) {
      value /= 10;
      count++;
    }
    System.out.println(count);
  }

  public static void DoWhile(String[] args) {
    int value = 321;
    int count = 0;
    do {
      value /= 10;
      count++;
    } while (value != 0);
    System.out.println(count);
  }
  public static void For(String[] args) {
    for (int index = 0; index <10; index++) {
      if (index % 2 == 0) continue;
      System.out.println(index);
    }
  }
  public static void Foreach(String[] args) {
    int[] arr = new int[] {1,2,3,4,5,77};
    for (int item : arr) {
      System.out.println(item);
    }
  }
}
