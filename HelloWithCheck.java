public class HelloWithCheck {
  public static void main(String[] args) {
    if (args.length > 0) {
      System.out.println("Hello, " + args[0] + "!");
    } else {
        System.out.println("Hello world!");
    }
  }
}
/*
Аналогично HelloWithExceptions.java Только обработка исключения
заменена предварительной проверкой количества элементов в массиве
*/
