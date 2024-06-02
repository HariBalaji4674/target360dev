public class NumberCheck {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[3] = 30;
        arr[4] = 40;

        int number = 20;
       for (int i = 0;i<arr.length;i++){
           if (arr[i] == 20){
               System.out.println("The Number :"+arr[i]+" Are equal to the "+number);
           }
           else{
               continue;
           }
       }

    }
}
