//**основной класс программы */
public class Lab1 {
  public static void main(String[] args) {
    Morning h = new Morning();
    for (String s : args) {
      h.setName(s);
      h.say();
    }
  }
}
