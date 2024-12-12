package ExceptionPractice.BankingSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws BankOperationException {
        Bank bc = new Bank();

        boolean isRunning = true;

        while(isRunning){
            System.out.println("=== 라이온 은행 시스템 ===");
            System.out.println("1. 고객 등록");
            System.out.println("2. 계좌 생성");
            System.out.println("3. 입금");
            System.out.println("4. 출금");
            System.out.println("5. 잔액 조회");
            System.out.println("6. 종료");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch(choice){
                // 고객 등록: Bank 클래스
                case 1: {
                    // 고객 정보 입력 받기
                    System.out.println("고객ID를 입력하세요.");
                    int customerID = sc.nextInt();

                    System.out.println("고객 성함을 입력하세요.");
                    String customerName = sc.next();

                    Account[] accounts = new Account[5];
                    System.out.println("입력할 계좌 개수를 입력하세요.");
                    int aCNT = sc.nextInt();
                    for (int i = 0; i < aCNT; i++) {
                        System.out.println("계좌번호를 입력하세요.");
                        String accountNumber = sc.next();
                        accounts[i] = new Account(customerID, accountNumber);
                    }


                    // 입력받은 정보로 customer 생성
                    Customer customer = new Customer(customerID, customerName, accounts);

                    // customer 정보 bank에 저장
                    bc.addCustomer(customer);
                    break;
                }
                // 계좌생성
                case 2: {
                    System.out.println("고객ID를 입력하세요.");
                    int customerID = sc.nextInt();

                    System.out.println("계좌번호를 입력하세요.");
                    String accountNumber = sc.next();

                    System.out.println("계좌 내 잔고를 입력하세요.");
                    int balance = sc.nextInt();

                    Account ac = new Account(customerID, accountNumber, balance);
                    break;
                }
                // 입금
                case 3: {
                    System.out.println("계좌 번호를 입력하세요.");
                    String accountNumber = sc.next();

                    System.out.println("입금할 금액을 입력하세요.");
                    int money = sc.nextInt();

                    try {
                        // 계좌 번호로 고객 찾기
                        Customer customer = bc.findCustomer(accountNumber);

                        // 해당 계좌에서 입금 수행
                        for (Account account : customer.accounts) {
                            if (account != null && account.accountNumber.equals(accountNumber)) {
                                account.deposit(money);
                                System.out.println("입금 완료. 현재 잔액: " + account.balance);
                                break;
                            }
                        }
                    } catch (BankOperationException | InvalidTransactionException e) {
                        System.out.println("입금 실패: " + e.getMessage());
                    }
                    break;
                }
                // 출금
                case 4: {
                    System.out.println("계좌 번호를 입력하세요.");
                    String accountNumber = sc.next();

                    System.out.println("출금할 금액을 입력하세요.");
                    int money = sc.nextInt();

                    try {
                        // 계좌 번호로 고객 찾기
                        Customer customer = bc.findCustomer(accountNumber);

                        // 해당 계좌에서 출금 수행
                        for (Account account : customer.accounts) {
                            if (account != null && account.accountNumber.equals(accountNumber)) {
                                account.withdraw(money);
                                System.out.println("출금 완료. 현재 잔액: " + account.balance);
                                break;
                            }
                        }
                    } catch (BankOperationException | InvalidTransactionException e) {
                        System.out.println("출금 실패: " + e.getMessage());
                    }
                    break;
                }
                case 5: {
                    System.out.println("계좌 번호를 입력하세요.");
                    String accountNumber = sc.next();

                    try {
                        // 계좌 번호로 고객 찾기
                        Customer customer = bc.findCustomer(accountNumber);

                        // 해당 계좌의 잔액 출력
                        for (Account account : customer.accounts) {
                            if (account != null && account.accountNumber.equals(accountNumber)) {
                                System.out.println("현재 잔액: " + account.balance);
                                break;
                            }
                        }
                    } catch (BankOperationException e) {
                        System.out.println("잔액 조회 실패: " + e.getMessage());
                    }
                    break;
                }
                case 6:
                    System.out.println("시스템을 종료합니다.");
                    isRunning = false;
                    break;
                default:
                    System.out.println("번호를 다시 입력해주세요.");
            }
        }










        /*
        Account account = new Account("yun's bankBook", "123-45-678910-11", 1230000);
        try {
            account.deposit(100000);
            account.withdraw(100000);
            account.withdraw(2000000);
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
        */
    }
}
