package com.tlglearning;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

  @Test
  void valueOf_fizz() {
    assertEquals(Set.of(FizzBuzz.FIZZ), FizzBuzz.valueOf(6)); //first arguments is what we expect, second is the method invocation
  }

  @Test
  void valueOf_buzz() {
    assertEquals(Set.of(FizzBuzz.BUZZ), FizzBuzz.valueOf(10)); //compare contents/state. not address, assertSame check the objects, arre they point to the same address
  }

  @Test
  void valueOf_fizzBuzz() {
    assertEquals(Set.of(FizzBuzz.FIZZ, FizzBuzz.BUZZ), FizzBuzz.valueOf(15)); //compare contents/state. not address, assertSame check the objects, arre they point to the same address
  }

  @Test
  void valueOf_none(){
    assertEquals(Set.of(), FizzBuzz.valueOf(7));
  }


}