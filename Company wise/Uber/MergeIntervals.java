import java.util.*;

class Interval{
    int start;
    int end;

    Interval(int start, int end){
        this.start = start;
        this.end = end;
    }
}
public class MergeIntervals {

    public static ArrayList<Interval> mergeIntervals(ArrayList<Interval> intervals) {
        Collections.sort(intervals, (a,b)->(a.start-b.start));
        ArrayList<Interval>res = new ArrayList<>();
        res.add(intervals.get(0));
        for(int i = 1; i < intervals.size(); i++){
            if(res.get(res.size()-1).end >= intervals.get(i).start){
                res.get(res.size()-1).end = Math.max(intervals.get(i).end,res.get(res.size()-1).end);
            }else{
                res.add(intervals.get(i));
            }
        }
        return res;
        }
    
}
