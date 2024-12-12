package ExceptionPractice.BankingSystem;

/*
고객 ID와 이름을 포함하며, 고객이 소유한 통장(Account) 목록을 관리합니다.

고객의 ID와 이름, 그리고 계좌를 저장하는 배열을 포함
계좌를 추가하고 찾는 메서드를 제공
↳ 계좌 추가 메서드(고객당 최대 5개의 계좌만 허용)
 */

public class Customer {
    int customerID; //고객 ID
    private String customerName; // 고객 이름
    Account[] accounts; // 계좌를 저장하는 배열

    public Customer(int customerID, String customerName, Account[] accounts) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.accounts = accounts;
    }

    //↳ 계좌 추가 메서드
    // 계좌 수가 6개 이상일 때 예외처리(고객당 최대 5개의 계좌만 허용)
    public void addAccount(Account account) throws BankOperationException{
        int aCnt = 0;
        for(Account a : accounts){
            if(aCnt>5) throw new BankOperationException("등록 가능한 계좌 수를 초과하였습니다.");
            if(a.customerID == account.customerID) aCnt++;
        }
    }

    // 계좌 찾는 메서드
    // 계좌번호로 조회할 때 존재하지 않을 경우 예외처리
    public void findAccount(String accountNumber) throws AccountNotFoundException{
        for(String anum : accountNumber.split(" ")){
            if(accountNumber.equals(anum)){
                System.out.println("계좌번호는" + accountNumber + "입니다.");
            } else throw new AccountNotFoundException("계좌번호가 존재하지 않습니다.");
        }
    }
}