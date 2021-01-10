public class HelloWhile {
    public static void main (String[] args) {
      int i = 0;
      switch (args.length) {
      case 0:
            System.out.println("Hello world!");
            break;
      default:
            do {
              System.out.println("Hello, " + args[i] + "!");
              i++;
            } while (i < args.length);
      }
    }
}
/*
Так как условие выхода из цикла проверяется после тела цикла,
то цикл выполнится хотя бы один раз,
поэтому проверку количества аргументов производить надо.
*/
