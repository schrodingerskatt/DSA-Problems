// Problem Statement : given [[]] array with two types of input [0,int a, int b] or [1,int a, int b] 
// where a and b represent rect sides. if [0,int a, int b] - add and store a rectangle of given size
//[1,int a, int b] - check if new rectangle can fit all the rectangles before it. return a list of 
// true/false, based on given condition.


import java.util.ArrayList;

public class CheckRectangles {
    public ArrayList<Boolean> checkRectangles(ArrayList<int[]> operations) {
        ArrayList<Boolean> result = new ArrayList<>();
        ArrayList<int[]> rectangles = new ArrayList<>();
        for(int[]op:operations){
            if(op[0] == 0){
                rectangles.add(new int[]{op[1],op[2]});
                result.add(true);
            }
            else if(op[0] == 1){
                int newA = op[1];
                int newB = op[2];
                boolean canfit = true;
                for(int [] rect: rectangles){
                    if(rect[0] > newA || rect[1] > newB){
                        canfit = false;
                        break;
                    }
                }
                result.add(canfit);
            }
        }
        return result;

    }

    
}
