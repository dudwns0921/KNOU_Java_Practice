package chapter4_3;

import lombok.Getter;

@Getter
public class Point implements Movable {
  private double x, y;

  public Point(double input_x, double input_y) {
    this.x = input_x;
    this.y = input_y;
  }

  @Override
  public void add(double dx, double dy) {
    this.x += dx;
    this.y += dy;

  }

  @Override
  public void sub(double dx, double dy) {
    this.x -= dx;
    this.y -= dy;
  }

}
