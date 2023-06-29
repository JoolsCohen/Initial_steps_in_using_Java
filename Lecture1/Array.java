package Lecture1;
// одномерные
public class Array {
  public static void main(String[] args) {
    int[] arr = new int[10];
    System.out.println(arr.length);
    arr = new int[] { 1, 2, 3, 4, 5 };
    System.out.println(arr.length);

  }
}
// многомерные
/**
 * InnerArray
 */
class InnerArray {
  public static void main(String[] args) {
    int[] arr[] = new int[3][5];
    for (int[] line : arr){
      for (int item : line) {
        System.out.println(item);
      }
    }
  }
}