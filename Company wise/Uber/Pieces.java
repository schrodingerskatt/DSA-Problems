import java.util.*;

public class Pieces {

    public static void main(String[] args){
        int [] arr = {1, 2, 5, 3};
        int [][] pieces = {{5},{1,2},{3}};

        HashMap<Integer,int[]>hmp = new HashMap<>();
        int sum = 0;
        for(int [] p: pieces){
            hmp.put(p[0],p);
            sum+=p.length;
        }
    
        if(sum > arr.length){
            // return false;
        }
        int i = 0;
        while(i < arr.length){
            if(!hmp.containsKey(arr[i])){
                // return false;
            }
            int tp = arr[i];
            int j = 0;
            while(j < hmp.get(tp).length){
                if(hmp.get(tp)[j++] != arr[i++]){
                    // return false;

                }
            }
        }
        // return true;

    }
    
}
