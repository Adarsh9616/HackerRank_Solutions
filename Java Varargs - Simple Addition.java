

class Add
{
    void add(int... a)
    {
        int sum=0;
        for(int i=0;i<a.length-1;i++)
        {
            System.out.print(a[i]+"+");
            sum=sum+a[i];
        }
        System.out.print(a[a.length-1]);
        sum=sum+a[a.length-1];
        System.out.print("="+sum+"\n");
    }
}

