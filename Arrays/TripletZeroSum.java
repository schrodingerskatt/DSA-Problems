//Problem Link : https://www.naukri.com/code360/problems/find-all-triplets-with-zero-sum_873143?interviewProblemRedirection=true&practice_topic%5B%5D=Arrays&company%5B%5D=Flipkart&difficulty%5B%5D=Medium&leftPanelTabValue=PROBLEM

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
public class TripletZeroSum {

    public static ArrayList<ArrayList<Integer>> findTriplets(ArrayList<Integer> arr, int n) {
        // Write your code here.
        Collections.sort(arr); //sort the array

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for(int i=0; i<n; i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum = arr.get(i)+arr.get(j)+arr.get(k);
                if(sum==0){
                    result.add(new ArrayList<>(Arrays.asList(arr.get(i),arr.get(j),arr.get(k))));

                    j++; k--;
                    
                    // skip duplicate elements
                    while(j<k && arr.get(j).equals(arr.get(j-1))){
                        j++;
                    }
                    // skip duplicate elements
                    while(j<k && arr.get(k).equals(arr.get(k+1))){
                        k--;
                    }
                }
                else if (sum < 0){
                    j++;
                }else{
                    k--;
                }
            }
            // skip duplicate elements
            while(i+1<n && arr.get(i).equals(arr.get(i+1))){
                i++;
            }
        }

        return result;
        
    }

}