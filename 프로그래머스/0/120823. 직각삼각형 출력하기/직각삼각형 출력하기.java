import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
		for(int i = 1; i<n+1; i++) {
			System.out.println("*".repeat(i));
		}
    }
}