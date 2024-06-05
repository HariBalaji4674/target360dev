public class SecondLargestElement {
    public static void main(String[] args) {
        int array[] = {7,6,7,9,2,3,5};
        int largest = array[0];
        int sLargest = -1;
        for(int i=0; i<array.length;i++) {
            if(array[i] > largest){
                sLargest = largest;
                largest = array[i];
            }
            else if (array[i] < largest && array[i] > sLargest) {
                sLargest = array[i];

        }
    }

        System.out.println(largest+"  "+sLargest);
        if (true) {
            System.out.println("peddireddy");
        }
    }
}


