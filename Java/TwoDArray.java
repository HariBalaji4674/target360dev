import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        /*
        Scanner in = new Scanner(System.in);
        int array[][] = new int[3][3];

        for (int i = 0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                array[i][j] = in.nextInt();
            }
        }
        for (int i =0;i< array.length;i++){
            for (int j=0;j< array.length;j++){
                System.out.print(array[i][j]+"  ");
            }
            System.out.println(" ");
        }
        for (int i = 0;i<array.length;i++){
            System.out.println(Arrays.toString(array[i]));
        }

        System.out.println("This is Enhanced For Loop");
        // Enhanced For Loop
        for (int [] arr : array){
            System.out.println(Arrays.toString(arr));
        }
       ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(37);
        list.add(45);
        list.add(67);
        list.add(32);
        list.add(89);
        list.add(9);
        list.add(20);
        list.add(76);
        System.out.println(list);
        System.out.println(list.contains(20));
        System.out.println(list.remove(3));
        System.out.println(list);

*/

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            System.out.print("Please Enter : "+ i + "  ");
            list.add(in.nextInt());
        }
        for (int i=0;i<10;i++){
            System.out.print(list.get(i)+" ");
        }

    }


}

/*
Array list: When You don't know the array size and we need to implement the array then we will use Array List

Syntax
ArrayList<Integer> nums = new ArrayList<>();

Similar to vectors in C++
 */
