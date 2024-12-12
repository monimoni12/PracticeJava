package ExceptionPractice.BankingSystem;

public class BankOperationException extends Exception{
    // 계좌 개수 6개이상일 때
    // 고객 ID가 중복될 때(2개 이상?)
    public BankOperationException(String message){
        super(message);
    }
}
