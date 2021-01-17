public class Hello2 {
  public static void main(String[] args) {
    System.out.println("Hello, " + args[0] + "!");
  }
}

/*
 Массив args типа String содержит список аргументов командной строки. Аргументы
 разделяются пробелами. Элемент массива args[0] содержит первый аргумент командной
 строки после имени программы.
 > javac Hello.java
 > java Hello Вася
 Привет, Вася!
 Однако, данная программа не защищена от ошибок. Если при запуске ни одного аргумента не
 указать, то появится следующее сообщение:
 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
  at Hello.main(Hello.java:4)
 Возникло исключение при попытке обратиться к элементу массива с несуществующим
 индексом.
*/
