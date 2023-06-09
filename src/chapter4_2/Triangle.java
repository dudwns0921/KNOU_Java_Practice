package chapter4_2;

import lombok.Getter;

@Getter
public class Triangle implements Figure {
  private double height, width;

  public Triangle(double h, double w) {
    this.height = h;
    this.width = w;
  }

  @Override
  public double getArea() {
    return this.height * this.width * 0.5;
  }

}
