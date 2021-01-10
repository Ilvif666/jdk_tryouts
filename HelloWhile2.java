public class HelloWhile2 {
    public static void main(String[] args) {
      int i = 0;
      switch (args.length) {
      case 0:
            System.out.println("Hello world");
            break;
      default:
            while (i < args.length) {
              System.out.println("Hello, "+args[i]+"!");
              i++;
            }
      }
    }
}
/*
Если условие перед началом цикла не выполняется,
 то входа в цикл не будет 
*/
