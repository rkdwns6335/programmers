import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) System.out.println("1");
        else System.out.println("0");


    }
}