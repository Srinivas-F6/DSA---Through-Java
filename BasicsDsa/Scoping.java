public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
         fun(a,b);
        System.out.println(a+" "+b);
    }
    static void fun(int a,int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
        // the values will be changed in this function only
    }
}
