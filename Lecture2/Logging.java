package Lecture2;
// Использование

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

// Logger logger = Logger.getLogger()
// Уровни важности
// INFO, DEBUG, ERROR, WARNING и др.
// Вывод
// ConsoleHandler info = new ConsoleHandler();
// log.addHandler(info);
// Формат вывода: структурированный, абы как*
// XMLFormatter, SimpleFormatter

import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.SimpleFormatter;

public class Logging {
  /**
   * @param args
   * @throws IOException
   */
  public static void main(String[] args) throws IOException {
    final Logger logger = Logger.getLogger(Logging.class.getName());
    // ConsoleHandler ch = new ConsoleHandler();
    FileHandler fh = new FileHandler("log.txt");
    // logger.addHandler(ch);
    logger.addHandler(fh);
    SimpleFormatter sFormat = new SimpleFormatter();
    // XMLFormatter xml = new XMLFormatter();
    fh.setFormatter(sFormat);
    // fh.setFormatter(xml);
    // logger.setLevel(Level.INFO);
    logger.log(Level.WARNING, "Тестовое логирование 1");
    logger.info("Тестовое логирование 2");
  }
}
