    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<Integer>();
            Set<Integer> s=new HashSet<Integer>();
            int n = in.nextInt();
            int m = in.nextInt();
            //int ar[]=new int[n];
            int max=Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) 
            {
                int num = in.nextInt();
                deque.add(num);
                s.add(num);
                if(deque.size()==m)
                {
                    if(s.size()>max)
                    {
                        max=s.size();
                    }
                    int k=deque.removeFirst();
                    if(!deque.contains(k))
                    {
                        s.remove(k);
                    }
                }
               
            }
            System.out.println(max);
        }
    }



