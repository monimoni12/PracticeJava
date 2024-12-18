package ExceptionPractice.BankingSystem;
// BankOperationException, InvalidTransactionException)는 외부 환경과 관련되지 않고,
//내부 로직의 오류를 나타내므로 **Unchecked Exception(RuntimeException 계열)**이 적합
// public class InvalidTransactionException extends Exception{
public class InvalidTransactionException extends RuntimeException{
    public InvalidTransactionException(String message){
        super(message);
    }
}
