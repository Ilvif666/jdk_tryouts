public class Hello {
  private String name;

  public Hello() {
    name = "peace";
  }

  public void setName(String s) {
    name = s;
  }

  public static void main(String[] args) {
    Hello h = new Hello();
    for (String s : args) {
      h.setName(s);
      h.say();
    }
  }
  public void say() {
    System.out.println("Hello, " + name + "!");
  }
}
/*
в предыдущем примере не было ООП. Убираем static у переменной name и метода say()
Добавляем конструктор, который присваивает переменной name начальное значение
а также метод setName(String) для установки имени.
Теперь в методе main создается объект с помощью оператора new и вызываются его методы
*/
