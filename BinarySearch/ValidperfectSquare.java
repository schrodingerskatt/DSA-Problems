// Problem Link : https://leetcode.com/problems/valid-perfect-square/

public class ValidperfectSquare {
    
    public static void main(String[] args) {
        int num = 16;
        boolean isPerfect = isPerfectSquare(num);
        if(isPerfect == true){
            System.out.println("It is perfect square");
        }
        else{
            System.out.println("Not a perfect square");
        }
    }

    public static boolean isPerfectSquare(int num) {

        long low = 1;
        long high = num;
        while(low <= high){
            long mid = low+(high-low)/2;
            if(mid*mid == num){
                return true;
            }
            else if (mid*mid > num){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
    return false;
    }
}
