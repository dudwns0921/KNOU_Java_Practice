package chapter3_5;

public class InheritTest {

  public static void main(String[] args) {
    Csub cs = new Csub();
    // cs.f1 = 40;
    // 컴파일 오류
    cs.f2 = 50;
    // cs.f3 = 60;
    // 컴파일 오류
    cs.f4 = 60;
    cs.setPrivate();
    cs.setPublic();
    // cs.mPrivate();
    // 컴파일 오류
  }

}
