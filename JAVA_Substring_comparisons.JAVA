    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int v= smallest.compareTo(largest);
        for (int i=0;i<= s.length()-k;i++){
            if(i==0){
                smallest= largest = s.substring(i, i+k);
            }else{
                String _s = s.substring(i,i+k);
                largest = largest.compareTo(_s)  < 0 ? _s : largest;
                smallest = smallest.compareTo(_s) > 0 ? _s : smallest;
            }
        }
        return smallest + "\n" + largest;
    }