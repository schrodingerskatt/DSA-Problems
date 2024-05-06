import java.util.*;

public class FlexportAmsterdam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        String[] words = s.split(" ");
        HashMap<String, ArrayList<Integer>> hmp = new HashMap<>();
        for(int i = 0; i < words.length; i++){
            if(hmp.containsKey(words[i])){
                hmp.get(words[i]).add(i);
            }
            else{
                ArrayList<Integer>newList = new ArrayList<>();
                newList.add(i);
                hmp.put(words[i],newList);
            }
        }
        
    }
}