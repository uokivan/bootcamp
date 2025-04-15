public class Day4String {
  public static void main(String[] args) {
    // String is not primitive, which consist of a set of char values


    // 8 primitives -> store values ONLY
    // non primitive > String -> store values + functions

    String s3 = "John";
    s3 = "Vincent";
    System.out.println(s3);

    
    // * String can't use ==

    // Function 1: equals()
    System.out.println(s3.equals("Vincent"));  // true
    System.out.println(s3.equals("vincent"));  // false, case sensitive

    // Function 2: length()
    System.out.println(s3.length());  // 7

    // Function 3:  charAt()
    // index starts with 0
    // index range 0-6, length = 7
    System.out.println(s3.charAt(3));
    // System.out.println(s3.charAt(-1)); //[ERROR out of range] Index -1 out of bounds for length 7 (0-6)
    // System.out.println(s3.charAt(7)); //[ERROR out of range] Index -1 out of bounds for length 7 (0-6)

    // Question
    // print the last character of s3
    s3 = "Jody";
    System.out.println(s3.charAt(s3.length()-1));



    // ! Homework
    // Find the middle character of name
    String name1 = "Joey"; 
    // Joey -> e
    System.out.println("The char in the middle of " + name1 + " is " + name1.charAt((name1.length()+1)/2));

    String name2 = "Vincent";
    // Vincent -> c
    System.out.println("The char in the middle of " + name2 + " is " + name2.charAt(name2.length()/2));
    
  }
}
