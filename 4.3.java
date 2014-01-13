
class Solution{
    public static TreeNode buildBST(int[] array){
        return buildSubtree(array,0,array.length-1);
    }

    public static TreeNode buildSubtree(int[] array,int from,int to){
        if(from>to)
            return null;
        int rootIndex = (int)(to+from)/2;
        TreeNode newNode = new TreeNode(array[rootIndex]);
        newNode.left = buildSubtree(array,from,rootIndex-1);
        newNode.right = buildSubtree(array,rootIndex+1,to);

        return newNode;
    }
    
    public static void main(String args[]){
        int array[] = {0,1,2,3,4,5,6,7,8,9,100};
        TreeNode root = buildBST(array);
        root.print();
    }
}
