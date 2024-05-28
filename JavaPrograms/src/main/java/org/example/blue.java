package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Blue {
  public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);
    System.err.print("Please Enter your name : ");
    String name = sc.nextLine();
    System.out.print("Please enter a Number");
    int number = sc.nextInt();
    System.out.println("This is a number "+ number);
    System.out.println("My name is "+ name);

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String name1 = reader.readLine();
    System.out.println("Name "+ name1 );
    System.out.println(method1(20));
  }
  static int method1(int number){
    return number;
  }
}