
public class Practice {
    public static void main(String[] args) {
        String name = "srinivas";
        char ch[] = name.toCharArray();
        for(int i=0; i<name.length(); i++){
            System.out.println((int)ch[i]);
        }
        System.out.println((char)(99-'r'));
        System.out.print((int)('r'));
    }
}
