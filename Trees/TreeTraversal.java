class Node{
    int value;
    Node left, right;

    Node(int value){
        this.value = value;
    }
}

class Traversals{
    int i=-1;

    public Node createTree(int[] arr){
        Node node = new Node(arr[++i]);
        if(node.value == -1){
            return null;
        }
        node.left = createTree(arr);
        node.right = createTree(arr);
        return node;
    }

    

}

public class TreeTraversal {
    public static void main(String[] args){
        int[] arr = {1,
            2,
            -1,
            -1,
            3,
            -1,
            -1};
        Traversals t = new Traversals();
        Node root = t.createTree(arr);
        System.out.println(root.value);

    }
}
