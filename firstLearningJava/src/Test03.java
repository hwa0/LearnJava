public class Test03 {
    public static void main(String[] args){
        Account account = new Account();
        DrawThread t1 = new DrawThread(account);
        DrawThread t2 = new DrawThread(account);

        t1.start();
        t2.start();
    }
}

class Account {
    private long balance = 1000;

    public void draw(long amount){
        balance -= amount;
    }

    public long getBalance() {
        return balance;
    }
}

class DrawThread extends Thread {
    Account account;

    DrawThread(Account account){
        this.account = account;
    }

    public void run(){
        synchronized (account) {
            for (int i = 0; i < 10; i++) {
                account.draw(10);
                System.out.println(this.getName() + " 출금 후 잔액 " + account.getBalance());
            }
        }
    }
    /*
    동기화 처리가 되지 않아 두 스레드가 동시에 접근하는 문제 발생
    public void run(){
        for (int i = 0; i < 10; i++) {
            account.draw(10);
            System.out.println(this.getName() + " 출금 후 잔액 " + account.getBalance());
        }
    }
     */
}
