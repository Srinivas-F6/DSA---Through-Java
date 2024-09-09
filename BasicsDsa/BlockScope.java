public class BlockScope {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        {
            // int a = 70; already initialize outside the block, it is invalid 
             a = 100; //reassign the new value to the variable 
            // System.out.println(a); ---->It will give --->100
             int c = 44;
            //  values initialize in this block , will remain in this block
        }
        System.out.println(a);

        // System.out.println(a);  it will give----> 100
        // System.out.println(c); // cannot use the outside the block 
        // Anything u initilize outside the block , u can't reinitilize inside the block
        // u can change the value inside the block

    }
}
