package elementsofcomputerprogramming.tree;

public class BalanceStatusWithHeight {
  public boolean balanced;
  public int height;

  public BalanceStatusWithHeight(boolean balanced, int height){
    this.balanced = balanced;
    this.height = height;
  }

  public static boolean isBalanced(BinaryTreeNode<Integer> tree){
    return checkBalanced(tree).balanced;
  }


  public static BalanceStatusWithHeight checkBalanced(BinaryTreeNode<Integer> treeNode){
    if(treeNode == null){
      return new BalanceStatusWithHeight(true, -1);
    }

    BalanceStatusWithHeight leftresult = checkBalanced(treeNode.left);
    if(!leftresult.balanced){
        return leftresult;
    }

    BalanceStatusWithHeight rightResult = checkBalanced(treeNode.right);
    if(!rightResult.balanced){
      return rightResult;
    }

    boolean isBalanced = Math.abs(leftresult.height - rightResult.height) <= 1;
    int height = Math.max(leftresult.height, rightResult.height) + 1;
    return new BalanceStatusWithHeight(isBalanced, height);
  }
}
