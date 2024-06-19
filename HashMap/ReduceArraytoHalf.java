//Problem Link : https://leetcode.com/problems/reduce-array-size-to-the-half/

class Solution {
    public int ReduceArraytoHalf(int[] arr) {

        HashMap<Integer,Integer>hmp = new HashMap<>();
        PriorityQueue<Integer>pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i = 0; i < arr.length; i++){
            if(!hmp.containsKey(arr[i])){
                hmp.put(arr[i],1);
            }
            else{
                hmp.put(arr[i],hmp.get(arr[i])+1);
            }
        }
        for(Map.Entry<Integer,Integer>entry:hmp.entrySet()){
            Integer val = entry.getValue();
            pq.add(val);
        }
        int sum = 0;
        int count = 0;
        int len = arr.length;
        while(sum < len/2 && !pq.isEmpty()){
            int ele = pq.poll();
            sum+=ele;
            count++;
        }
    return count;
    }
}