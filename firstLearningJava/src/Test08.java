import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 스레드 풀 예제 코드
 * 출처 : 처음 해보는 자바 프로그래밍, 오정임
 */

public class Test08 {
    public static void main(String[] main){
        ExecutorService threadPool1 = Executors.newFixedThreadPool(10);
        ExecutorService threadPool2 = Executors.newCachedThreadPool();

        threadPool1.execute(new Task());
        threadPool1.execute(() -> {
            for (int i = 0; i < 10; i++){
                System.out.println("스레드 작업2!");
            }
        });

        threadPool1.shutdown();
        threadPool2.shutdown();
    }
}

class Task implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println("스레드 작업1!");
        }
    }
}
