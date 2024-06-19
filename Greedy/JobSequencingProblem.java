public class JobSequencingProblem{
    public static void main(String []args){

    }
        public static int[] jobScheduling(int [][]jobs) {
       
        Arrays.sort(jobs,(a,b)->b[2]-a[2]);
        int maxima = 0;
        for(int i = 0; i < jobs.length; i++){
            if(jobs[i][1] > maxima){
                maxima = jobs[i][1];
            }
        }
        int result[] = new int[maxima+1];
        for(int i = 1; i <= maxima; i++){
            result[i] = -1;
        }
        int profit = 0;
        int count = 0;
        for(int i = 0; i < jobs.length; i++){
            for(int j = jobs[i][1]; j > 0; j--){
                if(result[j] == -1){
                    result[j] = i;
                    count++;
                    profit+=jobs[i][2];
                    break;
                }
            }
        }
        int ans[] = new int[2];
        ans[0] = count;
        ans[1] = profit;
        return ans;
    }
}