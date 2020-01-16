package edu.cnm.deepdive;

public class FizzBuzz {

  private static final int DEFUALT_ROOF = 100;

  public static void main(String[] args) {

    int roof = DEFUALT_ROOF;
    for(int i = 1; i<= roof; i++) {
      System.out.println(toString(i));
    }

  }


  public static String toString(int num) {
    String result = "";
      if (num % 15 == 0) {
        result = "FizzBuzz!";
      }
      else if (num % 5 == 0) {
        result = "Buzz!";
      }
      else if (num % 3 == 0) {
        result = "Fizz!";
      }
      else {
        result = String.valueOf(num);
      }
    return result;
  }

}
