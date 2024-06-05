public class LargestElement {
    public static void main(String[] args) {
        /*
        Steps to follow:
        Brute force method
        Better
        Optimal
        */
        // int array[] = new int[];
        int array[] = {2,7,9,3,1,5,6};
        int largest = array[0];

        for(int i=0; i < array.length; i++){
            if(array[i] > largest){
                largest = array[i];
            }
        }
        System.out.println(largest);
        for(int i=0;i<10;i++){
            
        }

    }

}
