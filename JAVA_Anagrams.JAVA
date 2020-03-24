    static boolean isAnagram(String a, String b) {
        // Complete the function
        int n_a = a.length();
        int n_b= b.length();
        a=a.toLowerCase();
        b=b.toLowerCase();
            
        if(n_a == n_b){
            boolean[] elements = new boolean[n_a];
            for(int i=0; i<elements.length;i++){
                elements[i]=false;
            }
            for (int i=0;i<n_a;i++){
                for(int j=0;j<n_b;j++){
                    if(!elements[j] && (a.charAt(i)==b.charAt(j))){
                        elements[j]=true;
                        break;
                    }
                }
            }
            for(int i=0;i<elements.length;i++){
                if(!elements[i]) return false;
            }
        }else{
            return false;
        }
    return true;
    }