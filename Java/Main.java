import java.util.Scanner;

public class Main {
  public static void main(String...args) {

    System.out.println("Hello Java Program");
    System.out.println(args[0]);   // Passing arguments usings args from main method

    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter name ");
    System.out.println(input.nextLine());

    int num = 20;
    float fir = 20.5f;
    System.out.println(num+" "+fir);
    System.out.println(namedDay(20));
    // namedDay(20);
  }

  public static int namedDay(int number){
    System.out.println("Peddireddy");
    return number;
  }


}

    /*
     * Multiple Recurison Calls
     * 1:
     */


    /* colon is line is over
     * String is not primitive
    * primitie is data type we cannot break this into further more data types
    * we cannot break int into another datatype
    * Class starts with capital letters
    * . dot represents how many properties can be applied on the particular class/ primitives
    *  Public can be accessed from anywhere
    */
    /*
     * System : it is a public final class defined in the java.lang package
     *
     */

