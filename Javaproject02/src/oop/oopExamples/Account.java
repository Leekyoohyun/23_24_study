package oop.oopExamples;

public class Account {
    int balance; //잔액
    void deposit(int amount){ // 입금 메소드
        balance += amount;
    }
    void withdraw(int amount){
        if((balance-amount)<0){
            System.out.println("잔액 부족");
            System.out.println("잔고: "+balance);
        }else {
            balance -=amount;
        }
    }

}
