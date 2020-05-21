package edu.cnm.deepdive;

public class FizzBuzz {
  public static void main(String[] args) {

    for (int counter = 1; counter < 100; counter++) {
      // - CHeck whether the current counter value is fizz, buzz or both.
      // - Print the number, or fizz, or buzz or fizzbuzz, as appropriate.
      boolean counterIsFizz = (counter % 3 == 0);
      boolean counterIsBuzz = (counter % 5 == 0);

//TODO Compute and assign boolean values to counterIsFizz and counterIsBuzz
      // counter is divisible by 3 and 5.
      // otherwise, if counterIsfizz then print fizz;
      // otherwise, if counterIsBuzz, then print buzz;
      // otherwise, print counter.
      if (counterIsFizz && counterIsBuzz) {
        System.out.println("fizzbuzz");
      } else if (counterIsFizz){
        System.out.println("fizz");
      } else if (counterIsBuzz) {
        System.out.println("buzz");
      } else {
        System.out.println(counter);
      }
    }
  }

}

