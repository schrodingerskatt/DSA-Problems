import java.util.*;
public class SumOfAllValues {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        long sum = 0;
        for(int i = 0; i < Math.pow(2, n-1); i++){
            long ans = 0;
            String currExp = ""+s.charAt(0);
            for(int j = 0; j < n-1; j++){
                if(((i>>j)&1) == 1){
                    ans+=Long.parseLong(currExp);
                    currExp = ""+s.charAt(j+1);
                }
                else{
                    currExp+=s.charAt(j+1);
                }

                if(j == n-2){
                    ans+=Long.parseLong(currExp);
                }
            }
            sum+=ans;
        }
        if(n == 1){
            System.err.println(s);
        }
        else{
            System.err.println(sum);
        }

    }
    
}
