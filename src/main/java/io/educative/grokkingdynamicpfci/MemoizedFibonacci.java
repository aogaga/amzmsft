package io.educative.grokkingdynamicpfci;

public class MemoizedFibonacci {
    public static void main(String [] args){
      System.out.println(calCulateFibonacci(7));
    }
    public static int calCulateFibonacci(int n){

      int [] memoize = new int[n+1];
      return calCulateMemoizedFibonacci(memoize, n);
    }


    public static int calCulateMemoizedFibonacci(int [] memoized, int n){
      if(n < 2){
        return n;
      }

      if(memoized[n] != 0){
        return memoized[n];
      }

      memoized[n] = calCulateMemoizedFibonacci(memoized, n-1) + calCulateMemoizedFibonacci(memoized, n-2);
      return memoized[n];
    }
}
