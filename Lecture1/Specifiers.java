package Lecture1;
// %d: целочисленных значений
// %x: для вывода шестнадцатеричных чисел
// %f: для вывода чисел с плавающей точкой
// %e: для вывода чисел в экспоненциальной форме,
// например, 3.1415e+01
// %c: для вывода одиночного символа
// %s: для вывода строковых значений

public class Specifiers {
  public static void main(String[] args) {
    float pi = 3.1415f;
 System.out.printf("%f\n", pi); // 3,141500
 System.out.printf("%.2f\n", pi); // 3,14
 System.out.printf("%.3f\n", pi); // 3,141
 System.out.printf("%e\n", pi); // 3,141500e+00
 System.out.printf("%.2e\n", pi); // 3,14e+00
 System.out.printf("%.3e\n", pi); // 3,141e+00
  }
}
