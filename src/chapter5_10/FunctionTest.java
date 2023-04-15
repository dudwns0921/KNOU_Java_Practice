package chapter5_10;

import java.util.function.Function;

public class FunctionTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Student student1 = new Student("Elio", 1995);
    Student student2 = new Student("Rose", 1993);

    Function<Student, String> function1 = (student) -> {
      return student.getName();
    };
    Function<Student, Integer> function2 = (student) -> {
      return student.getYear();
    };

    System.out.println(function1.apply(student1));
    System.out.println(function2.apply(student2));

  }

}
