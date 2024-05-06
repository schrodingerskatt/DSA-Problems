import java.util.*;

public class AllocateBooks {

    public static void main(String[] args) {
        List<Integer> existingList = Arrays.asList(12, 34, 67, 90);
        ArrayList<Integer> arr = new ArrayList<>(existingList);
        int n = 4;
        int m = 2;

        if(m > n){
            System.out.println("Not possible");
        }
        int low = Collections.max(arr);
        int high = 0;
        for(int i = 0; i < arr.size(); i++){
            high+=arr.get(i);
        }
        while(low <= high){
            int mid = low+(high-low)/2;
            int students = countStudents(arr, mid);
            if(students > m){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
       System.out.println(low);
    }

    public static int countStudents(ArrayList<Integer>arr, int threshold){
        int students = 1;
        int totalStudents = 0;
        for(int i = 0; i < arr.size(); i++){
            if(totalStudents+arr.get(i) <= threshold){
                totalStudents+=arr.get(i);
            }
            else{
                students++;
                totalStudents = arr.get(i);
            }
        }
        return students;
    }
}
