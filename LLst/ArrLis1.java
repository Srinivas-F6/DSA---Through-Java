import java.util.*;
public class ArrLis1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lst = new ArrayList<>();
        ArrayList<Integer> lst1 = new ArrayList<>();

       int size = sc.nextInt();
        for(int i=0;i<size; i++){
            lst.add(sc.nextLine());
        }
        lst.remove(2);
        System.out.println(lst);
        for(int i=0; i<size; i++){
            lst1.add(sc.nextInt());
        }
        lst1.remove(4);
        System.out.println(lst1);
        sc.close();
    }
}
