public class Day4Operator {
  // ! shortcut : main
  public static void main(String[] args) {
    // +,-,*,/,%
    int x =3;
    x = 6 + 9;
    System.out.println(x);  // 15

    int y = 5 + x - 10;
    System.out.println(y);  // 10

    int b = (y-9) * 2;
    System.out.println(b); // 2

    //int r = 10 / 0;
    // System.out.println(r); // [ERROR]

    int r2 = 0 / 10;
    System.out.println(r2);  // 0


    // Java : int / int -> int
    int r3 = 10/3;
    System.out.println(r3); // 3 , not 3.33333

    // Java : int / int -> int
    System.out.println( 5/2 ); // 2 , not 2.5

    // Java : double / int -> double
    System.out.println( 5.0 / 2); //2.5
    System.out.println( 5 / 2.0); //2.5
    int score1 = 71;
    int score2 = 82;
    double averagScore = (score1 + score2)/2.0 ;
    System.out.println(averagScore);


    double score3 = 71;
    double score4 = 82;
    double averagScore2 = (score3 + score4)/2 ;
    System.out.println(averagScore2);

    // Big problem
    double d5 = 0.1 + 0.2;
    System.out.println(d5); //0.30000000000000004

    // ! remainder of 10 / 3 (餘數)
    int r8 = 10 % 3;
    int r7 = 10 / 3;
    System.out.println(r8); // 1
    System.out.println(r7); // 1

    boolean b9 = true;
    b9 =false;
    if(b9){
      System.out.println("b9 is " + b9);
    }

/*
    [ERROR]

    int b10 = 10;
    if(b10){
      System.out.println("b10 is " + b10);
    }

*/


    // +1 and -1
    int t = 0;
    t++;
    ++t;
    t = t + 1;
    t += 1;
    System.out.println("t = " + t);


    int w = 0;
    w--;
    --w;
    w = w -1;
    w -= 1;
    System.out.println("w = " + w);


    // + or -, non 1 value
    int o =3;
    o -= 4;
    System.out.println("o = " + o);

    o += 4;
    System.out.println("o = " + o);

    int q = 3;
    q = q * 3;
    q *= 3;
    System.out.println("q = " + q);

    int v = 27;
    v /= 3;
    System.out.println("v = " + v);

    v = v / 3;
    System.out.println("v = " + v);


    // Comparison
    // >, <, >=, <=, ==, !=

    int score =91;
    boolean isGradeA = score >= 90;
    System.out.println("Is Grade A : " + isGradeA);


    char gender = 'M';
    boolean isFemale = gender != 'M';
    System.out.println("Is Female : " + isFemale);


  }
}
