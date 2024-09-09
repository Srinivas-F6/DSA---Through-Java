import java.util.*;
public class PracticeArr {
    public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
            int max=0,min=0;
		    for(int i= 0; i<n; i++){
		        arr[i] = sc.nextInt();
		        if(arr[i]>max){
		            max = arr[i];
		        }
		        else{
		            min = arr[i];
		        }
		    }
            System.out.println(max+" "+min);
		}
		sc.close();
    }
}
