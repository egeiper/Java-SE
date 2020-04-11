public class VipCustomer {
    private String name;
    private int creditlimit;
    private String email;

    public VipCustomer() {
        this("Default name", 50000, "default@gmail.com");
    }

    public VipCustomer(String name, int creditlimit) {
        this(name, creditlimit, "unknown@gmail.com");
    }

    public VipCustomer(String name, int creditlimit, String email) {
        this.name = name;
        this.creditlimit = creditlimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditlimit() {
        return creditlimit;
    }

    public void setCreditlimit(int creditlimit) {
        this.creditlimit = creditlimit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
