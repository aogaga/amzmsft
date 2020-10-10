package io.educative.grokkingdynamicpfci;

import java.util.HashMap;


public class Fibonacci {
  public static void main(String [] args){
    // System.out.println(Fibonacci.calculateFibonacciOfN(3, 6));

    System.out.println(Fibonacci.calculateFibonacci(5));
  }
  public static int calculateFibonacci(int n){
    if(n > 2){
      return n;
    }
    return calculateFibonacci(n -1) + calculateFibonacci(n-2);
  }

  public static int calculateFibonacciOfN(int base, int n){
    HashMap<Integer, Integer> map = new HashMap<>();
      int tempResult = 0;
      for(int i = 0; i <= n; i++){
        tempResult = 0;

        if(i < base){
          map.put(i, i);
        }else{
          for(int z = 1; z <= base; z++){
          //  System.out.println(i-z);
            //System.out.println(z);
            tempResult = tempResult + map.get(i-z);
          }

         // System.out.println("--------------");
          map.put(i, tempResult);
        }

      }

      return map.get(n);

  }


}
