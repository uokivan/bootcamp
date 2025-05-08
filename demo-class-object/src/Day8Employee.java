public class Day8Employee { // An employee has name, age and email
  // Attributes
  private String varName;
  private int varAge;
  private String varEmail;


  public void setAllInput(String name, String email, int age ) {
    this.varName = name;
    this.varEmail = email;
    this.varAge = age;
  }



  // Object Method (Instance Method)
  public void setName(String name) {
    this.varName = name;
  }

  public String getName() {
    return this.varName;
  }

  public void setAge(int age) {
    this.varAge = age;
  }

  public int getAge() {
    return this.varAge;
  }

  public void setEmail(String email) {
    this.varEmail = email;
  }

  public String getEmail() {
    return this.varEmail;
  }

  // Runtime
  public static void main(String[] args) {
  /* 
    // Problem
    String employee1Name = "John";
    int employee1Age = 26;
    String employee1Email = "john@gmail.com";

    String employee2Name = "Steven";
    int employee2Age = 30;
    String employee2Email = "steven@gmail.com";
*/

    // Solution - Class and Object
    Day8Employee e1 = new Day8Employee();
    e1.setName("John");
    Day8Employee e2 = new Day8Employee();
    e2.setName("Sally");
    System.out.println(e1.getName()); // "John"

    // By Ivan
    Day8Employee e3 = new Day8Employee();
    e3.setAllInput("Peter", "peterpan@gmail.com", 25);
    System.out.println(e3.getName()); // "Peter"
    System.out.println(e3.getEmail());
    System.out.println(e3.getAge());

    // setAge, setEmail
    // getAge, getEmail
    e1 = e2;
    System.out.println(e1.getName()); // Sally
    System.out.println(e2.getName()); // Sally


    // e1 or e2 is object

  }
}
