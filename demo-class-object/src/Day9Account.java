public class Day9Account {
  private String userId;
  private double balance; // if null, is 0.0

  // Constructor
  public Day9Account() { // no parameter in (), is call : empty constructor
  }

  // All arguments constructor 
  public Day9Account(String userId, double balance) { // all parameter in (), is call : All arguments constructor
    this.userId = userId;
    this.balance = balance;
  }

  // write
  // ******** no return, so no "retrun type", so add "void" into the "retrun type"
  public void setBalance(double balance) {
    this.balance = balance;
  }

  // read
  public double getBalance() {
    return this.balance; // because balance is inside the class, so use "this.balance"
  }

  /* notes
   method (getter / setter) for more 便節性
  [public][return type][method nam]
  means : public is public, and then need input "return type", and then "method name"

  public int methodName(int x, int y){
    return x+y; // x+y is int "return type"
  }

  ******** void ********
  if no "retrun type" in method, will use "void"

  so in constructor no any "retrun type", so no "retrun type" / "void"


  in memony , JAVA is autoGC
  from POE
  在Java中，autoGC（自动垃圾回收）是指Java虚拟机（JVM）自动管理内存的一种机制。
  它负责自动检测和回收不再被引用的对象，从而释放内存空间，防止内存泄漏和溢出。

  垃圾回收的过程通常包括以下几个步骤：

  1. 标记：识别哪些对象是可达的，哪些是不可达的。
  2. 清除：回收不可达的对象所占用的内存。
  3. 压缩（可选）：整理内存空间，以减少碎片。

  通过自动垃圾回收，开发者可以专注于业务逻辑，而不必手动管理内存。
   */

  public static void main(String[] args) {
    // object reference : a1, a2 
    Day9Account a1 = new Day9Account("id1",1000.0);
    Day9Account a2 = new Day9Account();

    System.out.println(a1.userId);
    System.out.println(a1.balance);

    System.out.println(a2.userId);
    System.out.println(a2.balance);


    // class in array
    Day9Account[] accounts = new Day9Account[3]; // create Day9Account Array Object
    // Day9Account[3] is "Day9Account Array Object"
    // accounts is "object reference"

    Day9Account a3 = new Day9Account();
    Day9Account a4 = new Day9Account();
    a4.setBalance(500.0);
    Day9Account a5 = new Day9Account("id5",800.0);
    accounts[0] = a3;
    accounts[1] = a4;
    accounts[2] = a5;

    for (int i = 0; i < accounts.length; i++ ){
      System.out.println(accounts[i]); // what's that ?????????????
      System.out.println("userId is : " + accounts[i].userId);
      System.out.println("balance is : " + accounts[i].balance);
    }
    
  }
}
