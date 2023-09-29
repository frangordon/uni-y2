public class BasicAccount {

    //fields
    private String accountNumber;
    private float balance;

    //constructor
    public BasicAccount(String accountNumber, float balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    // this. specifies we are talking about the field and not the parameter

    //methods
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(float balance){
        this.balance = balance;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public float getBalance(){
        return this.balance;
    }

    public void deposit(float amount){
        balance = balance + amount;
    }
    // we do it like this rather than balance = amount because that would replace!! the balance

    public boolean withdraw(float amount){
        if (balance >= amount){
            balance = balance - amount;
            return true;
        }
        return false;
    }



}
