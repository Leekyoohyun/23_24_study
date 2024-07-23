package oop.oopExamples;

public class AccountMain {
    public static void main(String[] args) {
        Account order = new Account();
        order.deposit(10000);
        // System.out.println(order.balance);
       // System.out.println(order.temp);
        order.withdraw(9000);
        order.withdraw(2000);
    }
}
