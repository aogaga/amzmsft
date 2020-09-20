package progrqamminginterviewexposed.tree.bst;

public class Node {
  private  Node left;
  private  Node right;
  private int value;

  public Node(Node left, Node right, int value){
      this.left = left;
      this.right = right;
      this.value = value;
  }

  public Node getLeft(){return  this.left;}
  public Node getRight(){ return this.right;}
  public int getValue(){ return  value;}


  //iterative approach
  public  Node findNode(Node root, int value){
      Node currentNode = root;

      if(currentNode == null){
        return null;
      }



      while(currentNode != null){

        if(currentNode.getValue() == value){
          return currentNode;
        }
        if (currentNode.getValue() < value){
          currentNode = currentNode.left;
        }else{
          currentNode = currentNode.right;
        }
      }

      return null;
  }


  public Node findNodeRecursively(Node root, int value){
    if(root.getValue() == value){
      return  root;
    }

    if(root.getValue() < value){
      return findNodeRecursively(root.left, value);
    }else {
      return findNodeRecursively(root.right, value);
    }
  }



}
