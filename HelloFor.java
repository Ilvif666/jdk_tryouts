public class HelloFor {
  public static void main(String[] args) {
    for (int i = 0; i < args.length; i++) {
        System.out.println("Hello, "+args[i]+"!");
    }
  }
}
/*
при нулевом количестве входных аргументов цикл не отработает - ничего проверять не надо
*/
