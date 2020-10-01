package io.educative.dsforcodinginterviewsinjava.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;


public class CheckBFS {
    public static String bfs(Graph g){
        String result = "";

        if(g.vertices < 1){
            return result;
        }

        boolean[] visited = new boolean[g.vertices];

        for(int i = 0; i < g.vertices; i++){

            if(!visited[i]){
                result = result + bfVisit(g, i, visited);
            }
        }
        return result;
    }

    public static String bfVisit(Graph g, int source, boolean[] visited) {
        String result = "";
        Queue<Integer> queue = new Queue<Integer>(g.vertices);
         queue.enqueue(source);
         visited[source] = true;

         while (!queue.isEmpty()){
             int current_node = queue.dequeue();
             result += String.valueOf(current_node);

             Node<Integer> tmp = null;
             if(g.adjacencyList[current_node] != null){
                 tmp = g.adjacencyList[current_node].headNode;

                 while(tmp != null){
                     if(!visited[tmp.data]){
                         queue.enqueue(tmp.data);
                         visited[tmp.data] = true;
                     }

                     tmp = tmp.nextNode;
                 }
             }
         }
        return result;
    }


    public static String bfs2(Graph g){
        java.util.Queue<Integer> queue = new LinkedList<Integer>();
        HashMap<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
        String result = "";

        for(int i = 0; i < g.vertices;i++){
            if(!visited.containsKey(i)){
                visited.put(i, true);
                queue.add(i);
                result = result + i;
            }

            Node<Integer> tmp = g.adjacencyList[i].headNode;

            while(tmp != null){
                if(!visited.containsKey(tmp.data)) {
                    visited.put(tmp.data, true);
                     queue.add(tmp.data);
                     result = result + tmp.data;
                }

                tmp = tmp.nextNode;
            }
        }

           return result;
    }

    public static String bfs3(Graph g){
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Boolean> visited = new HashMap<>();

        for(int i = 0; i < g.vertices; i++){
           DoublyLinkedList<Integer> tmp = null;

           //System.out.println(i);
           if(visited.containsKey(i)){
               tmp = g.adjacencyList[i];
           }else{
               visited.put(i, true);
               sb.append(i);
               tmp = g.adjacencyList[i];
           }

           Node<Integer> currentNode = tmp.headNode;
           while(currentNode != null){
               if(!visited.containsKey(currentNode.data)){
                   visited.put(currentNode.data, true);

                   sb.append(currentNode.data);

               }

               currentNode = currentNode.nextNode;
           }
        }

      return sb.toString();
    }
}
