import java.util.*;
public class Parenthisis {
    public static void stringParenthsis(String s){
       Stack<Character> s1 = new Stack<>();
       Stack<Character> s2 = new Stack<>();
       for(char ch : s.toCharArray()){
        if(ch == '('){
            s1.push('(');
        }
        else if (ch == ')'){
            s2.push(s1.pop());
            if(s1.isEmpty()){
                s2.pop();
            }
            else{
            s2.push(')');
            }
        }
        else{
            System.out.println("This case is not possible");
        }
       }
       System.out.println("The required Stack is: "+s2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        stringParenthsis(s);
    }
}
