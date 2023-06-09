package chapter4_1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Shape {
  private double height, width;

  public Shape(double h, double w) {
    height = h;
    width = w;
  }

  public abstract double getArea();

}
