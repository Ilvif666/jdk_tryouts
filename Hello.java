/** класс для приветствия типа "Hello" */
public class Hello {
    protected String name;
  /** Если имя было  не задано,
    то будет использоваться слово "мир". */
  public Hello() {
    name = "world";
  }
  public void setName(String s) {
    name = s;
  }
  /** вывод приветствия */
  public void say() {
    System.out.println("Hello, " + name + "!");
  }
}
