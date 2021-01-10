public class Hello {
  private String name;
  public static void main(String[] args) {
    for (String s:args) {
      name = s;
      say();
    }
  }
  public static void say() {
    System.out.println("Hello, "+ name + "!");
  }
}
