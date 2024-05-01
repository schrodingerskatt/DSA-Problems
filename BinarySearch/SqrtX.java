//Problem Link : https://leetcode.com/problems/sqrtx/

import java.util.*;
public class SqrtX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int rootX = sqrt(x);
        System.out.println(rootX);
    }

    public static int sqrt(int x){
        int low = 1;
        int high = x;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(mid == x/mid){
                return mid;
            }
            else if(mid > x/mid){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
    return high;
    }
    
}
