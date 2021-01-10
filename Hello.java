public class Hello {
  private String name;
  public Hello() {
    name = "peace";
  }

  public void setName(String s) {
    name = s;
  }

  public void say() {
    System.out.println("Hello, " + name + "!");
  }
}
