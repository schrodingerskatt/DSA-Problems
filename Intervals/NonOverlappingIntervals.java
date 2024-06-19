class Solution {
    public int NonOverlappingInteervals(int[][] intervals) {
        int intervalsRemoved = 0;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int []FirstInterval = intervals[0];

        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] < FirstInterval[1]){
                intervalsRemoved++;
            }
            else{
                FirstInterval = intervals[i];
            }
        }
    return intervalsRemoved;
    }
}