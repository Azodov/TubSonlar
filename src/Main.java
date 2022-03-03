import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n sonni kiriting: = ");
        int n = scanner.nextInt();
        for (int i=2; i<=n; i++) {
            boolean tub = true;
            for (int j =2; j<i; j++ ) {
                if (i%j == 0){
                    tub = false;
                }
            }
            if (tub == true) {
                System.out.println(i);
            }
        }
    }
}
