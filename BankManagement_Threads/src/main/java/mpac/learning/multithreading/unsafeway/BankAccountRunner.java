package mpac.learning;

import mpac.learning.thread.*;

public class BankAccountRunner {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        final  double AMOUNT = 100;
        final int REPETITIONS = 100;
        final  int THREADS = 5;
        for(int i = 1; i < THREADS; i++){
            DepositRunnable d = new DepositRunnable(account, AMOUNT, REPETITIONS);
            WithdrawRunnable w = new WithdrawRunnable(account, AMOUNT, REPETITIONS);
            Thread thread1 = new Thread(d);
            Thread thread2 = new Thread(w);
            thread1.start();
            thread2.start();
        }
    }
}