public class validparenthesis
{
    public static boolean isValid(String s)     
    {
        
        char [] c = s.toCharArray();
        int i = 0;   
        
            if (c[i] == '{')
            {
                for (i = 0; i<c.length; i++)
                {
                    if (c[i+1] == '}')
                    {
                        return true;
                    }
                    else
                    {
                        i++;
                    }
                }
            }
                    
            if (c[i] == '(')
            {
                for (i = 0; i<c.length; i++)
                {
                    if (c[i+1] == ')')
                    {
                        return true;
                    }
                    else
                    {
                        i++;
                    }
                }
            }
                    
            if (c[i] == '[')
            {
                for (i = 0; i<c.length; i++)
                {
                    if (c[i+1] == ']')
                    {
                        return true;
                    }
                     else
                    {
                        i++;
                    }
                }
            }
                return false;
    }



        
    public static void main(String[] args) 
    {
        String s1 = "{} () []";
        System.out.println(isValid(s1));
        //System.out.println(isValid(s1));
    }
}