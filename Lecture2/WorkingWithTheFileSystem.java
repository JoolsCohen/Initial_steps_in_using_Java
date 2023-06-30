package Lecture2;

// Работа с файловой системой.
// Для работы нужно:
// File <имя> = new File(<полный путь к файлу>);
// File f1 = new File("file.txt");
// File f2 = new File("/Users/sk/vscode/java_projects/file.txt");
// try {
//  Код, в котором может появиться ошибка
// } catch (Exception e) {
//  Обработка, если ошибка случилась
// }
// finally {
//  Код, который выполнится в любом случае
// }
import java.io.File;

// public class WorkingWithTheFileSystem {
//   public static void main(String[] args) {
//     try {
//       String pathProject = System.getProperty("user.dir");
//       String pathFile = pathProject.concat("/file.txt");
//       File f3 = new File(pathFile);
//       System.out.println("try");
//     } catch (Exception e) {
//       System.out.println("catch");
//     } finally {
//       System.out.println("finally");
//     }
//   }
// }

// class tryDemo {
//   public static void main(String[] args) {
//     try {
//       String pathProject = System.getProperty("user.dir");
//       String pathFile = pathProject.concat("/file.txt");
//       File file = new File(pathFile);
//       if (file.createNewFile()) {
//         System.out.println("file.created");
//       } else {
//         System.out.println("file.existed");
//       }
//     } catch (Exception e) {
//       System.out.println("catch");
//     } finally {
//       System.out.println("finally");
//     }
//   }}

//   String line = "empty";try
//   {
//     File file = new File(pathFile);
//     if (file.createNewFile()) {
//       System.out.println("file.created");
//     } else {
//       BufferedReader bufReader = new BufferedReader(new FileReader(file));
//       System.out.println("file.existed");
//       line = bufReader.readLine();
//       bufReader.close();
//     }
//   }catch(
//   Exception e)
//   {
//     // e.printStackTrace();
//   }finally
//   {
//     System.out.println(line);
//   }

class Ex0043 {
  public static void main(String[] args) {
    String pathProject = System.getProperty("user.dir");
    String pathDir = pathProject.concat("/files");
    File dir = new File(pathDir);
    System.out.println(dir.getAbsolutePath());
    if (dir.mkdir()) {
      System.out.println("+");
    } else {
      System.out.println("-");
    }
    for (String fname : dir.list()) {
      System.out.println(fname);
    }
  }
}
