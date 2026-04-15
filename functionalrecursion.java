public class functionalrecursion {
    public static int funcRecur(int n){
        if(n==0){
            return 0;
        }
        int res = n + funcRecur(n-1);
        System.out.println(res);
        return res;
    }
   public static void main(String[] args) {
        System.out.println(funcRecur(10));
   }   
}
