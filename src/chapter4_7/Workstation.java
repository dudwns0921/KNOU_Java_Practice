package chapter4_7;

public class Workstation implements Computer {
  @Override
  public void calculate(String order) {
    System.out.println("Workstation: " + order);
  }
}
