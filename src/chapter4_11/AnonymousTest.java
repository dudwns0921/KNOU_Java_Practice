package chapter4_11;

public class AnonymousTest {
  public static void main(String[] args) {
    CSuper sub = new CSuper() {
      public void method1() {
        System.out.println("sub1");
      };
    };

    sub.method1();
  }
}
