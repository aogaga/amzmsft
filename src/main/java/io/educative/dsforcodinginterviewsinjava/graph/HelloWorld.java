package io.educative.dsforcodinginterviewsinjava.graph;

public class HelloWorld {
    public static void main(String args []){
        
        Graph g = new Graph(5);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(1,4);
        System.out.println("Graph1:");
        g.printGraph();
        System.out.println("DFS traversal of Graph1 : " + CheckDFS.dfs(g));
        System.out.println();
        System.out.println(CheckDFS.dfs2(g));

        Graph g2 = new Graph(5);
        g2.addEdge(0,1);
        g2.addEdge(0,4);
        g2.addEdge(1,2);
        g2.addEdge(4,3);
        System.out.println("Graph2:");
        g2.printGraph();
        System.out.println("DFS traversal of Graph2 : " + CheckDFS.dfs(g2));
        System.out.println(CheckDFS.dfs2(g2));



        System.out.println("--------------==================================-------------------");
      //System.out.println(CheckBFS.bfs(g));

       //System.out.println(CheckBFS.bfs2(g));


        
    }
}
