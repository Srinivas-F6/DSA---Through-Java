class TreeNode{
    int value;
    TreeNode left, right;

    public TreeNode(int value){
        this.value = value;
    }
}

class Tree{
    TreeNode root;

    public Tree(){

    }

    public void insert(int value){
       root = insertNode(value, root);
    }   

    public TreeNode insertNode(int value, TreeNode node){
        if(node == null){
           return new TreeNode(valu e);
        }

        if(value < node.value){
            node.left = insertNode(value, node.left);
        }

        if(value>node.value){
            node.right = insertNode(value, node.right);
        }
        return node;
    }
    
    public void display(TreeNode root){
        displayTree(root);
    }

    public void displayTree(TreeNode node){
        if(node == null){
            return;
        }
        displayTree(node.left);
        System.out.println(node.value);
        displayTree(node.right);
    }
}

public class TreeDemo {
    public static void main(String[] args){
        Tree t = new Tree();
        t.insert(33);
        t.insert(44);
        t.insert(99);
        t.insert(48);
        t.insert(1);
        t.insert(33);
        t.display(t.root);
    }
}
