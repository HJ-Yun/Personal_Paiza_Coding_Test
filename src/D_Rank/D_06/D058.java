package D_Rank.D_06;

import java.util.Scanner;

public class D058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();

        if (1 <= l && l <= 20){
            if (1 <= m && m <= 20){
                if (1 <=n && n <= 20){
                    for (int i = 0; i < l; i++){
                        System.out.print("A");
                    }
                    for (int i = 0; i < m; i++){
                        System.out.print("B");
                    }
                    for (int i = 0; i < n; i++){
                        System.out.print("A");
                    }
                }
            }
        }
    }
}
