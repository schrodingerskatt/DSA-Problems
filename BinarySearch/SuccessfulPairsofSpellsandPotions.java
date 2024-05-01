// Problem Link : https://leetcode.com/problems/successful-pairs-of-spells-and-potions/
import java.util.*;
public class SuccessfulPairsofSpellsandPotions {

    public static void main(String[] args) {
        int []spells = {5, 1, 3};
        int []potions = {1, 2, 3, 4, 5};
        int []ans = new int[spells.length];
        int success = 7;
        Arrays.sort(potions);
        for(int i = 0; i < spells.length; i++){
            int spell = spells[i];
            int low = 0;
            int high = potions.length-1;
            int idx = potions.length;
            while(low <= high){
                int mid = low+(high-low)/2;
                long prod = (long)spell*potions[mid];
                if(prod >= success){
                    high = mid-1;
                    idx = mid;
                }
                else{
                    low = mid+1;
                }
            }
            ans[i] = potions.length-idx;
        }
    for(int i = 0; i < ans.length; i++){
        System.out.println(ans[i]);
    }
    }
}
