package D_Rank.D_07;

import java.util.Scanner;

public class D067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (1 <= n && n <=100){
            if (n % 2 == 1){
                System.out.println("ON");
            } else if (n % 2 == 0) {
                System.out.println("OFF");
            }
        }
    }
}
