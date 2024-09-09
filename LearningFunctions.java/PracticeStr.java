package Java.LearningFunctions.java;
import java.util.*;
public class PracticeStr {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    String s = sc.nextLine();
		    char ch[] = s.toCharArray();
		    for(int i=0; i<s.length(); i++){
		        if(ch[i] == '>'){
		            ch[i] = '<';
		        }
		        else if(ch[i] == '<'){
		            ch[i] = '>';
		        }
		    }
		    int c=0;
		    for(int i=0; i<s.length()-1; i++){
		        if(ch[i]=='>' && ch[i+1]=='<'){
		            c++;
		        }
		    }
		    System.out.println(c);
		}
	}
}
