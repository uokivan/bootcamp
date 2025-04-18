public class DemoDataType {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        // Variable 變量
        // the following x and y are variable
        // Integer ( +ve 0 -ve)

        // "=" -> assignment ( from right to left )
        int x = 3;

        System.out.println("x is " + x);

        // put 7 into variable y
        int y = 7;

        System.out.println("y is " + y);

        
        //Re-assign value 10 into variable x
        x = 10;

        System.out.println("x is " + x);

        int result = x + y;

        System.out.println("result = " + result);

        // shortcut in vscode:  sysout -> System.out.println();
        System.out.println("shortcut is good");

        // Variable name convention:
        // 1. Must be start with a-z, can't start with number
        int wi = 3;

        // Camel Case:
        //int tutorFirstName = 3;
        String tutorFirstName = "Vincent";
        System.out.println("tutorFirstName : " + tutorFirstName);


        // Declaration for variable type  (聲明變量類型)
        // Same variable name can be declared once only
        int a;

        // ! Assingment
        a = 4;

        //! Declaration and Assingment
        int b = 4;

        System.out.println(a + b + wi + tutorFirstName);


        // double
        double d1 = 4.4;

        System.out.println("d1 is double = " + d1);

        // +, -, *, /
        int x2 = 6 + 1;
        System.out.println("x2 = " + x2);

        int x3 = 9;

        // put x3 value into variable x2
        x2 = x3;
        System.out.println("x2 now is " + x2);
        
        int x4 = 10;
        x2 = 7 + x4;
        System.out.println("x2 now is " + x2);


        x2 = x2 + 3;
        System.out.println("x2 now is " + x2);

        x2 += 3;
        System.out.println("x2 now is " + x2);


        // boolean (either true or false)
        boolean b9 = true;
        b9 =false;
        System.out.println(b9);

        // * We cannot assign a bigger range of variable to smaller range of variable (by default) 
        // Force assignment
        byte b40 = (byte) 129L;
        System.out.println("b40 : " + b40); // -127 (overflow)

        // char
        // single quote
        // assign char value 'a' into char variable
        char c1 = 'a';
        System.out.println(c1);

        char c2 = 'A';
        System.out.println(c1 == c2); // false, because Java is case sensitive

        char c3 = '陳';
        System.out.println(c3);

        // float (store decimal number)
        // 3.14159 is double valus
        // so unsafe (assign double value to float variable)
        //float f1 = 3.14159; [ERROR]
        float f1 = 3.14159f;
        System.out.println(f1);

        // Big problem
        f1 = 0.3f + 0.4f;
        System.out.println(f1); // 0.70000005
    }
}
