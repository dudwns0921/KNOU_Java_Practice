package chapter5_3;

public class OrderedPair<K, V> implements Pair<K, V> {
  private K key;
  private V value;

  public OrderedPair(K k, V v) {
    // TODO Auto-generated constructor stub
    this.key = k;
    this.value = v;

  }

  @Override
  public K getKey() {
    // TODO Auto-generated method stub
    return this.key;
  }

  @Override
  public V getValue() {
    // TODO Auto-generated method stub
    return this.value;
  }

}
