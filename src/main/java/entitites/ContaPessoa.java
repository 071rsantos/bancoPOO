package entitites;

public class ContaPessoa{
    private final int accountNumb;
    private String holder;
    private double balance;

    public ContaPessoa(int accountNumb, String holder, double inicialBalance) {
        this.accountNumb = accountNumb;
        this.holder = holder;
        deposit(inicialBalance);
    }

    public ContaPessoa(int accountNumb, String holder) {
        this.accountNumb = accountNumb;
        this.holder = holder;
    }

    public int getAccountNumb() {
        return accountNumb;
    }


    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double v){
        this.balance+=v;
    }
    public void withdraw(double v){
        this.balance-=v+5;
    }

    @Override
    public String toString() {
        return String.format("%10s", getAccountNumb())
                + String.format("%20s",getHolder())
                + String.format("%10s","$ ")
                + String.format("%.2f", getBalance());
    }
}
