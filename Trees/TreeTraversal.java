import java.util.*;
class Node{
    int value;
    Node left, right;

    Node(int value){
        this.value = value;
    }
}

class Traversals{
    Node root;
    public void ConstructBst(int value){
        root = constructTree(value, root);
    }
   public Node constructTree(int value, Node node){
        if(node  == null){
            return new Node(value);
        }

        if(value < node.value){
            node.left = constructTree(value, node.left);
        }
        else if(value > node.value){
            node.right = constructTree(value, node.right);
        }
        return node;
   }

   public void display(){
      displayPreOrder(root);
      System.out.println();
      displayInOrder(root);
      System.out.println();
      displayPostOrder(root);  
      System.out.println();
      LevelOrder(root);
   }

   public void displayPreOrder(Node node){
      if(node == null){
        return;
      }
      System.out.print(node.value+"  ");
      displayPreOrder(node.left);
      displayPreOrder(node.right);      
   }
   public void displayInOrder(Node node){
      if(node == null){
        return;
      }
      displayInOrder(node.left);
      System.out.print(node.value+"  ");
      displayInOrder(node.right);      
   }
    
    public void displayPostOrder(Node node){
        if(node == null){
          return;
        }
        displayPostOrder(node.left);
        displayPostOrder(node.right);  
        System.out.print(node.value+"  ");
    }

    public void LevelOrder(Node node){
        if(node == null){
            return;
        }
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);
        while(!q.isEmpty()){
            Node Current = q.poll();
            System.out.print(Current.value+ " ");
            if(Current.left!=null){
                q.add(Current.left);
            }
            if(Current.right!=null){
                q.add(Current.right);
            }
        }
    }
}

public class TreeTraversal {
    public static void main(String[] args){
       Traversals t = new Traversals();
       t.ConstructBst(20);
       t.ConstructBst(10);
       t.ConstructBst(30);
       t.ConstructBst(2);
       t.ConstructBst(3);
       t.ConstructBst(21);
       t.ConstructBst(200);
       t.display();
    }
}
