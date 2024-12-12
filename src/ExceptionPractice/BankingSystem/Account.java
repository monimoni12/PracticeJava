package ExceptionPractice.BankingSystem;

/*
계좌 번호, 잔액, 소유 고객 ID를 포함하며, 입금 및 출금 기능을 제공합니다.

계좌 번호, 소유 고객 ID, 잔액을 속성으로 가진다.
입금과 출금을 처리하는 메서드를 구현
(잘못된 금액 또는 잔액 부족 시 예외를 발생시킬 것)
↳ 입금: deposit(){}
↳ 출금: withdraw(){}
 */

public class Account {
    int customerID; //소유고객 ID

    final String accountNumber; // 계좌번호
    int balance; // 계좌잔액

    public Account(int customerID, String accountNumber) {
        this.customerID = customerID;
        this.accountNumber = accountNumber;
    }

    // 생성자
    public Account(int customerID, String accountNumber, int balance) {
        this.customerID = customerID;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    // *잘못된 금액 또는 잔액 부족 시 예외를 발생시킬 것
    // 입금
    public void deposit(int money) throws InvalidTransactionException{
        if(money < 0){
            throw new InvalidTransactionException("입금 금액이 0원 이하입니다. 다시 입금해주세요.");
        }
        this.balance += money;
        System.out.println(money + "원 입금되었습니다.");
        System.out.println("현재 잔고: " + this.balance);
    }

    // 출금
    public void withdraw(int money) throws InvalidTransactionException {
        if(this.balance - money < 0){
            throw new InvalidTransactionException("잔액이 부족합니다. 다시 출금해주세요.");
        }
        if(money < 0){
            throw new InvalidTransactionException("출금 금액이 0원 이하입니다. 다시 입금해주세요.");
        }
        this.balance -= money;
        System.out.println(money + "원 출금되었습니다.");
        System.out.println("현재 잔고: " + this.balance);
    }
}