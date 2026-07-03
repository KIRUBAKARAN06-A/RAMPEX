package day_11.ClassTask;

public class BankingTset {
    public static void main(String [] args){
   BankAccount b1 = new BankAccount();
    b1.deposit(1000);
    b1.withdraw(500);
    System.out.println(b1.checkBalance());
    b1.setName("kiruba");
    //b1.accName="kiruba";
            System.out.println(b1.getName());
    }
}
class BankAccount {
   private String accName;
    int accNo;
   private float balance;
    public void deposit(float amount)
    {
        balance= balance + amount;
        System.out.println("Amount deposited "+ amount + "Rs,"+ "balance"+ balance);
    }
    public void withdraw(float amount)
    {
        balance= balance - amount;
        System.out.println("Amount withdraw "+ amount + "Rs,"+ "balance"+ balance);
    }
    public float checkBalance(){
        return balance;

    }
    public void setName(String name) {
        accName = name;
    }
    public String getName(){
        return accName;
    }

}
