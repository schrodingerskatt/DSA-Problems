//Problem Link : https://www.naukri.com/code360/problems/candies_893290?interviewProblemRedirection=true&practice_topic%5B%5D=Arrays&company%5B%5D=Flipkart&difficulty%5B%5D=Medium&leftPanelTabValue=PROBLEM

public class Candies {
    public static int requiredCandies(int[] students) {
        int n = students.length;
        if(n == 0){
            return 0;
        }
        int []candies = new int[n];
        for(int i = 0; i < n; i++){
            candies[i] = 1;
        }
        for(int i = 1; i < n; i++){
            if(students[i] > students[i-1]){
                candies[i] = candies[i-1]+1;
            }
        }

        for(int i = n-2; i >=0; i--){
            if(students[i] > students[i+1]){
                candies[i] = Math.max(candies[i], candies[i+1]+1);
            }
        }
        int sum = 0;
        for(int i = 0; i < candies.length; i++){
            sum+=candies[i];
        }
        return sum;
    }
}