//Problem Link : https://www.naukri.com/code360/problems/check-if-one-string-is-a-rotation-of-another-string_1115683?interviewProblemRedirection=true&company%5B%5D=Flipkart&difficulty%5B%5D=Medium&leftPanelTabValue=PROBLEM
import java.util.*;

public class CyclicRotation{
    public static void main(String args[]){

    }

    public static int isCyclicRotation(String p, String q)  {
    for(int i = 0; i < p.length()-1; i++){
        String ans = p.substring(i+1)+p.substring(0, i+1);
        if(ans.equals(q)){
            return 1;
        }
    }
    return 0;

    }
}