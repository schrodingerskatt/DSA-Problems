class Solution {
    public int RemoveCoveredIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            } else {
                return b[1] - a[1];
            }
        });

        int[] start = intervals[0];
        int count = 0;
        for(int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= start[0] && intervals[i][1] <= start[1]) {
                count++;
            }
            else{
                start = intervals[i];
            }
    }
     return intervals.length-count;
}
}