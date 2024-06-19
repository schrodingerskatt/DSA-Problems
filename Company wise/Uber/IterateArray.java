// Problem Link : https://leetcode.com/discuss/interview-question/1515817/uber-oasde2
import java.util.*;
public class IterateArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int [] b = new int[n-2];
        for(int i = 1; i < n; i++){
            if((a[i-1] < a[i] && a[i] > a[i+1]) || (a[i-1] > a[i] && a[i] < a[i+1])){
                b[i-1] = 1;
            }
        }
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
    }    
}
