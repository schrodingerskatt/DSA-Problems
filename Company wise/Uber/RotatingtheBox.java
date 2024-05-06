public class RotatingtheBox {

    public char[][] rotateTheBox(char[][] box) {
        int r = box.length;
        int c = box[0].length;
        char [][] newbox = new char[c][r];
        
        for(int i = 0; i < r; i++){
            int empty = c-1;
            for(int j = c-1; j >= 0; j--){
                if(box[i][j] == '*'){
                    empty = j-1;
                }
                if(box[i][j] == '#'){
                    box[i][j] = '.';
                    box[i][empty] = '#';
                    empty-=1;
                }
            }
        }
            for(int i = 0; i < r; i++){
                for(int j = c-1; j >= 0; j--){
                    newbox[j][r-i-1] = box[i][j];
                }
            }
        
        return newbox;
    }
    
}
