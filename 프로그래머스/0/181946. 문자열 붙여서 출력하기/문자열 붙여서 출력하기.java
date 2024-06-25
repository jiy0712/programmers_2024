import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        
        String result = str1 + str2;
        System.out.println(result);
        
        scanner.close();
    }
}
