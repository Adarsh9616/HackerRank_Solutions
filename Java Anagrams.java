

    static boolean isAnagram(String a, String b) 
    {
        String A = a.toUpperCase();
        String B = b.toUpperCase();
        if(A.length()!=B.length()) return false;
        int[] c = new int[26] , d = new int[26];
        for(int i=0;i<A.length();i++)
        {
            c[A.charAt(i)-'A']++;
            d[B.charAt(i)-'A']++;
        }
   
        for(int i=0;i<26;i++)
        {
            if(c[i]!=d[i]) return false;
        }
   
        return true;
        
    } 

