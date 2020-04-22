/**
 * 백준 10828문제입니다.
 */
import java.util.Scanner;

public class StackImpl {
    public static void main(String[] args) {
        int loopCount = 0;
        int resMsg;

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        Stack stack = new Stack(count);

        scanner.nextLine();

        while (loopCount != count) {
            String message = "";
            message = scanner.nextLine();
            if (message.contains("push")) {
                try {
                    String[] splitedMsg = message.split(" ");
                    int number = Integer.parseInt(splitedMsg[1]);
                    stack.push(number);
                    loopCount++;
                } catch (Exception e) {
                    e.printStackTrace();
                    throw e;
                }
            } else if (message.equals("top")) {
                resMsg = stack.top();
                System.out.println(resMsg);
                loopCount++;
            } else if (message.equals("pop")) {
                resMsg = stack.pop();
                System.out.println(resMsg);
                loopCount++;
            } else if (message.equals("size")) {
                resMsg = stack.size();
                System.out.println(resMsg);
                loopCount++;
            } else if (message.equals("empty")) {
                int isEmpty = stack.empty();
                System.out.println(isEmpty);
                loopCount++;
            }
        }
    }
}

class Stack {
    int[] array;
    int top = -1;
    public Stack(int num){
        this.array = new int[num];
    }

    public void push(int num) {
        array[top+1] = num;
        top++;
    }

    public int pop(){
        if (top == -1)
            return -1;

        int result = array[top];
        top--;
        return result;
    }

    public int size(){
        return top+1;
    }

    public int empty(){
        if (top == -1) return 1;
        else return 0;
    }

    public int top(){
        if (top == -1) return -1;
        else return array[top];
    }
}
