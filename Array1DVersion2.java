import java.util.*;

public class Array1D {

    public static boolean canWin(int leap, int[] game) {
      int i = 0;
        while (true) {
          if (i + leap >= game.length ) {
                return true;
            } else if (game[i + leap] == 0) {
                i += leap;
            } else if (game[i + 1] == 0) {
                i++;
            } else if (i - 1 >= 0 && game[i - 1] == 0) {
                i--;
                if (i == 0) {
                    return false;
                }
            } else {
                return false;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}