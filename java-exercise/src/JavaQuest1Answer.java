/**
 * Expected Output:
 * 
 * I am going to add two numbers together:
 * The first one: 31
 * The second one: 42
 * The sum is 73
 * The subtraction reuslt is 11
 * The another sum result is 130   
 * The variable varB is false
 * The variable varC is true
 * The variable fnumber is -130.2
 * The variable dnumber is -20.5
 * The variable remainder is 1
 * The variable result is 3
 */
// Primitive types and operators
public class JavaQuest1Answer {

  public static void main(String[] args) {

    System.out.println("I am going to add two numbers together:");
    int first = 31;

// **************** My answer ****************
    //sum :
    int second = 42;
    int sum1 = first + second;
    System.out.println("The first one: " + first); // 31
    System.out.println("The second one: " + second); // 42
    System.out.println("The sum is " + sum1); // 73

    //subtract :
    int subtract = second - first;
    System.out.println("The subtraction reuslt is " + subtract); // 11

    // another sum :
    byte b1 = 60;
    byte b2 = 70;
     sum1 = b1 + b2;

    // code here with tips, pls fix ...
    // sum = b1 + b2;
    System.out.println("The another sum reuslt is " + sum1); // 130
    
    /*
    // declare two boolean variable with true and false value
    // code here
    System.out.println("The variable varB is " + varB);
    System.out.println("The variable varC is " + varC);

    // Reading Example
    float fnumber = -130.20f; // By default, numbers are treated as double in Java.
    // Use suffix 'f' with value to make it float.
    double dnumber = -20.50;
    System.out.println("The variable fnumber is " + fnumber);
    System.out.println("The variable dnumber is " + dnumber);

    // Find reminder. Declare variable a & reminder
    int a = 7;
    int b = 3;
    // Fix it ...
    int remainder = a % b;
    System.out.println("The variable remainder is " + remainder);

    // declare a variable x and assign value to it.
    int e = 7;
    int o = 8;
    int y = 4;
    // code here ... define the x and assign value to it
    int result = e - o * x / y;
    System.out.println("The result is " + result);
    
 */



  }
}