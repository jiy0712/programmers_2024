import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int c = a + b;
        
        System.out.println(a + " + " + b + " = " + c);
        
        scanner.close();
    }
}
