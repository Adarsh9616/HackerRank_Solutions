

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        java.util.SortedSet<String> ss=new java.util.TreeSet<String>();
        for(int i=0;i<s.length()-k+1;i++)
        {
            ss.add(s.substring(i,i+k));
        }
        smallest=ss.first();
        largest=ss.last();
        return smallest + "\n" + largest;
    }

