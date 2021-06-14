package edu.cnm.deepdive;

/*
Given a non-negative number "num", return true if num is within 2 of a multiple of 10.

nearTen(12) → true
nearTen(17) → false
nearTen(19) → true
 */

public class CodingBatNearTen {

  public static void main(String[] args) {
    System.out.printf("with the number %s, the outcome is " + nearTen(12) + "\n", 12);
    System.out.printf("with the number %s, the outcome is " + nearTen(17) + "\n", 17);
    System.out.printf("with the number %s, the outcome is " + nearTen(19) + "\n", 19);
  }

  public static boolean nearTen(int num) {
    return (num % 10 < 3 || num % 10 >= 8);
  }

}
