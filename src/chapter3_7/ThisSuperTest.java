package chapter3_7;

public class ThisSuperTest {

  public static void main(String[] args) {
    CSub sub = new CSub(10.0);
    System.out.println(sub.x);
    System.out.println(sub.getSub());
    System.out.println(sub.getSuper());
  }

}
