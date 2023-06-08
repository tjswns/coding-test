import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String concatenatedA = a.replaceAll(" ", "");
        System.out.print(concatenatedA);
        String concatenatedB = b.replaceAll(" ", "");
        System.out.print(concatenatedB);
    }
}