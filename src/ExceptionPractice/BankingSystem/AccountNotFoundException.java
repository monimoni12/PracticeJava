package ExceptionPractice.BankingSystem;
/*
존재하지 않는 계좌 요청 처리.
 */

// AccountNotFoundException**은 사용자 입력(계좌 번호)에 의존하여 발생할 가능성이 있는 예외:
// **Checked Exception**이 적합
public class AccountNotFoundException extends Exception{
    public AccountNotFoundException(String message){
        super(message);
    }
}


