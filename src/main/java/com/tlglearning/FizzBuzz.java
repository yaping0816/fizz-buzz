package com.tlglearning;

import java.util.EnumSet;
import java.util.Set;

public enum FizzBuzz {

  FIZZ, BUZZ;

  public static Set<FizzBuzz> valueOf(int num) {
    Set<FizzBuzz> result = EnumSet.noneOf(FizzBuzz.class);
    //when we need to pass a class as an argument, we use .class after the class name, every calss hava a cclass field
    if (num % 3 == 0) {
      result.add(FIZZ);
    }
    if (num % 5 == 0) {
      result.add(BUZZ);
    }

    return result;
  }
}
