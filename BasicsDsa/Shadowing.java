public class Shadowing {
    static int x = 100; // this will be shadowed 
    public static void main(String[] args) {
        System.out.println(x);
        int x = 150;   // this  " x "  will be avaliable only in this scope
        System.out.println(x); 
        func();
    }
    static void func(){
        System.out.println(x); // This  " X " is printed from class variable
    }
}
