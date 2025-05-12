import java.util.Scanner;

public class Day8Scanner {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input a number:");
    int input = scanner.nextInt();
    System.out.println("The input is " + input);

    String s = ""; // EVEN or ODD
    if (input % 2 == 0) {
      s = "EVEN";
    } else {
      s = "ODD";
    }
    System.out.println("The input number is an " + s + " number.");
    scanner.close();
  }
}
