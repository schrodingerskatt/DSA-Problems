import java.util.* ;

//Problem Link : https://www.naukri.com/code360/problems/minimum-swaps-to-bring-all-elements-less-than-or-equal-to-k-together_1112657?interviewProblemRedirection=true&practice_topic%5B%5D=Arrays&company%5B%5D=Flipkart&difficulty%5B%5D=Medium&leftPanelTabValue=PROBLEM

public class MinimumSwaps 
{
    public static int minimumSwaps(ArrayList<Integer> arr, int n, int k) 
    {
        int small = 0;
        int big = 0;
        for(int i = 0; i < n; i++){
            if(arr.get(i) <= k){
                small++;
            }
        }
        for(int i = 0; i < small; i++){
            if(arr.get(i) > k){
                big++;
            }
        }

        int i = 0;
        int j = small;
        int ans = big;
        while(j < n){
            if(arr.get(i)> k){
                big--;
            }
            if(arr.get(j) > k){
                big++;
            }
            ans = Math.min(ans, big);
            i++;
            j++;
        }
    return ans;
    }
}