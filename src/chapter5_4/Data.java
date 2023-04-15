package chapter5_4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Data<T> {
  private T t;

  public Data(T t) {
    this.t = t;
  }

}
