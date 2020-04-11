public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankaccount=new BankAccount("12453",250000,"egeiper","egeiper@hotmail.com");
        bankaccount.depositFunds(50000);
        bankaccount.withdrawFunds(350000);
        System.out.println(bankaccount.getAccountnumber());
        System.out.println(bankaccount.getBalance());
        System.out.println(bankaccount.getEmail());
        System.out.println(bankaccount.getPhonenumber());


        ;
    }
}
