package chapter5_5;

public class MultipleType {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Pair<String, Integer> pair = new OrderedPair<>("Even", 8);
    Pair<String, String> pair2 = new OrderedPair<>("hello", "java");
    System.out.println(pair.getKey());
    System.out.println(pair.getValue());
    System.out.println(pair2.getKey());
    System.out.println(pair2.getValue());

  }

}
