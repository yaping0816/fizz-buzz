package com.tlglearning;

public class Main {

  public static void main(String[] args) {
    int i = 1;
    while (i <= 100) {
      System.out.printf("%d: %s%n", i, FizzBuzz.valueOf(i));
      i++;

    }
  }

}
