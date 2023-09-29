public class Bank {

    public static void main(String[] args) {
        BasicAccount account1 = new BasicAccount("FG1", 1000);
        GoldAccount account2 = new GoldAccount("FG2", 1000, 200);

        System.out.println(account1.withdraw(805));
        System.out.println(account2.withdraw(805));

        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
    }

}
