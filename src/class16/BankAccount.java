package class16;

public class BankAccount {

    private String username;
    private String password;
    int accountNumber;
    public String bankName;

   public void printBankName(){
       System.out.println(bankName);
    }

   private  void printUserName(){
        System.out.println(username);
    }



    void printAccountNumber(){
        System.out.println(accountNumber);
    }

}
