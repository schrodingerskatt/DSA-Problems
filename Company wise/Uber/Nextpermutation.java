import java.util.*;

public class Nextpermutation {

    public static void main(String[] args) {
        ArrayList<Integer> permutations = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 3));
        int n = permutations.size();
        int i = n-1;
        for(; i > 0; i--){
            if(permutations.get(i-1) < permutations.get(i)){
                break;
            }
        }
        if(i!= 0){
            int index = 0;
            for(int j = n-1; j >=0; j--){
                if(permutations.get(j) > permutations.get(i-1)){
                    index = i;
                    break;
                }
            }
            swap(permutations,i-1,index);
        }
        reverse(permutations, i, n-1);
        System.out.println(permutations);
    }

    public static void swap(ArrayList<Integer>permutations, int i, int j){
        int temp = permutations.get(i);
        permutations.set(i,permutations.get(j));
        permutations.set(j,temp);
    }

    public static void reverse(ArrayList<Integer>permutations, int start, int end){
        while(start < end){
            swap(permutations, start, end);
            start++;
            end--;
        }
    }
    
}
