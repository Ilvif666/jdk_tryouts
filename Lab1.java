public class Lab1 {
  public static void main(String[] args) {
    Hello h = new Hello();
    for (String s : args) {
      h.setName(s);
      h.say();
    }
  }
}