package chapter4_4;

public class InterfaceTest {

  public static void main(String[] args) {
    Figure figure, figure2;

    figure = new Triangle(3.0, 4.0);
    figure2 = new Circle(5.0);

    System.out.println(figure.getArea());
    System.out.println(figure2.getArea());
  }

}
