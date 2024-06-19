// Problem Link : https://www.naukri.com/code360/problems/count-all-sub-arrays-having-sum-divisible-by-k_973254?interviewProblemRedirection=true&company%5B%5D=Flipkart&leftPanelTabValue=PROBLEM
import java.util.ArrayList;
import java.util.HashMap;

public class SubarraySumDivisibleK {

    public static void main(String[] args) {
        
    }

    public static int subArrayCount(ArrayList < Integer > arr, int k) {

    	 HashMap<Long, Integer>hmp = new HashMap<>();
         int ans = 0;
         long sum = 0;
         hmp.put(sum,1);
         for(int i = 0; i < arr.size(); i++){
             sum+=arr.get(i);
             long rem = sum%k;
             if(rem < 0){
                 rem+=k;
             }
             if(hmp.containsKey(rem)){
                 ans = ans+hmp.get(rem);
                 hmp.put(rem, hmp.get(rem)+1);
             }
             else{
                 hmp.put(rem,1);
             }
         }
         return ans;
    }
    
}
