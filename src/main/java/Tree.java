import static java.lang.Math.abs;

public class Tree {

    //[1,2,3,4,5]

    public int garlandLength(int [] arr){
        int length = 0;
        for (int i = 0; i < (arr.length-1); i++) {
            length = length + abs(arr[i+1] - arr[i]);
        }

        return length;
    }

}


