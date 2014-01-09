class Solution{
    public static void main(String[] args){
        
        int[] array = {0, 1, 2, 3, 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeNode.createMinimalBST(array);

        root.print();
        System.out.println("Is balanced? " + isBalanced(root));

        root.insertInOrder(4); // Add 4 to make it unbalanced
        root.print();
        System.out.println("Is balanced? " + isBalanced(root));
    }

    public static boolean isBalanced(TreeNode root){
        if(checkHeight(root)>=0)
            return true;
        else
            return false;
    }

    public static int checkHeight(TreeNode root){
        if(root==null)
            return 0;

        int left = checkHeight(root.left);
        if(left==-1)
            return -1;

        int right = checkHeight(root.right);
        if(right == -1)
            return -1;
        if(Math.abs(left-right)>1)
            return -1;
        return Math.max(left,right)+1;
    }
}
