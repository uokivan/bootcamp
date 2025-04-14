public class Day4 {
  public static void main(String[] args) {
    //range : (-128 ~ 127)
    byte b1 = 3;
    short s1 =3;
    int i1 = 3;
    long l1 = 3;

    //int + int -> int (overflow)
    i1 = 2_147_483_647;
    i1 = i1 + 1;
    System.out.println(i1); // overflow

    // 1. Prepare an int value 22億  (right hand side) [ERROR]
    // 2. Assign a value into long variable (left hand side)
    // >>>> l1 = 2_200_000_000; //so it will system error
    //solution :
    // the long value + L = long
    l1 = 2_200_000_000L;
    l1 = l1 + 3;
    System.out.println(l1);


    // long + int -> long + long -> long
    long l2 =2_200_000_000L + 5;


    int i8 =9;
    // byte b9 = i8 [error]
    //because int i8 variable can be bigger than byte

    byte b10 = 3; //direct value

    // the range of int value should solve majority of the problems in system,
    // so we won't use long as a default type of variable for storing integer.

  }
}
