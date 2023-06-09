package chapter4_4;

import lombok.Getter;

@Getter
public class Circle implements Figure {
  public static final double PI = 3.141592;
  private double r;

  public Circle(double r) {
    this.r = r;
  }

  @Override
  public double getArea() {
    return this.r * this.r * Circle.PI;
  }

}
