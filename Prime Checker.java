
import static java.lang.System.in;
class Prime
{
    void checkPrime(int ...a)
    {
        for(int i:a)
        {
            boolean c=true;
            for(int j=2;j*j<=i;j++)
            {
                if(i%j==0)
                {
                    c=false;
                    break;
                }

            }
            if(c&&i!=1)
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
