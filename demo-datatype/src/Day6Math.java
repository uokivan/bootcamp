import java.math.BigDecimal;

public class Day6Math {
  public static void main(String[] args) {
    // pow
    // 2^4 = 16
    double result = Math.pow(2.0,4.0);
    System.out.println("result = " + result); // 16.0

    // 2^0
    double result2 = Math.pow(2.0,0.0);
    System.out.println("result = " + result2); // 1.0


    int x = 3;
    int y = 7;
    System.out.println(Math.abs(x-y)); // 4

    double d1 = 3.5;
    double d2 = 7.1;

    // Case 1:
    System.out.println("\n-------- Case 1 --------");
    System.out.println(Math.abs(d1-d2)); // 3.5999999999999996

    // Case 2:
    System.out.println("\n-------- Case 2 --------");
    //System.out.println( Math.abs( BigDecimal.valueOf(d1).subtract(BigDecimal.valueOf(d2)) ));
    //ERROR : "main" java.lang.Error

    // Case 3:
    System.out.println("\n-------- Case 3 --------");
    System.out.println( Math.abs( BigDecimal.valueOf(d1).doubleValue() - BigDecimal.valueOf(d2).doubleValue() ));
    // 3.5999999999999996

    // Case 4:
    System.out.println("-------- Case 4 --------");
    double backupDouble = (BigDecimal.valueOf(d1).subtract(BigDecimal.valueOf(d2))).doubleValue();
    System.out.println( Math.abs(backupDouble) ); // 3.6

    // Case 5:
    System.out.println("-------- Case 5 --------");
    System.out.println( Math.abs( (BigDecimal.valueOf(d1).subtract(BigDecimal.valueOf(d2))).doubleValue() ) ); // 3.6
  }
}
