package bankInterface;

public interface BankAccount {

    // no fields or variables in here - that's in the actual implementations of the interface
    // no logic - this acts like a blueprint for when we build our implementation later

    void setAccountNumber(String accountNumber);
    void setBalance(float balance);
    String getAccountNumber();
    float getBalance();
    void deposit(float amount);
    boolean withdraw(float amount);

}
