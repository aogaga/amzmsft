package com.aogaga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Graph<T> {

  HashMap<T, ArrayList<T>> adjacencyList;

  public Graph(){
      adjacencyList = new HashMap<T, ArrayList<T>>();
  }

  public void addVertices(T num){
      if(this.adjacencyList.containsKey(num)){
        return;
      }
      this.adjacencyList.put(num, new ArrayList<T>());
  }

  public void addEdge(T source, T dest){
    if (!this.adjacencyList.containsKey(source)){
        this.addVertices(source);
    }

    this.adjacencyList.get(source).add(dest);

  }

  public void print(){
    Iterator<T> myiterator = (Iterator<T>) this.adjacencyList.entrySet().iterator();

    while(myiterator.hasNext()){
      Map.Entry elem = (Map.Entry) myiterator.next();
      ArrayList<T> mlist = (ArrayList<T>) elem.getValue();
      for(T x : mlist){
        System.out.println(x.toString());
      }

    }
  }


}
