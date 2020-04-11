public class BankAccount {
    private String accountnumber;
    private double balance;
    private String customername;
    private String email;
    private String phonenumber;

    public BankAccount(String accountnumber, double balance, String email, String phonenumber){
        this.accountnumber=accountnumber;
        this.balance=balance;
        this.email=email;
        this.phonenumber=phonenumber;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void depositFunds(double depositamount) {
        this.balance += depositamount;
        System.out.println("Deposit of " + depositamount + " processed. New balance: " + balance);
    }

    public void withdrawFunds(double withdrawamount) {
        if (this.balance - withdrawamount < 0) {

            System.out.println("Only " + this.balance + " is available in your account.");
        }
        else{
            this.balance -= withdrawamount;
            System.out.println("Withdrawal of " + withdrawamount+" processed. Remaining balance: " + this.balance);

        }
    }
}

