package ExceptionPractice.BankingSystem;
/*
존재하지 않는 계좌 요청 처리.
 */

public class AccountNotFoundException extends Exception{
    public AccountNotFoundException(String message){
        super(message);
    }
}

/*
package day09;

public class BankException extends Exception{
    public BankException() {
    }

    public BankException(String message) {
        super(message);
    }
}
 */
