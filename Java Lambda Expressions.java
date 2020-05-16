
public static PerformOperation isOdd()
{
    return (int a)->a%2!=0;
}
public static PerformOperation isPrime()
{
        return (int a) -> java.math.BigInteger.valueOf(a).isProbablePrime(1);
    
}
    
    public static PerformOperation isPalindrome()
    {
        return (int a) ->  Integer.toString(a).equals( new StringBuilder(Integer.toString(a)).reverse().toString() );
    }
}
