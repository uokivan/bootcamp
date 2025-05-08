public class Day8Wrapper {
  public static void main(String[] args) {
        // 8 Primitives
    // corrsponding wrapper class
    // 8 + 8 + 1
    int x = 3;
    Integer x1 = 3;

    byte b = 4;
    Byte b1 = 4;

    short s = 9;
    Short s1 = 9;

    long l = 8L;
    Long l1 = 8L;

    char c = 'a';
    Character c1 = 'a';

    boolean n = true;
    Boolean n1 = true;

    float f = 1.03f;
    Float f1 = 1.03f;

    double d = 1.99;
    Double d1 = 1.99;

    String s2 = "hello";

    // ! Primitives vs Wrapper Class
    // 1. Primitives for value storage and Math Operations ONLY.
    // 2. Wrapper Class has methods
    // 3. Wrapper Class NEVER use operators (>,<,>=,<=,!=,==) for comparison

    System.out.println(x1.doubleValue()); // 3.0
    System.out.println(x + x1); // int + Integer -> int + int
    Integer x2 = 10;

    // Value Comparison (compareTo, equals)
    System.out.println("Comparison : " + x2.compareTo(x1)); // 1 , answer will show 1, means true (x2 > x1)
    Integer x3 = 10;
    System.out.println(x2.compareTo(x3)); // 0
    System.out.println(x1.compareTo(x2)); // -1
    // on ** compareTo ** , o is == , 1 is true, -1 is false

    if(x2.compareTo(x1)== 0){
      System.out.println("if else : ==");
    }else if (x2.compareTo(x1) > 0){
      System.out.println("if else : >");
    }else{
      System.out.println("if else : <");
    }

    System.out.println(x2.equals(x1)); // false

    // Math Operation
    System.out.println(x1 + x2); // 13
    System.out.println(x3 * x2); // 100

    System.out.println(Long.valueOf(5).compareTo(Long.valueOf(3))); // 1
  }
}
