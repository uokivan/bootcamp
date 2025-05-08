import java.math.BigDecimal;
import java.math.RoundingMode;

public class Day6BigDecimal {
  public static void main(String[] args) {
    double r1 = 0.1 + 0.2;
    System.out.println("r1 = " + r1); // 0.30000000000000004


    // 2 approaches to create BigDecimal Object
    BigDecimal bd1 = new BigDecimal("0.1");
    BigDecimal bd2 = BigDecimal.valueOf(0.2);

    BigDecimal bd3 = bd1.add(bd2);  // Math "+" operation
    System.out.println("bd3 is " + bd3);

    float f1 = bd3.floatValue();
    System.out.println("f1 = " + f1);

    double d1 = bd3.doubleValue();
    System.out.println("d1 = " + d1);

    int i1 = bd3.intValue();
    System.out.println("i1 = " + i1);

    String s1 = bd3.toString();
    System.out.println("s1 = " + s1);

    // subtract(), multiply()
    BigDecimal bd4 = bd1.subtract(bd2);
    System.out.println("bd4 = " + bd4);

    System.out.println("----------------------------");

    System.out.println(0.3 - 0.1);
    double result = BigDecimal.valueOf(0.3).subtract(BigDecimal.valueOf(0.1)).doubleValue();
    System.out.println("result = " + result);

    System.out.println("----------------------------");

    System.out.println(0.1 * 0.2);
    double result2 = BigDecimal.valueOf(0.1).multiply(BigDecimal.valueOf(0.2)).doubleValue();
    System.out.println("result2 = " + result2);

    System.out.println("----------------------------");

    // 3.333 * 2 -> 6.666 --> round 2 dp -> 6.67
    //double recult3 
    // ******* need check sir's note *********


    // divide
    System.out.println(0.3 / 0.1); // 2.9999999999999996

    double result3 = BigDecimal.valueOf(0.3).divide(BigDecimal.valueOf(0.1)).doubleValue();
    System.out.println("result3 = " + result3);

    // 10 / 3 -> 3.333333........
    double result4 = BigDecimal.valueOf(10).divide(BigDecimal.valueOf(3), 2, RoundingMode.DOWN).doubleValue();
    System.out.println("result4 = " + result4); // 3.33

    System.out.println("----------------------------");

    // 8.25 HALF_UP
    double result5 = BigDecimal.valueOf(16.5).divide(BigDecimal.valueOf(2), 1, RoundingMode.HALF_UP).doubleValue();
    System.out.println("result5 HALF_UP = " + result5); // 8.3


    // 8.25 HALF_UP
    double result6 = BigDecimal.valueOf(16.5).divide(BigDecimal.valueOf(2), 1, RoundingMode.HALF_DOWN).doubleValue();
    System.out.println("result6 HALF_DOWN = " + result6); // 8.2


  }
}
