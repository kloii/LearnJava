package inc.kaloe;

public class VipCustomer {
    private String name;
    private String email;
    private int creditLimit;

    public VipCustomer() {
        this("VIP Customer1", "vipcustomer1@bank.com", 1000000);
    }

    public VipCustomer(String name, String email) {
        this(name, email, 100000);
    }

    public VipCustomer(String name, String email, int creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getCreditLimit() {
        return creditLimit;
    }
}
