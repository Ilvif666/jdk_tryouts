public class Main{
  public static void main(String[] args) {
    Point a = new Point();
    a.isVisible = true;
    Point b = new Point(20,50);
    System.out.println(""+a.x+" "+ a.y+" "+a.isVisible);
    System.out.println(""+b.x+" "+ b.y+" "+b.isVisible);
}
}
