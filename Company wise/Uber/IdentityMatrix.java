

public class IdentityMatrix {
    public static void main(String[] args) {
        int [] a = new int[] {1, 2, 3, 4};
        boolean flag = isIdentityMatrix(a);
        System.out.println(flag);

    }

    public static boolean isIdentityMatrix(int[] a){

        for(int i = 0; i < a.length; i++){
            if(a[i]!=i%a.length && a[i] != (a.length-i)%a.length){
                return false;
            }
        }
        return true;
    }
}
