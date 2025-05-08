public class Day8ASCII {
  public static void main(String[] args) {
      // convert char to int
      char c = 'a'; // 97 in ascii
      int x = c; // safe, because int is bigger than char
      System.out.println(x); // 97
  
      int y = 65;
      char c2 = (char) y; // during compile time, variable y is int range.
      // convert from int to char is un-safe
      // ***************** char c2 = (char) y 強行把 int 輸入到 char 中 *****************
      System.out.println(c2); // 'A'
  
      System.out.println("****** (char) 48, int 48 to ASCII char : " + (char) 48); // '0'
  
      // ! char 0-65535
      System.out.println("(char) 65610 : " + (char) 65610); // J (ASCII: 74)
  
      int x1 = 128;
      byte b1 = (byte) x1;
      System.out.println(b1); // -128
  
      // byte -> short -> int -> long -> float -> double
      // char -> int
      float f1 = 10L;
      System.out.println(f1); // 10.0
      double d1 = 100.25f;
      System.out.println(d1); // 100.25

      // ******************************************
      // float to double 存在精度問題
      double d2 = 10.9f;
      System.out.println("double d2 = 10.9f : " + d2); // not 10.9, will show 10.899999618530273
      // ******************************************
  
      long l2 = (long) 10.9f;
      System.out.println(l2); // 10
  
      int x8 = 33000;
      short s3 = (short) x8;
      System.out.println(s3); // -32536
  }
}
