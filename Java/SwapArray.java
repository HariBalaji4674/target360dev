import org.w3c.dom.ls.LSOutput;

import javax.naming.PartialResultException;

import java.util.Arrays;

import static java.util.Collections.swap;

public class SwapArray {
    public static void main(String[] args) {
        int [] numbers = {5,10,15,20,25,30};
//        int num1 = 3;
//        int num2 = 5;

        swap(numbers,3,5);
        System.out.println(Arrays.toString(numbers));
        System.out.println(maxValue(numbers));
        System.out.println(maxRange(numbers,1,4));
        reverse(numbers);

    }
    static void swap(int [] array,int num1, int num2) {
        int temp = array[num1];
        array[num1] = array[num2];
        array[num2] = temp;

    }
    static int maxValue(int[] arr){
        int maxNum = arr[0];
        for(int i = 0;i< arr.length;i++){
            if (arr[i] > maxNum){
                maxNum = arr[i];
            }
        }
        return maxNum;

    }
    static int maxRange(int[] array,int start,int end){
        int maxNum = array[0];
        for(int i=start;i<end;i++){
            if(array[i] > maxNum){
                maxNum = array[i];
            }
        }
        return maxNum;

    }

    static void reverse(int[] array){
        for(int i = array.length-1; i > 0;i--){

            System.out.println(array[i]);

        }
    }
}



/*
Swap Arrays
Max Value array
min value array
get start and elements
reverse array
 */
