public interface Account {
    void deposit(int amount);
    void withdraw(int amount);
    void transfer(int amount,Account to);
    int getAccountNumber();
    int getAmount();
}
