package io.educative.dsforcodinginterviewsinjava.graph;

public class Graph {
    int vertices;
    DoublyLinkedList<Integer>  [] adjacencyList;

    public Graph(int vertices){
        this.vertices = vertices;
        this.adjacencyList = new DoublyLinkedList[vertices];

        for (int i = 0; i < vertices; i++){
            adjacencyList[i] = new DoublyLinkedList<Integer>();
        }
    }

    public void printGraph()
    {
        System.out.println(">>Adjacency List of Directed Graph<<");
        for (int i = 0; i < vertices; i++)
        {
            if(adjacencyList[i]!=null){
                System.out.print("|" + i + "| => ");

          Node temp = adjacencyList[i].getHeadNode();
                while (temp != null)
                {
                    System.out.print("[" + temp.data + "] -> ");
                    temp = temp.nextNode;
                }
                System.out.println("null");
            }
            else{

                System.out.println("|" + i + "| => "+ "null");
            }
        }
    }

    public void addEdge(int source, int destination){
        if(source < vertices && destination < vertices){
            DoublyLinkedList<Integer> tempsource = this.adjacencyList[source] ;
            tempsource.insertAtEnd(destination);

            // for unidirected graph uncomment the line
//              DoublyLinkedList<Integer> tempdest = this.adjacencyList[destination];
//              tempdest.insertAtEnd(source);
        }
    }




}
