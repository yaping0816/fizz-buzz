package com.tlglearning;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

  @Test
  void valueOf() {
//    assert Set.of(FizzBuzz.FIZZ).equals(FizzBuzz.valueOf(6)); //assert must follows by a boolean expression
//    assert won't enabled in our code, only enabled automatically in test code
    assertEquals(Set.of(FizzBuzz.FIZZ), FizzBuzz.valueOf(6)); //first arguments is what we expect, second is the method invocation
  }

}