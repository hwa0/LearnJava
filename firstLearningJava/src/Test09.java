interface Calculator {
    int func();
}

public class Test09 {

    static int num1 = 10;
    int num2 = 20;

    public static void main(String[] args){
        Test09 test = new Test09();
        int num3 = 30; // 메서드 내 지역변수

        Calculator calc = () -> {
            int num4 = 40;
            Test09.num1++;
            test.num2++;
            //num3++; 오류 발생
            num4++;
            return num4;
        };
    }
}
