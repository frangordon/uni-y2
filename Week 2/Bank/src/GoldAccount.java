public class GoldAccount extends BasicAccount{

    private float minimum;

    public GoldAccount(String accountNumber, float balance, float minimum) {
        super(accountNumber, balance);
        this.minimum = minimum;
    }

    @Override
    public boolean withdraw(float amount) {
        if (getBalance() - amount < minimum){
            return false;
        }
        return super.withdraw(amount);
    }

}
