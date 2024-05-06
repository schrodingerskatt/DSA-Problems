// Problem Link : https://www.desiqna.in/16869/uber-oa-sde-1-ctc-65-l-mar-2024-set-40

public class ArithmeticMeanNbd {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(countNumbersEqualToMean(a));
    }

    public static int countNumbersEqualToMean(int[] a) {
        int count = 0;
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] == (a[i - 1] + a[i + 1]) / 2.0) {
                count++;
            }
        }
        return count;
    }
    
}
