package Lecture1;
// Два типа данных:
// 1 - ссылочные - классы, массивы, интерфейсы и тд
// 2 - примитивные - boolean, int, short, long, float, double, char.
/**
 * InnerVariables
 */

class InnerVariables {
  public static void main(String[] args) {
    short age =10;
    int salary = 123456;
    float e = 2.7f;
    double pi = 3.1415;
    char ch = '1';
    char a = 'a';
    boolean flag1 = 123 <= 234;
    boolean flag2 = 123 >= 234;
    boolean flag3 = flag1 ^ flag2;
    System.out.println("age = " + age);
    System.out.println("salary = " + salary);
    System.out.println("e = " + e);
    System.out.println("pi = " + pi);
    System.out.println("Ch = " + ch +". Is it digit?");
    System.out.println(Character.isDigit(ch));
    System.out.println("A = " + a +". Is it digit?");
    System.out.println(Character.isDigit(a));
    System.out.println("123 <= 234?");
    System.out.println(flag1);
    System.out.println("123 >= 234?");
    System.out.println(flag2);
    System.out.println("flag1 ^ flag2?");
    System.out.println(flag3);
  }
}





// public class Variables {
//   public static void main(String[] args) {
//     String s = null;
//     System.out.println(s);
//   }
// }

// class Variables1 {
//   public static void main(String[] args) {
//     float f = 123.45f;
//     double d = 123.45d; // можно без "d"
//     System.out.println();
//   }
// }

// class Variables2 {
//   public static void main(String[] args) {
//     char ch = '{';
//     System.out.println(ch);
//     char ch1 = 147;
//     System.out.println(ch1); //неявное преобразование, выведется "?"
//   }
// }

// class Variables3 {
//   public static void main(String[] args) {
//     int a = 13;
//     double d = a;
//     System.out.println(d);
//   }
// }

// class Variables4 {
//   public static void main(String[] args) {
//     boolean b = true && false;
//     System.out.println(b);
//   }
// }

// Конъюнкция(умножение)          Дизъюнкция(вычитание)         Дизъюнкция(вычитание)
// A   B   A&B                     A   B   A^B                  A   B   A|B
// 0   0    0                      0   0    0                   0   0    0
// 0   1    0                      0   1    1                   0   1    1
// 1   0    0                      1   0    1                   1   0    1
// 1   1    1                      1   1    1                   1   1    0