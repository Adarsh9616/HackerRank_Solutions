import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            Stack<Character> s=new Stack<Character>();
            for(int i=0;i<input.length();i++)
            {
                char c=input.charAt(i);
                if(!s.isEmpty())
                {
                    switch(c)
                    {
                        case '}':if(s.peek()=='{'){s.pop();}break;
                        case ']':if(s.peek()=='['){s.pop();}break;
                        case ')':if(s.peek()=='('){s.pop();}break;
                        default:s.push(c);
                    }

                }
                else
                {
                    s.push(c);
                }
            }
            System.out.println(s.isEmpty());

		}
		
	}
}



