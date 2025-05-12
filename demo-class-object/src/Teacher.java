public class Teacher {

  public static void distribute(Student[] students) {
    //System.out.println("students.length : " + students.length);
    int whos = 0;
    for (int i = 0; i < Candy.candys; i++) {
      
      if (whos <= students.length-1) {
        //System.out.println("whos 1 : " + whos);
        students[whos].studentGet++;
        whos ++;
      } else {
        //System.out.println("whos 2 : " + whos);
        students[0].studentGet++;
        whos = 1;
      }

    }
  }
  
  public static void main(String[] args) {

    // add 3 or 4 or many students
    //Student[] students = new Student[4];
    Student[] students = new Student[3];
    Student s1 = new Student("Peter");
    Student s2 = new Student("Paul");
    Student s3 = new Student("Mary");
    //Student s4 = new Student("Jack");
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;
    //students[3] = s4;

    distribute(students);

    for(int i = 0; i <students.length; i++){
      System.out.println(students[i].studentName + " received "
        + students[i].studentGet + " candys");
    }


  }
}
