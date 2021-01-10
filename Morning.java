/** класс дляприветствия типа "bad morning" */
public class Morning extends Hello {
  public void say() {
    System.out.println("Bad morning, " + name + "!!!!!11");
  }
}
/*
класс Morning наследуется от класса Hello при помощи extends
переменная name в Hello.java определяется как protected, это позволяет получить
к ней доступ не только из класса Hello, но и из его потомков
setName работает по старому - его не меняем, а вот say() в Morning необходимо переписать

*/
