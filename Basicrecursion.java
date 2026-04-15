public class Basicrecursion {
    public static void nameRecur(String name,int c){
        if(c==5){
            return;
        }
        System.out.println(name);
        nameRecur(name, c+1);
    }


     public static void numRecur(int n){
        if(n>10){
            return;
        }
        System.out.println(n);
        numRecur(n+1);
     }


     public static void numBacktrack(int n){
         if(n==10){
            return;
        }
        numBacktrack(n+1);
        System.out.println(n);
     }
    public static void main(String[] args) {
        String name = "Srinivas";
        nameRecur(name, 0);
        
        
        numRecur(1);


        numBacktrack(1);
    }
}
