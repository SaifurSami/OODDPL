public class SavingAccount implements Account {
    private int amount,getAccountNumber;
    SavingAccount(int amount){
        this.amount=amount;
        this.getAccountNumber=(int)(Math.random()*100);
        System.out.println("Saving account successfully created.");
    }
    public void deposit(int amount){
        this.amount+=amount;
        System.out.println("Successfully deposited $"+amount);
    }
    public void withdraw(int amount){
        this.amount-=amount;
        System.out.println("Successfully withdrawn $"+amount);
    }
    public void transfer(int amount,Account to){
        this.withdraw(amount);
        to.deposit(amount);
    }
    public int getAccountNumber(){
        return getAccountNumber;
    }
    public int getAmount(){
        return amount;
    }
}
