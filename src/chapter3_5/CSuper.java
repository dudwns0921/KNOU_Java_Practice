package chapter3_5;

public class CSuper {
  private int f1;
  public int f2;

  public void setPrivate() {
    this.f1 = 10;
  }

  public void setPublic() {
    this.f2 = 10;
  }

  private void mPrivate() {
    this.f1 = 30;
  }
}
