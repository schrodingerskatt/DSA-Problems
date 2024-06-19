public class Interval{
    int start;
    int end;
    Interval(int start, int end){
        this.start = start;
        this.end = end;
    }
}

public class MeetingRooms{
    public boolean canAttendMeetings(List<Interval>intervals){

    Collections.sort(intervals, (a, b) -> a.start - b.start);
    for(int i = 0; i < intervals.size(); i++){
        if(intervals.get(i).end > intervals.get(i+1).start){
            return false;
        }
    }
    return true;
}
}