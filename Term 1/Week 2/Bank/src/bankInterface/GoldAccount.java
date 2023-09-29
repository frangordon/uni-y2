package bankInterface;

public class GoldAccount implements BankAccount{

    private String accountNumber;
    private float balance;
    private float minimum;

    public GoldAccount(String accountNumber, float balance, float minimum){
        //assign the parameters to the fields
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.minimum = minimum;
    }

    @Override
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public float getBalance() {
        return balance;
    }

    @Override
    public void deposit(float amount) {
        balance = balance + amount;
    }

    @Override
    public boolean withdraw(float amount) {
        if (amount > balance){
            return false;
        }
        //won't put overall balance underneath minimum
        else if(balance - amount < minimum){
            return false;
        }
        balance = balance - amount;
        return true;
    }
}
