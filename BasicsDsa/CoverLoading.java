package DSThroughJava.BasicsDsa;

public class CoverLoading {
    int x,y,z;
    public CoverLoading(){ 
        x=10;
        y=20;
        z=30;
    }
    public CoverLoading(int x,int y,int z){ 
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public void getSum(){
       System.out.println(x+y+z);
    }
public static void main(String[] args) {
    CoverLoading c1 = new CoverLoading();
    c1.getSum();
    CoverLoading c2 = new CoverLoading(2,44,3);
    c2.getSum();
  }
}
