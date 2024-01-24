public class App {
    public static void main(String[] args) throws Exception {
        BankService myBankService=new BankService();
        int mySavingAccount=myBankService.createNewAccount("saving", 1000);
        int myInvestmentAccount=myBankService.createNewAccount("investment", 2000);
        System.out.println("Saving account balance is $"+myBankService.getAccountBalance(mySavingAccount));
        System.out.println("Investment account balance is $"+myBankService.getAccountBalance(myInvestmentAccount));

        myBankService.transferMoney(mySavingAccount, myInvestmentAccount,1);

        System.out.println("After money transfer......");
        System.out.println("Saving account balance is $"+myBankService.getAccountBalance(mySavingAccount));
        System.out.println("Investment account balance is $"+myBankService.getAccountBalance(myInvestmentAccount));

    }
}
