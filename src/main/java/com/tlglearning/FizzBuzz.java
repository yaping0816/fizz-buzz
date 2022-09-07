package com.tlglearning;

public class FizzBuzz {

  public static final String FIZZ_RESULT = "fizz";
  public static final String BUZZ_RESULT = "buzz";

  public static String valueOf(int num) {
    String result = "";
    if(num % 3 == 0) {
      result = FIZZ_RESULT;
    }
    if(num % 5 == 0) {
      result += BUZZ_RESULT;
    }
    if(result.isEmpty()){
//      result += num;
      result = String.valueOf(num); //reference to a string version of num, this is a static method of String class
    }

    return result;
  }
}
