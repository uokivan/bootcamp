import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Day8Date {
  public static void main(String[] args) {
    //local day is from java8 for date value
    LocalDate ld1 = LocalDate.of(2024, 4, 28);
    LocalDate ld2 = LocalDate.of(2025, 03, 30);
    System.out.println("ld1.isAfter(ld2) : " + ld1.isAfter(ld2));
    System.out.println("ld1.isBefore(ld2) : " + ld1.isBefore(ld2));
    System.out.println("閏年 : " + ld1.isLeapYear()); //閏年
    System.out.println("isEqual : " + ld1.isEqual(ld2)   );
    System.out.println("--------");

    System.out.println("--------");
    System.out.println( ld1 + " plus 1 wreeks : " + ld1.plusWeeks(1));
    System.out.println("plus 5 years : " + LocalDate.of(2025, 4, 30).plusYears(5));

    System.out.println( ld1 + " plus 3 days : " + ld1.plusDays(3));
    System.out.println( ld1 + " plus 2 months : " + ld1.plusMonths(2));

    System.out.println("--------");
    System.out.println(LocalDate.of(2025, 4, 30) + " minusDays 減60日 : " + LocalDate.of(2025, 4, 30).minusDays(60)); // 2025-03-01

    System.out.println("--------");
    System.out.println(LocalDate.of(2025, 5, 1) + " 取得星期幾 (string):" + LocalDate.of(2025, 5, 1).getDayOfWeek()); // THURSDAY
    System.out.println(LocalDate.of(2025, 5, 1) + " 取得星期幾 (value):" + LocalDate.of(2025, 5, 1).getDayOfWeek().getValue());  // 4
    System.out.println(LocalDate.of(2025, 5, 1).getDayOfWeek().toString().toLowerCase() );  
    
    System.out.println("--------");
    System.out.println(LocalDate.of(2025, 5, 1) + " 取得月 (string):" + LocalDate.of(2025, 5, 1).getMonth().toString()); // MAY
    System.out.println(LocalDate.of(2025, 5, 1) + " 取得月 (value):" + LocalDate.of(2025, 5, 1).getMonth().getValue()); // 5
    System.out.println(LocalDate.of(2025, 5, 1) + " 取得月 (value):" + LocalDate.of(2025, 5, 1).getMonthValue()); // 5

    System.out.println(LocalDate.of(2025, 5, 1) + " 取得星期幾 :" + LocalDate.of(2025, 5, 1).getDayOfYear()); // 121

    System.out.println("--------");
    // 公元年
    // https://labex.io/tutorials/java-java-localdate-getera-method-117792
    // https://english.cool/bcbcead/ 
    // https://zh-yue.wikipedia.org/wiki/%E5%85%AC%E5%85%83 
    System.out.println(LocalDate.of(2025, 5, 1) + " 公元年 :" + LocalDate.of(2025, 5, 1).getEra());  // CE

    System.out.println("--------");
    LocalDateTime dateTime1 = LocalDateTime.of(2025, 5, 1, 13, 59, 10);
    System.out.println("dateTime1 : " + dateTime1);
    System.out.println("dateTime1 (string) : " + dateTime1.toString());
  }
}
