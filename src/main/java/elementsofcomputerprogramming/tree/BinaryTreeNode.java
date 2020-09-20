package elementsofcomputerprogramming.tree;

public class BinaryTreeNode<T> {
  public T data;
  public BinaryTreeNode<T> left, right;

  public static void treeTraversal(BinaryTreeNode<Integer> root){
      if(root != null){
        // Preprder: Process the root before traversal of left and right children
        System.out.println("Preorder : "+ root.data);
        treeTraversal(root.left);

        // Inorder: Process the root after the traversal of the left child and
        //before the traversal of the right child

        System.out.println("Inorder: " + root.data);
        treeTraversal(root.right);

        //Postorder : Processes the root after the traversal of left and right children
        System.out.println("Postorder : " + root.data);
      }
  }


}
