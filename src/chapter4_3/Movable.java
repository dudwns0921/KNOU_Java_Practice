package chapter4_3;

public interface Movable {
  void add(double dx, double dy);

  void sub(double dx, double dy);

  default double change_sign(double v) {
    return v * (-1);
  }
}
