package ExceptionPractice.BankingSystem;

/*
[고객을 등록하고, 고객의 정보를 조회]

고객을 배열로 관리
고객을 추가하고 찾는 메서드를 제공
↳ 고객 등록 메서드(중복된 ID는 허용하지 않음)
 */

public class Bank {
    // ⭐고객 객체를 배열로 가지는 배열
    private Customer[] customers;
    // 현재 추가된 고객 수
    private int customerCNT;

    // ⭐Bank 클래스의 생성자가 객체가 만들어질 때 배열과 customerCNT를 초기화하도록 한다.
    public Bank() {
        this.customers = new Customer[100]; // 최대 100명의 고객
        this.customerCNT = 0;
    }

    //↳ 고객 추가 메서드
    // 고객 ID가 중복될 때 예외처리

    // BankOperationException을 **RuntimeException**으로 바꿔줬으므로
    // public void addCustomer(Customer customer) throws BankOperationException{
    public void addCustomer(Customer customer){
        for(Customer c : customers){
            if(c != null && c.customerID == customer.customerID) throw new BankOperationException("Customer already exists");
            customers[customerCNT] = customer;
            customerCNT++;
        }
    }

    // 고객 찾는 메서드
//    public void findCustomer(Customer customer) {
//        for(Customer c : customers){
//            if(c.customerID == customer.customerID) System.out.println(customer + "정보를 찾았습니다!");
//            else System.out.println("등록되지 않은 고객입니다.");
//        }
//    }

    // BankOperationException을 **RuntimeException**으로 바꿔줬으므로
    // public Customer findCustomer(String accountNumber) throws BankOperationException{
    public Customer findCustomer(String accountNumber){
        for(Customer c : customers){
            for(int i=0; i<c.accounts.length;i++){
                if (accountNumber.equals(c.accounts[i].accountNumber)) {
                    return c;
                }
            }
        }
        throw new BankOperationException("Customer does not exist");
    }
}
