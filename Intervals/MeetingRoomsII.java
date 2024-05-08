public class Interval{
    int start;
    int end;
    Interval(int start, int end){
        this.start = start;
        this.end = end;
    }
}

public class MeetingRoomsII{
    public static void Main(String []args){

    }

    public int meetingRooms(List<Interval>intervals){
        if(intervals.isEmpty()) return false;
        Collections.sort(intevals, (a,b)->Integer.compare(a.start-b.start));
        Queue<Interval>queue = new PriorityQueue<>((a,b)->Integer.compare(a.end, b.end));
        int count = 0;
        for(Interval interval : intervals){
            while(!queue.isEmpty() && interval.start >= queue.peek().end){
                queue.poll();
            }
            queue.offer(interval);
            count = Math.max(count, queue.size());
        }
        return count;
    }
}