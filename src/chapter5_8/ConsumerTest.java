package chapter5_8;

import java.util.function.Consumer;

public class ConsumerTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Consumer<String> consumer = (String msg) -> System.out.println(msg);
    consumer.accept("hello world");
  }

}
