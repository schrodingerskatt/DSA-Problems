// Problem Link :

public class ConcatenationSum {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            String prod;
            for(int j = 0; j < arr.length; j++){
                prod = String.valueOf(arr[i])+String.valueOf(arr[j]);
                sum+=Integer.parseInt(prod);
            }
        }
        System.out.println(sum);
    }
}
