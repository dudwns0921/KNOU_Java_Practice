package chapter5_6;

import chapter5_5.Pair;

public class Util<K, V> {
  public boolean compare(Pair<K, V> pair, Pair<K, V> pair2) {
    return pair.getKey().equals(pair2.getKey()) && pair.getValue().equals(pair2.getValue());
  }
}
