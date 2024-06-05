import java.sql.SQLOutput;

public class GfgNumberCheck {
    public static void number(int arr[],int numberCheck){

        for (int number : arr){
            if (number == numberCheck) {
                System.out.println("Number is Present");
            }
            else {
                continue;
            }
        }

    }

    public static void main(String[] args) {

        int arr[] = {4,7,8,10,3,56,87,10};
        int numberCheck = 10;
        System.out.println("This is an Array to be called Into that "+arr);
        number(arr,numberCheck);

        }
}






/*
import javax.naming.PartialResultException;
import java.time.chrono.IsoChronology;
import java.util.Arrays;

public class GfgNumberCheck {

    public static void check(int arr[],int toCheckValue){

        boolean test = false;
        for(int number : arr){
            if (number == toCheckValue){
                test = true;
                break;
            }
        }
        System.out.println("Is  "+ toCheckValue +" Present in the array "+ test);
    }

    public static void main(String[] args) {

        int arr[] = {2,3,6,8,7,23,87,90,34};
        int toCheckValue = 7;
        System.out.println("Arrays"+ Arrays.toString(arr));
        check(arr,toCheckValue);


    }
}
*/