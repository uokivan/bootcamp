public class Day3Loop {
  public static void main(String[] args) {
    // ! continue + Loop
    // Print all index of character 'a' in a given String
    String ss2 = "abcabcabc";
    for (int i = 0; i < ss2.length(); i++) {
      if (ss2.charAt(i) == 'a') {
        //System.out.println(i);
      }
    }
    for (int i = 0; i < ss2.length(); i++) {
      if (ss2.charAt(i) != 'a') {
        continue; // skip the rest of code lines, and then goes to next iteration
      }
      System.out.println(i);
    }

  }
}
