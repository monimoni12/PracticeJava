package ExceptionPractice.BankingSystem;

// BankOperationException, InvalidTransactionException)는 외부 환경과 관련되지 않고,
//내부 로직의 오류를 나타내므로 **Unchecked Exception(RuntimeException 계열)**이 적합
//public class BankOperationException extends Exception{
public class BankOperationException extends RuntimeException{

    // 계좌 개수 6개이상일 때
    // 고객 ID가 중복될 때(2개 이상?)
    public BankOperationException(String message){
        super(message);
    }
}
