import java.util.Scanner;

public class max4 {
    //4개의 수 중 최댓값을 반환합니다

    static int max4(int a, int b, int c, int d){
        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        if (d > max) {
            max = d;
        }

        return max;
    }
}
