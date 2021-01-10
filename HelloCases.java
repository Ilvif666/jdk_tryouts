public class HelloCases {
    public static void main(String[] args) {
      switch (args.length) {
      case 1:
            System.out.println("Hello, " + args[0] + "!");
            break;
      case 0:
            System.out.println("Hello, world");
            break;
      case 2:
            System.out.println("Hello, "+args[0]+" and "+args[1]+"!");
            break;
      default:
            System.out.println("Hello all");
      }
    }
}
/*
В данном варианте выводятся разные сообщения при разном количестве аргументов входной
строки. Оператор break используется для выхода из блока switch. А вариант default
обрабатывается, если ни одно значение case не подошло.
*/
