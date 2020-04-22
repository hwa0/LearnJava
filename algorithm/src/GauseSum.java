public class GauseSum {
    // 1부터 a까지의 정수 합을 가우스의 덧셈 방식으로 계산합니다.
    static int gauseSum(int a){
        int n = a/2;
        int sum = 0;
        if (a % 2 == 0) {
            sum = (1 + a) * n;
        } else {
            sum = a * n;
        }
        return n;
    }

    public static void main(String[] args){
    }
}
