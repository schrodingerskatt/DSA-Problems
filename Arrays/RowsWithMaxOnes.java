//Problem Link : https://www.naukri.com/code360/problems/row-of-a-matrix-with-maximum-ones_982768?interviewProblemRedirection=true&company%5B%5D=Flipkart&difficulty%5B%5D=Medium&leftPanelTabValue=PROBLEM

public class RowsWithMaxOnes{
    public static void main(String []args){

    }

    public static int maximumOnesRow(ArrayList<ArrayList<Integer>> matrix, int n, int m){
        int maxCount = 0;
        int idx = -1;
        for(int i = 0; i < matrix.size(); i++){
            int countZeros = 0;
            for(int j = 0; j < matrix.get(i).size(); j++){
                if(matrix.get(i).get(j) == 1){
                    countZeros++;
                }
            }
                if(countZeros > maxCount){
                    maxCount = countZeros;
                    idx = i;
                }
                else if(countZeros == maxCount){
                    idx = Math.min(idx,i);
                }
            
        }
        return idx;
    }
}