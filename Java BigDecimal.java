

        //Write your code here
        Arrays.sort(s,0,n,Collections.reverseOrder(new Comparator<String>(){
            @Override
             public int compare(String a1, String a2)
                 {
                    BigDecimal a = new BigDecimal(a1);
                    BigDecimal b = new BigDecimal(a2);
                    return a.compareTo(b);
                 }
        }));
