package io.educative.grokkingdynamicpfci;

import java.util.ArrayList;

public class Permutation {

  public static ArrayList<ArrayList<Integer>>  permute(int[] num){
      ArrayList<ArrayList<Integer>> result = new ArrayList<>();
      result.add(new ArrayList<Integer>());
      for(int i = 0; i < num.length; i++){
          ArrayList<ArrayList<Integer>> current = new ArrayList<>();

          for(ArrayList<Integer> l : result){

            for(int j = 0; j< l.size()+1; j++){
                l.add(j, num[i]);
                ArrayList<Integer> temp = new ArrayList<>(l);
                l.remove(j);
            }
          }
          result = new ArrayList<ArrayList<Integer>>(current);
      }
    return result;
  }
}
