
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(10,33,44,2,4);
    }
    static void fun(int ...v){ //  ...V is used as a array syntax.
      System.out.println(Arrays.toString(v));
    }
}
