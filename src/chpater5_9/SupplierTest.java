package chpater5_9;

import java.util.function.Supplier;

public class SupplierTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Supplier<Integer> supplier = () -> {
      Integer rnd;
      rnd = (int) (Math.random() * 10);
      return rnd;
    };
    System.out.println(supplier.get());
  }

}