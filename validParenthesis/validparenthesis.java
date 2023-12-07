import java.util.*;
public class validparenthesis
{
    public static boolean isValid(String s)     
    {
        
        Stack<Character> st = new Stack<Character>();
        for (char c : s.toCharArray())
        {
            if (c=='{' || c=='(' || c=='[')
            {
                st.push(c);
            }
            else
            {   
                if (st.isEmpty())
                { 
                return false;
                }
                char lastIn = st.peek();
                if ( (c=='}' && lastIn =='{') || (c==']' && lastIn=='[') || (c==')' && lastIn =='(') ) 
                {
                    st.pop(); 
                }
                else
                {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) 
    {
        String s1 = "{";
        System.out.println(isValid(s1));
    }
}