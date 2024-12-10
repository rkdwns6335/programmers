import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();

        if( a > b ){
            System.out.println(">");
        }else if(a < b){
            System.out.println("<");
        }else if(a == b){
            System.out.println("==");
        }


    }
}