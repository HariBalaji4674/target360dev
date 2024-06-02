import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrayAndArrayList {
    public static void main(String[] args) {
        int nums[] = {3,5,6,7,9};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
//        int[][] arrys = new int[3][];

        int [][] arrys = {{1,2,3},{3,4,5},{6,7,8}};
        System.out.println(Arrays.toString(arrys[1]));
//        System.out.println(arrys[2]);
    }
    static void change(int[] arr){
        arr[0] = 89;

    }
}

/*

 */