import java.util.Arrays;

public class Day6Array {
  public static void main(String[] args) {
    String[] arr3 = new String[3];
    arr3[0] = "abc";
    arr3[1] = "def";
    arr3[2] = "bootcamp";

    for (int i = 0; i < arr3.length; i++){
      System.out.println(arr3[i]);
    }

    String[] arr4 = new String[] {"abc", "defg", "bootcamp"};

    for (int i =0; i < arr4.length; i++){
      System.out.println("dddd : " + arr4[i]);
    }



    // for loop + if
    System.out.println("--------------");
    System.out.println(" for loop + if --------------");

    for (int i =0; i < arr4.length; i++){
      if(arr4[i].length() > 4){
        System.out.println("length > 4 is : " + arr4[i]);
      }else{
        System.out.println(arr4[i].length());
      }
    }

    // for loop + if (AND OR)
    System.out.println("--------------");
    System.out.println(" for loop + if (AND) --------------");

    for (int i =0; i < arr4.length; i++){
      if(arr4[i].length() > 2 && arr4[i].startsWith("a")){
        System.out.println("The answer is : " + arr4[i]);
      }else{
        System.out.println(arr4[i].length());
      }
    }

    // 
    System.out.println("--------------");
    System.out.println(" for loop + if (OR) --------------");

    for (int i = 0; i < arr4.length; i++){
      if(arr4[i].length() == 3 || arr4[i].endsWith("p")){
        System.out.println("The answer is : " + arr4[i]);
      }else{
        System.out.println(arr4[i].length());
      }
    }

    System.out.println("--------------");
    System.out.println("--------------");

    int[] arr5 = new int[] {4, 7, -3, 1500, -100, 1000};
    int maxNumber = arr5[0];

    for (int i = 0; i < arr5.length; i++){
        if(arr5[i] > maxNumber){
          maxNumber = arr5[i];
        }
    }
    System.out.println("maxNumber is " + maxNumber);

    int minNumber = arr5[0];
    
    for (int i = 0; i < arr5.length; i++){
      if( arr5[i] < minNumber ){
        minNumber = arr5[i];
      }
  }
  System.out.println("minNumber is " + minNumber);


  // swap
  int a = 6;
  int b = 8;

  int backup = a;
  a = b;
  b = backup;

  System.out.println(" a = " + a);
  System.out.println(" b = " + b);


//--------------------------------------------------------------
  // want to ask
  int[] vv = new int[1];
  vv[0] = 1;
  //vv[1] = 2;
  //vv[2] = 3;  //Index 1 out of bounds for length 1

    for (int i = 0; i < vv.length; i++){
      System.out.println(" vv = " + vv[i]);
    }
//--------------------------------------------------------------


    int[] arr6 = new int[] {9, 7, 10, -3, 8};
    int backupNumber;
    int backupNumber2;

    for(int i = 0; i < arr6.length - 1; i++){
      if(arr6[i] > arr6[i + 1]){
        backupNumber = arr6[i];
        arr6[i] =  arr6[i + 1];
        arr6[i + 1] = backupNumber;
      }
    }
    System.out.println(Arrays.toString(arr6));


    // Softing
    arr6 = new int[] {9, 7, 10, -3, 8};

    for(int i = 0; i < arr6.length - 1; i++){
      for(int j = 0; j < arr6.length - 1 - i; j++){
        if(arr6[j] > arr6[j + 1]){
          backupNumber2 = arr6[j];
          arr6[j] =  arr6[j + 1];
          arr6[j + 1] = backupNumber2;
        }
      }
    }
    System.out.println(Arrays.toString(arr6));


  }
}